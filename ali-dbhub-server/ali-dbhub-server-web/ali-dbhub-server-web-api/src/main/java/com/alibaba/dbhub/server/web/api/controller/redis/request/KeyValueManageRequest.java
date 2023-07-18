package com.alibaba.dbhub.server.web.api.controller.redis.request;

import javax.validation.constraints.NotNull;

import com.alibaba.dbhub.server.web.api.controller.data.source.request.DataSourceBaseRequest;
import com.alibaba.dbhub.server.web.api.controller.data.source.request.DataSourceBaseRequest;

import lombok.Data;

/**
 * @author moji
 * @version TableManageRequest.java, v 0.1 2022年09月16日 17:55 moji Exp $
 * @date 2022/09/16
 */
@Data
public class KeyValueManageRequest extends DataSourceBaseRequest {

    /**
     * redis ddl语句
     */
    @NotNull
    private String ddl;
}
