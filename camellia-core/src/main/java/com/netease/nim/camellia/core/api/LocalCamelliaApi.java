package com.netease.nim.camellia.core.api;

import com.netease.nim.camellia.core.model.ResourceTable;
import com.netease.nim.camellia.core.util.CheckUtil;
import com.netease.nim.camellia.core.util.ResourceTableUtil;

import java.util.UUID;

/**
 *
 * Created by caojiajun on 2019/12/13.
 */
public class LocalCamelliaApi implements CamelliaApi {

    private final ResourceTable resourceTable;
    private final String md5;

    public LocalCamelliaApi(ResourceTable resourceTable) {
        this.resourceTable = resourceTable;
        this.md5 = UUID.randomUUID().toString().replaceAll("-", "");
        boolean check = CheckUtil.checkResourceTable(resourceTable);
        if (!check) {
            throw new IllegalArgumentException("resourceTable check wrong");
        }
    }

    @Override
    public CamelliaApiResponse getResourceTable(Long bid, String bgroup, String md5) {
        CamelliaApiResponse response = new CamelliaApiResponse();
        if (md5 != null && md5.equals(this.md5)) {
            response.setCode(CamelliaApiCode.NOT_MODIFY.getCode());
            return response;
        }
        response.setCode(CamelliaApiCode.SUCCESS.getCode());
        response.setResourceTable(resourceTable);
        response.setMd5(this.md5);
        return response;
    }

    @Override
    public CamelliaApiV2Response getResourceTableV2(Long bid, String bgroup, String md5) {
        return ResourceTableUtil.toV2Response(getResourceTable(bid, bgroup, md5));
    }

    @Override
    public boolean reportStats(ResourceStats resourceStats) {
        return true;
    }

}
