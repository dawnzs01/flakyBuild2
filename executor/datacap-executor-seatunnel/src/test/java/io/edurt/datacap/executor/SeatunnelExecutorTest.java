package io.edurt.datacap.executor;

import io.edurt.datacap.spi.executor.Pipeline;
import io.edurt.datacap.spi.executor.PipelineField;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class SeatunnelExecutorTest
{
    private static final Set<String> supportOptions = new HashSet<String>()
    {{
        add("host");
        add("database");
        add("sql");
        add("username");
        add("password");
    }};
    private Pipeline pipeline;

    @Before
    public void before()
    {
        pipeline = new Pipeline();
        pipeline.setWork(System.getProperty("user.dir"));
        Properties properties = new Properties();
        properties.put("host", "127.0.0.1");
        properties.put("username", "root");
        properties.put("password", "123456");
        properties.put("database", "default");
        properties.put("sql", "SHOW DATABASES");

        PipelineField from = PipelineField.builder()
                .type("ClickHouse")
                .configure(properties)
                .supportOptions(supportOptions)
                .build();
        pipeline.setFrom(from);
        pipeline.setTo(PipelineField.builder().type("Console").build());
    }

    @Test
    public void start()
    {
        new SeatunnelExecutor().start(pipeline);
    }
}