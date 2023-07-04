/*
 * Tencent is pleased to support the open source community by making BK-JOB蓝鲸智云作业平台 available.
 *
 * Copyright (C) 2021 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-JOB蓝鲸智云作业平台 is licensed under the MIT License.
 *
 * License for BK-JOB蓝鲸智云作业平台:
 * --------------------------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.tencent.bk.job.backup.model.web;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @since 21/7/2020 21:17
 */
@Data
@ApiModel("作业导入信息")
public class ImportInfoVO {

    /**
     * 导出任务 ID
     */
    @ApiModelProperty("导出任务 ID")
    private String id;

    /**
     * 作业状态
     *
     * @see com.tencent.bk.job.backup.constant.BackupJobStatusEnum
     */
    @ApiModelProperty("作业状态 0-初始状态, 1-解析成功, 2-需要密码, 3-密码错误, 4-已提交, 5-处理中, 6-处理成功, 7-处理失败, 8-已取消")
    private Integer status;

    /**
     * 需要导入的模版信息列表
     *
     * @see BackupTemplateInfoVO
     */
    @ApiModelProperty(value = "需要导入的模版信息")
    private List<BackupTemplateInfoVO> templateInfo;

    /**
     * 日志信息列表
     *
     * @see LogEntityVO
     */
    @ApiModelProperty("日志信息")
    private List<LogEntityVO> log;

    /**
     * ID 名称对应关系表
     *
     * @see IdNameInfoVO
     */
    @ApiModelProperty(value = "ID 名称的对应信息")
    private IdNameInfoVO idNameInfo;
}
