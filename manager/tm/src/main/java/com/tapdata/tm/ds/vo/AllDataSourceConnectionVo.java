
package com.tapdata.tm.ds.vo;

import com.tapdata.tm.base.dto.ds.DsBaseDto;
import com.tapdata.tm.ds.bean.*;
import com.tapdata.tm.vo.BaseVo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 数据源连接
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AllDataSourceConnectionVo extends BaseVo {

    public static final String STATUS_INVALID = "invalid";
    public static final String STATUS_READY = "ready";

    /** 数据源连接名称 */
    private String name;
    /** 数据源的配置信息 jsonschema */
    private Object config;
    /** 连接类型 源，目标，源&目标 */
    private String connection_type;
    /** 对应DataSourceDefinition databasetype */
    private String database_type;
    private String status;

}
