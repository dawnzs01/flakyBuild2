package cn.monitor4all.logRecord.test.service;

import cn.monitor4all.logRecord.service.IOperatorIdGetService;

public class OperatorIdGetService implements IOperatorIdGetService {

    @Override
    public String getOperatorId() {
        return "操作人";
    }
}
