package com.hufudb.openhufu.data.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;
import com.hufudb.openhufu.data.schema.Schema;
import com.hufudb.openhufu.proto.OpenHuFuData.CellProto;
import com.hufudb.openhufu.proto.OpenHuFuData.ColumnDesc;
import com.hufudb.openhufu.proto.OpenHuFuData.ColumnType;
import com.hufudb.openhufu.proto.OpenHuFuData.RowProto;
import com.hufudb.openhufu.proto.OpenHuFuData.RowsProto;

public class ProtoRowDataSet implements MaterializedDataSet {
  final Schema schema;
  final RowsProto rows;
  final int rowCount;
  final List<Getter> getters;

  ProtoRowDataSet(Schema schema, RowsProto rows, List<Getter> getters) {
    this.schema = schema;
    this.rows = rows;
    this.getters = getters;
    this.rowCount = rows.getRowsCount();
  }

  @Override
  public Schema getSchema() {
    return schema;
  }

  @Override
  public DataSetIterator getIterator() {
    return new Iterator();
  }

  @Override
  public void close() {
    // do nothing
  }

  @Override
  public int rowCount() {
    return rowCount;
  }

  @Override
  public Object get(int rowIndex, int columnIndex) {
    final RowProto row = rows.getRows(rowIndex);
    ByteString isNull = row.getIsnull();
    if ((isNull.byteAt(columnIndex >> 3) & (1 << (columnIndex & 0x7))) != 0) {
      return null;
    } else {
      return getters.get(columnIndex).get(row);
    }
  }

  public List<byte[]> toBytes() {
    List<byte[]> results = new ArrayList<>(rowCount);
    for (int i = 0; i < rowCount; ++i) {
      results.add(rows.getRows(i).toByteArray());
    }
    return results;
  }

  static ProtoRowDataSet materializeInternal(List<ColumnDesc> descs, List<Integer> references, DataSetIterator it) {
    ImmutableList.Builder<Getter> getterBuilder = ImmutableList.builder();
    ImmutableList.Builder<Setter> setterBuilder = ImmutableList.builder();
    for (int j = 0; j < descs.size(); ++j) {
      ColumnType type = descs.get(j).getType();
      final int i = j;
      switch (type) {
        case BOOLEAN:
          getterBuilder.add((row) -> row.getCells(i).getBoolcel());
          setterBuilder.add(
              (row, value) -> row.setCells(i, CellProto.newBuilder().setBoolcel((boolean) value)));
          break;
        case BLOB:
          getterBuilder.add((row) -> row.getCells(i).getBytescel().toByteArray());
          setterBuilder.add((row, value) -> row.setCells(i,
              CellProto.newBuilder().setBytescel(ByteString.copyFrom((byte[]) value))));
          break;
        case STRING:
          getterBuilder.add((row) -> row.getCells(i).getStrcel());
          setterBuilder.add(
              (row, value) -> row.setCells(i, CellProto.newBuilder().setStrcel((String) value)));
          break;
        case FLOAT:
          getterBuilder.add((row) -> row.getCells(i).getF32Cel());
          setterBuilder.add(
              (row, value) -> row.setCells(i, CellProto.newBuilder().setF32Cel(((Number) value).floatValue())));
          break;
        case DOUBLE:
          getterBuilder.add((row) -> row.getCells(i).getF64Cel());
          setterBuilder.add(
              (row, value) -> row.setCells(i, CellProto.newBuilder().setF64Cel(((Number) value).doubleValue())));
          break;
        case BYTE:
        case SHORT:
        case TIME:
        case INT:
          getterBuilder.add((row) -> row.getCells(i).getI32Cel());
          setterBuilder
              .add((row, value) -> row.setCells(i, CellProto.newBuilder().setI32Cel(((Number) value).intValue())));
          break;
        case LONG:
        case DATE:
        case TIMESTAMP:
          getterBuilder.add((row) -> row.getCells(i).getI64Cel());
          setterBuilder
              .add((row, value) -> row.setCells(i, CellProto.newBuilder().setI64Cel(((Number) value).longValue())));
          break;
        default:
          throw new UnsupportedOperationException("Unsupported type for proto row dataset");
      }
    }
    List<Setter> setters = setterBuilder.build();
    final int columnNum = descs.size();
    RowsProto.Builder rows = RowsProto.newBuilder();
    RowProto.Builder rowBuilder = RowProto.newBuilder();
    for (int i = 0; i < columnNum; ++i) {
      rowBuilder.addCells(CellProto.newBuilder());
    }
    while (it.next()) {
      BitArray.Builder nullBuilder = BitArray.builder();
      for (int i = 0; i < columnNum; ++i) {
        Object v = it.get(references.get(i));
        if (v == null) {
          nullBuilder.add(true);
        } else {
          nullBuilder.add(false);
          setters.get(i).set(rowBuilder, v);
        }
      }
      rowBuilder.setIsnull(ByteString.copyFrom(nullBuilder.buildByteArray()));
      rows.addRows(rowBuilder.build());
    }
    return new ProtoRowDataSet(Schema.fromColumnDesc(descs), rows.build(), getterBuilder.build());
  }

  public static ProtoRowDataSet project(DataSet source, List<Integer> references) {
    final Schema schema = source.getSchema();
    List<ColumnDesc> descs = references.stream().map(ref -> schema.getColumnDesc(ref)).collect(Collectors.toList());
    return materializeInternal(descs, references, source.getIterator());
  }


  public static ProtoRowDataSet materialize(DataSet source) {
    List<Integer> refs = new ArrayList<>();
    for (int i = 0; i < source.getSchema().size(); ++i) {
      refs.add(i);
    }
    return materializeInternal(source.getSchema().getColumnDescs(), refs, source.getIterator());
  }

  class Iterator implements DataSetIterator {
    int pointer;

    Iterator() {
      pointer = -1;
    }

    @Override
    public Object get(int columnIndex) {
      final RowProto row = rows.getRows(pointer);
      ByteString isNull = row.getIsnull();
      if ((isNull.byteAt(columnIndex >> 3) & (1 << (columnIndex & 0x7))) != 0) {
        return null;
      } else {
        return getters.get(columnIndex).get(row);
      }
    }

    @Override
    public int size() {
      return schema.size();
    }

    @Override
    public boolean next() {
      pointer++;
      return pointer < rowCount;
    }
  }

  interface Getter {
    Object get(RowProto proto);
  }

  interface Setter {
    void set(RowProto.Builder builder, Object v);
  }
}
