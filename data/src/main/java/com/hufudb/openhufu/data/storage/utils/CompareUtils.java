package com.hufudb.openhufu.data.storage.utils;

public class CompareUtils {
  private static final int[][] funcTable = {
      {0, -1},
      {1, 0}
  };

  public static int compareTo(Object a, Object b) {
    boolean b1 = a != null;
    boolean b2 = b != null;
    return b1 && b2 ? ((Comparable) a).compareTo(b) : funcTable[b1 ? 1 : 0][b2 ? 1 : 0];
  }

  public static boolean equalTo(Object a, Object b) {
    boolean b1 = a != null;
    boolean b2 = b != null;
    return b1 && b2 ? a.equals(b) : funcTable[b1 ? 1 : 0][b2 ? 1 : 0] == 0;
  }
}
