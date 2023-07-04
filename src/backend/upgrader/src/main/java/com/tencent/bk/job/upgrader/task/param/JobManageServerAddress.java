package com.tencent.bk.job.upgrader.task.param;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public class JobManageServerAddress extends AbstractTaskParam {

    public JobManageServerAddress() {
        super(
            ParamNameConsts.INPUT_PARAM_JOB_MANAGE_SERVER_ADDRESS,
            "集群中任意一个job-manage实例对应的IP加端口地址，格式：ip:port，例如：127.0.0.1:10505",
            "IP and port of any one of job-manage service instances, format: ip:port，example: 127.0.0.1:10505"
        );
    }

    @Override
    public ParamCheckResult checkParam(String value) {
        if (StringUtils.isBlank(value)) {
            return new ParamCheckResult(false, "取值不可为空", "value cannot be empty");
        }
        return ParamCheckResult.ok();
    }
}
