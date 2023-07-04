package com.hufudb.openhufu.common.exception;

/**
 * @author yang.song
 * @date 2/7/23 8:28 PM
 */
public interface BaseException {

  public ErrorCode getErrorCode();

  public Object[] getArguments();
}
