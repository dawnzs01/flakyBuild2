package com.hufudb.openhufu.data.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.google.common.collect.ImmutableList;
import com.hufudb.openhufu.proto.OpenHuFuData.ColumnProto;
import com.hufudb.openhufu.proto.OpenHuFuData.DataSetProto;
import com.hufudb.openhufu.data.schema.Schema;

/**
 * Dataset which store data in protobuf, represented as data source, Immutable.
 */
final public class ProtoDataSet implements MaterializedDataSet {
  private final Schema schema;
  private final List<ProtoColumn> columns;
  private final int rowCount;

  ProtoDataSet(DataSetProto dataSet) {
    assert dataSet.getSchema().getColumnDescCount() == dataSet.getColumnCount();
    this.schema = Schema.fromProto(dataSet.getSchema());
    ImmutableList.Builder<ProtoColumn> cBuilder = ImmutableList.builder();
    for (int i = 0; i < dataSet.getColumnCount(); ++i) {
      cBuilder.add(new ProtoColumn(schema.getType(i), dataSet.getColumn(i)));
    }
    this.columns = cBuilder.build();
    if (columns.isEmpty()) {
      this.rowCount = 0;
    } else {
      this.rowCount = columns.get(0).size();
    }
  }

  public static ProtoDataSet create(DataSetProto dataSet) {
    return new ProtoDataSet(dataSet);
  }

  @Override
  public Schema getSchema() {
    return schema;
  }

  @Override
  public DataSetIterator getIterator() {
    return new SourceIterator();
  }

  @Override
  public void close() {
    // do nothing
  }

  @Override
  public Object get(int rowIndex, int columnIndex) {
    return columns.get(columnIndex).getObject(rowIndex);
  }

  @Override
  public int rowCount() {
    return rowCount;
  }

  public static ProtoDataSet materialize(DataSet dataSet) {
    if (dataSet instanceof ProtoDataSet) {
      return (ProtoDataSet) dataSet;
    }
    Builder builder = new Builder(dataSet.getSchema());
    DataSetIterator it = dataSet.getIterator();
    while (it.next()) {
      builder.addRow(it);
    }
    dataSet.close();
    return builder.build();
  }

  public static List<DataSetProto> slice(DataSet dataSet, int sliceSize) {
    Builder builder = new Builder(dataSet.getSchema());
    DataSetIterator it = dataSet.getIterator();
    int count = 0;
    List<DataSetProto> result = new ArrayList<>();
    while (it.next()) {
      builder.addRow(it);
      count++;
      if (count == sliceSize) {
        result.add(builder.buildProto());
        builder.clear();
        count = 0;
      }
    }
    if (count != 0) {
      result.add(builder.buildProto());
    }
    return result;
  }

  public static Builder newBuilder(Schema schema) {
    return new Builder(schema);
  }

  final class SourceIterator implements DataSetIterator {
    int pointer;

    SourceIterator() {
      pointer = -1;
    }

    @Override
    public boolean next() {
      pointer++;
      return pointer < rowCount;
    }

    @Override
    public Object get(int columnIndex) {
      return columns.get(columnIndex).getObject(pointer);
    }

    @Override
    public int size() {
      return schema.size();
    }
  }

  public static final class Builder {
    final Schema schema;
    final List<ProtoColumn.Builder> columns;
    final int columnSize;

    Builder(Schema schema) {
      this.schema = schema;
      this.columnSize = schema.getColumnDescs().size();
      ImmutableList.Builder<ProtoColumn.Builder> cBuilders = ImmutableList.builder();
      schema.getColumnDescs().forEach(col -> cBuilders.add(ProtoColumn.newBuilder(col.getType())));
      this.columns = cBuilders.build();
    }

    public void addRow(Row row) {
      for (int i = 0; i < columnSize; ++i) {
        columns.get(i).add(row.get(i));
      }
    }

    public void clear() {
      columns.stream().forEach(c -> c.clear());
    }

    public DataSetProto buildProto() {
      List<ColumnProto> columnProtos = columns.stream().map(c -> c.buildProto()).collect(Collectors.toList());
      return DataSetProto.newBuilder().setSchema(schema.toProto()).addAllColumn(columnProtos).build();
    }

    public ProtoDataSet build() {
      return new ProtoDataSet(buildProto());
    }
  }
}
