package com.hufudb.openhufu.user;

import com.csvreader.CsvReader;
import com.hufudb.openhufu.data.storage.ArrayRow;
import com.hufudb.openhufu.data.storage.utils.CompareUtils;
import com.hufudb.openhufu.proto.OpenHuFuData.ColumnType;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultDataSet {
  private final List<ArrayRow> realAnswer;
  private final List<ArrayRow> output;

  public ResultDataSet() {
    realAnswer = new ArrayList<>();
    output = new ArrayList<>();
  }

  private int compare(ArrayRow row1, ArrayRow row2) {
    int compareResult = 0;
    assert row1.size() == row2.size();
    for (int i = 0; i < row1.size(); i++) {
      Object r1e = row1.get(i);
      Object r2e = row2.get(i);
      compareResult = CompareUtils.compareTo(r1e, r2e);
      if ((row1.get(i) instanceof Float) || (row1.get(i) instanceof Double)) {
        double x = (Double) row1.get(i);
        double y = (Double) row2.get(i);
        if (Math.abs(x - y) < 1e-5) {
          compareResult = 0;
        }
      }
      if (compareResult != 0) {
        return compareResult;
      }
    }
    return compareResult;
  }

  private void sort() {
    realAnswer.sort(this::compare);
    output.sort(this::compare);
  }

  public boolean compareWithOrder() {
    if (realAnswer.size() != output.size()) {
      return false;
    }
    for (int i = 0; i < realAnswer.size(); i++) {
      if (compare(realAnswer.get(i), output.get(i)) != 0) {
        return false;
      }
    }
    return true;
  }

  public boolean compareWithoutOrder() {
    sort();
    return compareWithOrder();
  }

  void addRealAnswer(String csvPath, List<ColumnType> header) {
    ClassLoader classLoader = OpenHuFuUserTest.class.getClassLoader();
    URL resource = classLoader.getResource(csvPath);
    try {
      ArrayList<String[]> csvFileList = new ArrayList<>();
      assert resource != null;
      CsvReader reader = new CsvReader(resource.getPath(), ',', StandardCharsets.UTF_8);
      reader.readHeaders();
      while (reader.readRecord()) {
        csvFileList.add(reader.getValues());
      }
      reader.close();
      for (int i = 0; i < csvFileList.size(); i++) {
        ArrayRow.Builder builder = ArrayRow.newBuilder(csvFileList.get(0).length);
        for (int j = 0; j < csvFileList.get(0).length; j++) {
          switch (header.get(j)) {
            case BYTE:
              builder.set(j, Byte.valueOf(csvFileList.get(i)[j]));
              break;
            case SHORT:
              builder.set(j, Short.valueOf(csvFileList.get(i)[j]));
              break;
            case INT:
              builder.set(j, Integer.valueOf(csvFileList.get(i)[j]));
              break;
            case TIME:
            case DATE:
            case TIMESTAMP:
            case LONG:
              builder.set(j, Long.valueOf(csvFileList.get(i)[j]));
              break;
            case FLOAT:
              builder.set(j, Float.valueOf(csvFileList.get(i)[j]));
              break;
            case DOUBLE:
              builder.set(j, Double.valueOf(csvFileList.get(i)[j]));
              break;
            case STRING:
              builder.set(j, csvFileList.get(i)[j]);
              break;
            case BOOLEAN:
              builder.set(j, Boolean.valueOf(csvFileList.get(i)[j]));
              break;
            default:
              throw new RuntimeException("not support this type");
          }
        }
        addRealAnswer(builder.build());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  void addRealAnswer(ArrayRow row) {
    realAnswer.add(row);
  }

  void  addOutput(ResultSet rs){
    try {
      while (rs.next()) {
        ArrayRow.Builder builder = ArrayRow.newBuilder(rs.getMetaData().getColumnCount());
        for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
          builder.set(i, rs.getObject(i + 1));
        }
        addOutput(builder.build());
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  void addOutput(ArrayRow row) {
    output.add(row);
  }
}
