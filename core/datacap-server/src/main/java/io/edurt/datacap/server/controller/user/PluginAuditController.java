package io.edurt.datacap.server.controller.user;

import io.edurt.datacap.common.response.CommonResponse;
import io.edurt.datacap.service.body.FilterBody;
import io.edurt.datacap.service.entity.PageEntity;
import io.edurt.datacap.service.entity.PluginAuditEntity;
import io.edurt.datacap.service.service.PluginAuditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/audit/plugin")
public class PluginAuditController
{
    private final PluginAuditService pluginAuditService;

    public PluginAuditController(PluginAuditService pluginAuditService)
    {
        this.pluginAuditService = pluginAuditService;
    }

    @GetMapping
    @Deprecated
    public CommonResponse<PageEntity<PluginAuditEntity>> getAll(@RequestParam(value = "page", defaultValue = "1") int start,
            @RequestParam(value = "size", defaultValue = "10") int end)
    {
        return this.pluginAuditService.getAll(start, end);
    }

    @PostMapping
    public CommonResponse<PageEntity<PluginAuditEntity>> getAllByFilter(@RequestBody FilterBody filter)
    {
        return this.pluginAuditService.getAllByFilter(filter);
    }

    @GetMapping(value = "{id}")
    public CommonResponse<PluginAuditEntity> getInfo(@PathVariable(value = "id") Long id)
    {
        return this.pluginAuditService.getById(id);
    }
}
