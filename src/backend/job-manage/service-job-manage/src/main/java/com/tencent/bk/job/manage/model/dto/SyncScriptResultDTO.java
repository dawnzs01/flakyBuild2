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

package com.tencent.bk.job.manage.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 脚本同步结果
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SyncScriptResultDTO {
    private ScriptSyncTemplateStepDTO templateStep;
    private boolean success;
    private Integer errorCode;

    public static SyncScriptResultDTO buildSuccessSyncResult(ScriptSyncTemplateStepDTO templateStep) {
        SyncScriptResultDTO result = new SyncScriptResultDTO();
        result.success = true;
        result.templateStep = templateStep;
        return result;
    }

    public static SyncScriptResultDTO buildFailSyncResult(ScriptSyncTemplateStepDTO templateStep, Integer errorCode) {
        SyncScriptResultDTO result = new SyncScriptResultDTO();
        result.success = false;
        result.templateStep = templateStep;
        result.errorCode = errorCode;
        return result;
    }
}
