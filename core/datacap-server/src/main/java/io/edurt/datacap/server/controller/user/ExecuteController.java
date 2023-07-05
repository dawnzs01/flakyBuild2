package io.edurt.datacap.server.controller.user;

import io.edurt.datacap.common.response.CommonResponse;
import io.edurt.datacap.service.body.ExecuteDslBody;
import io.edurt.datacap.service.entity.ExecuteEntity;
import io.edurt.datacap.service.service.ExecuteService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/api/v1/execute")
public class ExecuteController
{
    private final ExecuteService executeService;

    public ExecuteController(ExecuteService executeService)
    {
        this.executeService = executeService;
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CommonResponse<Object> execute(@RequestBody ExecuteEntity configure)
    {
        return this.executeService.execute(configure);
    }

    @PostMapping(value = {"dsl"})
    public CommonResponse<Object> executeDsl(@RequestBody ExecuteDslBody configure)
    {
        return this.executeService.execute(configure);
    }
}
