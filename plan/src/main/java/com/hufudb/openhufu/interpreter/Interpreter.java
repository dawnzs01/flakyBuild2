package com.hufudb.openhufu.interpreter;

import com.hufudb.openhufu.data.function.AggregateFunction;
import com.hufudb.openhufu.data.function.Aggregator;
import com.hufudb.openhufu.data.function.Filter;
import com.hufudb.openhufu.data.function.Mapper;
import com.hufudb.openhufu.data.function.Matcher;
import com.hufudb.openhufu.data.schema.Schema;
import com.hufudb.openhufu.data.storage.AggDataSet;
import com.hufudb.openhufu.data.storage.DataSet;
import com.hufudb.openhufu.data.storage.FilterDataSet;
import com.hufudb.openhufu.data.storage.JoinDataSet;
import com.hufudb.openhufu.data.storage.MapDataSet;
import com.hufudb.openhufu.data.storage.Row;
import com.hufudb.openhufu.data.storage.utils.CompareUtils;
import com.hufudb.openhufu.expression.AggregateFunctions;
import com.hufudb.openhufu.expression.ExpressionUtils;
import com.hufudb.openhufu.expression.GroupAggregator;
import com.hufudb.openhufu.expression.ScalarFuncType;
import com.hufudb.openhufu.expression.SingleAggregator;
import com.hufudb.openhufu.proto.OpenHuFuData.ColumnType;
import com.hufudb.openhufu.proto.OpenHuFuPlan;
import com.hufudb.openhufu.proto.OpenHuFuPlan.Expression;
import com.hufudb.openhufu.proto.OpenHuFuPlan.JoinCondition;
import com.hufudb.openhufu.proto.OpenHuFuPlan.OperatorType;
import com.hufudb.openhufu.udf.UDFLoader;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Interpret expressions as different types of datasets
 */
public class Interpreter {
  public static final Logger LOG = LoggerFactory.getLogger(Interpreter.class);

  /**
   * filter the source dataset by condition expressions
   */
  public static DataSet filter(DataSet source, List<Expression> conditions) {
    if (conditions.isEmpty()) {
      return source;
    } else {
      final Expression condition = ExpressionUtils.conjunctCondition(conditions);
      return new FilterDataSet(source, new InterpretiveFilter(source.getSchema(), condition));
    }
  }

  /**
   * map the dataset by specified expressions
   */
  public static DataSet map(DataSet source, List<Expression> exps) {
    if (exps.isEmpty()) {
      return source;
    } else {
      // DirectMapping means nothing has changed during the mapping, e.g. (A,B,C) ->
      // (A,B,C)
      boolean isDirectMapping = exps.size() == source.getSchema().size();
      if (isDirectMapping) {
        for (int i = 0; i < exps.size(); ++i) {
          Expression exp = exps.get(i);
          if (!(exp.getOpType().equals(OperatorType.REF) && exp.getI32() == i)) {
            isDirectMapping = false;
            break;
          }
        }
        if (isDirectMapping) {
          return source;
        }
      }
      final Schema sourceSchema = source.getSchema();
      final Schema outSchema = ExpressionUtils.createSchema(exps);
      List<Mapper> maps = exps.stream().map(exp -> new InterpretiveMapper(sourceSchema, exp))
          .collect(Collectors.toList());
      return MapDataSet.create(outSchema, maps, source);
    }
  }

  /**
   * aggregate the dataset with groups and aggregate epxressions
   */
  public static DataSet aggregate(DataSet source, List<Integer> groups, List<Expression> aggs) {
    if (aggs.isEmpty()) {
      return source;
    } else {
      // we convert every aggregate Expression into AggregateFunction
      List<AggregateFunction<Row, Comparable>> funcs = AggregateFunctions.createAggregateFunction(aggs);
      Aggregator aggregator = null;
      // outSchema represents what the expected output looks like
      final Schema outSchema = ExpressionUtils.createSchema(aggs);
      if (groups.isEmpty()) {
        aggregator = new SingleAggregator(outSchema, funcs);
      } else {
        aggregator = new GroupAggregator(outSchema, groups, funcs);
      }
      return AggDataSet.create(outSchema, aggregator, source);
    }
  }

  public static DataSet join(DataSet left, DataSet right, JoinCondition condition) {
    return JoinDataSet.create(left, right,
        new InterpretiveMatcher(condition, left.getSchema(), right.getSchema()), condition.getType());
  }

  public static class InterpretiveFilter implements Filter {
    final Schema schema;
    final Expression condition;

    public InterpretiveFilter(Schema schema, Expression condition) {
      this.schema = schema;
      this.condition = condition;
    }

    @Override
    public boolean filter(Row row) {
      return Boolean.TRUE == implement(row, condition);
    }
  }

  /**
   * represents mapping relationship by specified Expression and Schema
   */
  public static class InterpretiveMapper implements Mapper {
    final Schema schema;
    final Expression exp;

    public InterpretiveMapper(Schema schema, Expression exp) {
      this.schema = schema;
      this.exp = exp;
    }

    @Override
    public Object map(Row row) {
      Object r = implement(row, exp);
      if (r instanceof Number) {
        return cast(exp.getOutType(), (Number) r);
      }
      return r;
    }
  }

  public static class InterpretiveMatcher implements Matcher {
    final List<Integer> leftKeys;
    final List<Integer> rightKeys;
    final Expression condition;
    final Schema left;
    final Schema right;

    final OpenHuFuPlan.JoinType joinType;

    InterpretiveMatcher(JoinCondition joinCond, Schema left, Schema right) {
      // todo: support left/right/outer join
      this.leftKeys = joinCond.getLeftKeyList();
      this.rightKeys = joinCond.getRightKeyList();
      this.condition = joinCond.getCondition();
      this.joinType = joinCond.getType();
      this.left = left;
      this.right = right;
    }

    @Override
    public boolean match(Row r1, Row r2) {
      int size = leftKeys.size();
      for (int i = 0; i < size; ++i) {
        int lk = leftKeys.get(i);
        int rk = rightKeys.get(i);
        Object le = r1.get(lk);
        Object re = r2.get(rk);
        // todo: consider left/right/outer join
        if (le == null) {
          return false;
        }
        if (re == null) {
          return false;
        }
        if (!re.equals(le)) {
          return false;
        }
      }
      if (condition.getOpType().equals(OperatorType.NONE)) {
        return true;
      } else {
        // todo: consider null case
        Row row = new MergedRow(r1, r2, left.size(), left.size() + right.size());
        return (boolean) implement(row, condition);
      }
    }
  }

  public static class MergedRow implements Row {
    final Row left;
    final Row right;
    final int leftSize;
    final int rowSize;

    public MergedRow(Row left, Row right, int leftSize, int rowSize) {
      this.left = left;
      this.right = right;
      this.leftSize = leftSize;
      this.rowSize = rowSize;
    }

    @Override
    public Object get(int columnIndex) {
      if (columnIndex < leftSize) {
        return left.get(columnIndex);
      } else {
        return right.get(columnIndex - leftSize);
      }
    }

    @Override
    public int size() {
      return rowSize;
    }
  }

  public static Object implement(Row row, Expression e) {
    final List<Expression> inputs = e.getInList();
    final OperatorType type = e.getOpType();
    switch (type) {
      case REF:
        return row.get(e.getI32());
      case LITERAL:
        return ExpressionUtils.getLiteral(e);
      case AND:
      case OR:
      case NOT:
        return calBoolean(row, type, inputs);
      case GT:
      case GE:
      case LT:
      case LE:
      case EQ:
      case NE:
        return calCompare(row, type, inputs);
      case PLUS:
      case MINUS:
      case TIMES:
      case DIVIDE:
      case MOD:
      case PLUS_PRE:
      case MINUS_PRE:
        return calculate(row, type, inputs);
      case AS:
        return implement(row, inputs.get(0));
      case IS_NULL:
        return implement(row, inputs.get(0)) == null;
      case IS_NOT_NULL:
        return implement(row, inputs.get(0)) != null;
      case LIKE:
        return calLike(row, e);
      case CASE:
        for (int i = 1; i < inputs.size(); i += 2) {
          if ((Boolean) implement(row, inputs.get(i - 1))) {
            return implement(row, inputs.get(i));
          }
        }
        return implement(row, inputs.get(inputs.size() - 1));
      case SCALAR_FUNC:
        return calScalarFunc(row, e);
      default:
        throw new UnsupportedOperationException(String.format("operator %s not support in interpreter", type));
    }
  }

  private static boolean calLike(Row row, Expression exp) {
    String JAVA_REGEX_SPECIALS = "[]()|^-+*?{}$\\.";
    List<Expression> inputs = exp.getInList();
    String sqlPattern = (String) implement(row, inputs.get(1));
    String target = ((String) implement(row, inputs.get(0)));

    int i;
    final int len = sqlPattern.length();
    final StringBuilder javaPattern = new StringBuilder(len + len);
    for (i = 0; i < len; i++) {
      char c = sqlPattern.charAt(i);
      if (JAVA_REGEX_SPECIALS.indexOf(c) >= 0) {
        javaPattern.append('\\');
      }
      if (c == '_') {
        javaPattern.append('.');
      } else if (c == '%') {
        javaPattern.append("(?s:.*)");
      } else {
        javaPattern.append(c);
      }
    }

    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(javaPattern.toString());
    java.util.regex.Matcher matcher = pattern.matcher(target);

    if (matcher.find()) {
      return true;
    } else {
      return false;
    }
  }

  private static Object calScalarFunc(Row row, Expression exp) {
    List<Object> inputs = exp.getInList().stream().map(e -> implement(row, e)).collect(Collectors.toList());
    String funcName = exp.getStr();
    if (ScalarFuncType.support(funcName)) {
      ScalarFuncType func = ScalarFuncType.of(exp.getStr());
      switch (func) {
        case ABS:
          if (inputs.size() != 1) {
            throw new RuntimeException("ABS need 1 argument, but given " + inputs.size());
          }
          if (!(inputs.get(0) instanceof Number)) {
            throw new RuntimeException("ABS expect (Number)");
          }
          Number x = (Number) inputs.get(0);
          return Math.abs(x.doubleValue());
        default:
          throw new RuntimeException("can't translate scalarFunc " + exp);
      }
    }
    return UDFLoader.implementScalar(funcName, inputs);
  }

  private static Boolean calBoolean(Row row, OperatorType type, List<Expression> inputs) {
    switch (type) {
      case AND: {
        Object left = implement(row, inputs.get(0));
        if (Boolean.FALSE.equals(left)) {
          return false;
        }
        Object right = implement(row, inputs.get(1));
        if (Boolean.FALSE.equals(right)) {
          return false;
        } else if (left == null || right == null) {
          return null;
        } else {
          return true;
        }
      }
      case OR: {
        Object left = implement(row, inputs.get(0));
        if (Boolean.TRUE.equals(left)) {
          return true;
        }
        Object right = implement(row, inputs.get(1));
        if (Boolean.TRUE.equals(right)) {
          return true;
        } else if (left == null || right == null) {
          return null;
        } else {
          return false;
        }
      }
      case NOT: {
        Object v = implement(row, inputs.get(0));
        if (v == null) {
          return null;
        } else {
          return !(boolean) v;
        }
      }
      default:
        throw new UnsupportedOperationException("not support bool operator");
    }
  }

  private static Boolean calCompare(Row row, OperatorType type, List<Expression> inputs) {
    Object left = implement(row, inputs.get(0));
    Object right = implement(row, inputs.get(1));
    if (left == null || right == null) {
      return null;
    }
    ColumnType dType = dominate(inputs.get(0).getOutType(), inputs.get(1).getOutType());
    final int cmp = CompareUtils.compareTo(cast(dType,left), cast(dType, right));
    switch (type) {
      case GT:
        return cmp > 0;
      case GE:
        return cmp >= 0;
      case LT:
        return cmp < 0;
      case LE:
        return cmp <= 0;
      case EQ:
        return cmp == 0;
      case NE:
        return cmp != 0;
      default:
        throw new UnsupportedOperationException("not support compare type");
    }
  }

  /**
   * type conversion mechanism
   */
  private static ColumnType dominate(ColumnType a, ColumnType b) {
    if (a.getNumber() > b.getNumber()) {
      return a;
    } else {
      return b;
    }
  }

  private static Number calculate(Row row, OperatorType type, List<Expression> inputExps) {
    List<Number> inputs = inputExps.stream().map(e -> (Number) implement(row, e)).collect(Collectors.toList());
    ColumnType calType = inputExps.stream().reduce(ColumnType.INT,
        (d, t) -> dominate(d, t.getOutType()), (t1, t2) -> dominate(t1, t2));
    for (Object in : inputs) {
      if (in == null) {
        return null;
      }
    }
    switch (calType) {
      case INT:
        return calInt(type, inputs);
      case LONG:
        return calLong(type, inputs);
      case FLOAT:
        return calFloat(type, inputs);
      case DOUBLE:
        return calDouble(type, inputs);
      default:
        throw new UnsupportedOperationException("not support column type");
    }
  }

  private static int calInt(OperatorType type, List<Number> inputs) {
    switch (type) {
      case PLUS:
        return inputs.get(0).intValue() + inputs.get(1).intValue();
      case MINUS:
        return inputs.get(0).intValue() - inputs.get(1).intValue();
      case TIMES:
        return inputs.get(0).intValue() * inputs.get(1).intValue();
      case DIVIDE:
        return inputs.get(0).intValue() / inputs.get(1).intValue();
      case MOD:
        return inputs.get(0).intValue() % inputs.get(1).intValue();
      case PLUS_PRE:
        return inputs.get(0).intValue();
      case MINUS_PRE:
        return -inputs.get(0).intValue();
      default:
        throw new UnsupportedOperationException("not support op type");
    }
  }

  private static long calLong(OperatorType type, List<Number> inputs) {
    switch (type) {
      case PLUS:
        return inputs.get(0).longValue() + inputs.get(1).longValue();
      case MINUS:
        return inputs.get(0).longValue() - inputs.get(1).longValue();
      case TIMES:
        return inputs.get(0).longValue() * inputs.get(1).longValue();
      case DIVIDE:
        return inputs.get(0).longValue() / inputs.get(1).longValue();
      case MOD:
        return inputs.get(0).longValue() % inputs.get(1).longValue();
      case PLUS_PRE:
        return inputs.get(0).longValue();
      case MINUS_PRE:
        return -inputs.get(0).longValue();
      default:
        throw new UnsupportedOperationException("not support op type");
    }
  }

  private static float calFloat(OperatorType type, List<Number> inputs) {
    switch (type) {
      case PLUS:
        return inputs.get(0).floatValue() + inputs.get(1).floatValue();
      case MINUS:
        return inputs.get(0).floatValue() - inputs.get(1).floatValue();
      case TIMES:
        return inputs.get(0).floatValue() * inputs.get(1).floatValue();
      case DIVIDE:
        return inputs.get(0).floatValue() / inputs.get(1).floatValue();
      case MOD:
        return inputs.get(0).floatValue() % inputs.get(1).floatValue();
      case PLUS_PRE:
        return inputs.get(0).floatValue();
      case MINUS_PRE:
        return -inputs.get(0).floatValue();
      default:
        throw new UnsupportedOperationException("not support op type");
    }
  }

  private static double calDouble(OperatorType type, List<Number> inputs) {
    switch (type) {
      case PLUS:
        return inputs.get(0).doubleValue() + inputs.get(1).doubleValue();
      case MINUS:
        return inputs.get(0).doubleValue() - inputs.get(1).doubleValue();
      case TIMES:
        return inputs.get(0).doubleValue() * inputs.get(1).doubleValue();
      case DIVIDE:
        return inputs.get(0).doubleValue() / inputs.get(1).doubleValue();
      case MOD:
        return inputs.get(0).doubleValue() % inputs.get(1).doubleValue();
      case PLUS_PRE:
        return inputs.get(0).doubleValue();
      case MINUS_PRE:
        return -inputs.get(0).doubleValue();
      default:
        throw new UnsupportedOperationException("not support op type");
    }
  }

  public static Object cast(ColumnType type, Object value) {
    if (value == null) {
      return null;
    }
    // todo: support cast more types
    switch (type) {
      case BYTE:
      case SHORT:
      case INT:
        return ((Number) value).intValue();
      case LONG:
        return ((Number) value).longValue();
      case FLOAT:
        return ((Number) value).floatValue();
      case DOUBLE:
        return ((Number) value).doubleValue();
      case DATE:
      case TIME:
      case TIMESTAMP:
      default:
        return value;
    }
  }
}
