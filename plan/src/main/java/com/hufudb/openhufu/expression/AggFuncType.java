package com.hufudb.openhufu.expression;

import com.google.common.collect.ImmutableMap;

public enum AggFuncType {
  GROUPKEY("GROUPKEY", 0), // used for group by key
  COUNT("COUNT", 1),
  AVG("AVG", 2),
  MAX("MAX", 3),
  MIN("MIN", 4),
  SUM("SUM", 5),
  KNN("KNN", 100),
  UNSUPPORT("UNSUPPORT", 1000);

  private final static ImmutableMap<Integer, AggFuncType> MAP;

  static {
    final ImmutableMap.Builder<Integer, AggFuncType> builder = ImmutableMap.builder();
    for (AggFuncType func : values()) {
      builder.put(func.getId(), func);
    }
    MAP = builder.build();
  }

  private final String name;
  private final int id;

  AggFuncType(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public static AggFuncType of(int id) {
    return MAP.get(Math.abs(id));
  }

  /**
   * aggregate func with distinct such as count(distinct col_name)
   *
   * @param id
   * @return
   */
  public static boolean isDistinct(int id) {
    return id < 0;
  }

  public static boolean isAllowedOnPrivate(int id) {
    return id == AVG.id || id == COUNT.id || id == SUM.id || id == MAX.id || id == MIN.id
        || id == KNN.id;
  }
}
