package com.huifengzhao.common.log;

public enum LogType {
    /**
     * 记录日志的对象
     */
    SQL,
    SQL_ERROR,
    CONTROL,
    CONTROL_ERROR,
    REQUEST,
    REQUEST_ERROR,
    DEFAULT,
    ERROR;

    private LogType() {
    }
}
