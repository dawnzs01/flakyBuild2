package com.netease.nim.camellia.core.api;

import com.netease.nim.camellia.core.conf.FileBasedCamelliaConfig;
import com.netease.nim.camellia.core.model.ResourceTable;
import com.netease.nim.camellia.core.util.ResourceTableUtil;
import com.netease.nim.camellia.tools.utils.MD5Util;
import com.netease.nim.camellia.core.util.ReadableResourceTableUtil;

/**
 * Created by caojiajun on 2022/11/16
 */
public class FileBasedCamelliaApi implements CamelliaApi {

    private final FileBasedCamelliaConfig feignConfig;

    public FileBasedCamelliaApi(FileBasedCamelliaConfig feignConfig) {
        this.feignConfig = feignConfig;
    }

    @Override
    public CamelliaApiResponse getResourceTable(Long bid, String bgroup, String md5) {
        String string = feignConfig.getString(bid + "." + bgroup + ".camellia.resource.table", null);
        if (string == null) {
            CamelliaApiResponse response = new CamelliaApiResponse();
            response.setCode(CamelliaApiCode.NOT_EXISTS.getCode());
            return response;
        }
        String newMd5 = MD5Util.md5(string);
        if (newMd5.equals(md5)) {
            CamelliaApiResponse response = new CamelliaApiResponse();
            response.setCode(CamelliaApiCode.NOT_MODIFY.getCode());
            return response;
        }
        ResourceTable resourceTable = ReadableResourceTableUtil.parseTable(string);
        CamelliaApiResponse response = new CamelliaApiResponse();
        response.setCode(CamelliaApiCode.SUCCESS.getCode());
        response.setResourceTable(resourceTable);
        response.setMd5(newMd5);
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
