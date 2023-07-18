package com.tapdata.tm.commons.schema.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SourceTypeEnum {
    SOURCE("物理表"),
    VIRTUAL("虚拟表");

    private final String typeName;
}
