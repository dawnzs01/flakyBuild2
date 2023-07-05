package io.edurt.datacap.server.controller.admin;

import io.edurt.datacap.common.response.CommonResponse;
import io.edurt.datacap.service.body.FilterBody;
import io.edurt.datacap.service.body.FunctionsImportBody;
import io.edurt.datacap.service.entity.FunctionsEntity;
import io.edurt.datacap.service.entity.PageEntity;
import io.edurt.datacap.service.service.FunctionsService;
import io.edurt.datacap.service.validation.ValidationGroup;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/admin/function")
public class FunctionsController
{
    private final FunctionsService functionsService;

    public FunctionsController(FunctionsService functionsService)
    {
        this.functionsService = functionsService;
    }

    @PostMapping(value = "list")
    public CommonResponse<PageEntity<FunctionsEntity>> getAllByFilter(@RequestBody FilterBody filter)
    {
        return this.functionsService.getAllByFilter(filter);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CommonResponse<FunctionsEntity> save(@RequestBody @Validated(ValidationGroup.Crud.Create.class) FunctionsEntity configure)
    {
        return this.functionsService.saveOrUpdate(configure);
    }

    @PutMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CommonResponse<FunctionsEntity> update(@RequestBody @Validated(ValidationGroup.Crud.Update.class) FunctionsEntity configure)
    {
        return this.functionsService.saveOrUpdate(configure);
    }

    @GetMapping(value = "{id}")
    public CommonResponse<FunctionsEntity> getInfo(@PathVariable(value = "id") Long id)
    {
        return this.functionsService.getById(id);
    }

    @PutMapping(value = "import")
    public CommonResponse<Object> batchImport(@RequestBody @Validated FunctionsImportBody configure)
    {
        return this.functionsService.batchImport(configure);
    }

    @GetMapping(value = "list/{plugin}")
    public CommonResponse<PageEntity<FunctionsEntity>> getAllByPlugin(@PathVariable(value = "plugin") String plugin)
    {
        return this.functionsService.getAllByPlugin(plugin);
    }
}
