package io.edurt.datacap.server.controller.user;

import io.edurt.datacap.common.response.CommonResponse;
import io.edurt.datacap.service.service.SourceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/source/admin")
public class SourceAdminController
{
    private final SourceService sourceService;

    public SourceAdminController(SourceService sourceService)
    {
        this.sourceService = sourceService;
    }

    @GetMapping(value = "count")
    public CommonResponse<Long> count()
    {
        return this.sourceService.count();
    }
}
