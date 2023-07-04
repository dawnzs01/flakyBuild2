package com.hufudb.openhufu.data.storage.utils;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Simple Date Utils without consideration of time zone
 */
public class DateUtils {
  final static int DAY_MASK = 0x1F;
  final static int DAY_OFFSET = 5;
  final static int MONTH_MASK = 0xF;
  final static int MONTH_OFFSET = 4;
  final static long MSFORDAY = 86400000L;
  final static TimeZone DEFAULT_ZONE = TimeZone.getDefault();
  final static TimeZone GMT = TimeZone.getTimeZone("GMT");

  private DateUtils() {}

  /**
   * convert date into long
   */
  public static long dateToLong(Date date) {
    return date.getTime();
  }

  /**
   * convert calendar into date long
   */
  public static long calendarToDateLong(Calendar calendar) {
    return calendar.getTimeInMillis() - (long) DEFAULT_ZONE.getRawOffset();
  }

  /**
   * convert long to date
   */
  public static Date longToDate(long dint) {
    return new Date(dint + (long) DEFAULT_ZONE.getRawOffset());
  }

  /**
   * convert time to int
   */
  public static int timeToInt(Time time) {
    return (int) ((time.getTime()) % MSFORDAY);
  }

  /**
   * precondition: calendar in UTC timeZone
   * convert calendar into time integer
   */
  public static int calendarToTimeInt(Calendar calendar) {
    return (int) ((calendar.getTimeInMillis()  - (long) DEFAULT_ZONE.getRawOffset()) % MSFORDAY);
  }

  /**
   * convert encoded int to time
   */
  public static Time intToTime(int t) {
    return new Time(((long) t) % MSFORDAY);
  }

  /**
   * convert timestamp to long
   */
  public static long timestampToLong(Timestamp ts) {
    return ts.getTime();
  }

  /**
   * convert calendar into time integer
   */
  public static long calendarToTimestampLong(Calendar calendar) {
    return calendar.getTimeInMillis() - (long) DEFAULT_ZONE.getRawOffset();
  }

  /**
   * convert long to timestamp
   */
  public static Timestamp longToTimestamp(long ts) {
    return new Timestamp(ts);
  }
}
