package io.edurt.datacap.lib.shell.process;

import ch.qos.logback.classic.Logger;
import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.edurt.datacap.lib.logger.LoggerExecutor;
import io.edurt.datacap.lib.shell.ShellCommander;
import io.edurt.datacap.lib.shell.ShellConfigure;
import io.edurt.datacap.lib.shell.ShellResponse;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SuppressFBWarnings(value = {"REC_CATCH_EXCEPTION"},
        justification = "I prefer to suppress these FindBugs warnings")
public class ProcessBuilderCommander
        extends ShellCommander
{
    public ProcessBuilderCommander(ShellConfigure configure)
    {
        super(configure);
    }

    @Override
    public ShellResponse execute()
    {
        LoggerExecutor loggerExecutor = this.configure.getLoggerExecutor();
        Logger logger = (Logger) loggerExecutor.getLogger();
        logger.info("Execute pipeline on username {}", configure.getUsername());
        ShellResponse shellResponse = new ShellResponse();
        shellResponse.setSuccessful(Boolean.TRUE);
        List<String> command = new ArrayList<>();
        if (StringUtils.isNotEmpty(getShellType())) {
            command.add(getShellType());
            command.add("-c");
        }
        command.addAll(configure.getCommand());
        ProcessBuilder builder = new ProcessBuilder();
        builder.command(command);
        logger.info("Execute command {}", String.join(" ", command));
        builder.directory(new File(configure.getDirectory()));
        logger.info("Work directory {}", configure.getDirectory());
        Map<String, String> environment = this.getEnvironment();
        builder.environment().putAll(environment);
        logger.info("========== container environment start ==========");
        environment.keySet().forEach(key -> logger.info("Container environment {}={}", key, environment.get(key)));
        logger.info("========== container environment end ==========");

        Process process = null;
        try {
            process = builder.start();
            boolean exitCode = process.waitFor(configure.getTimeout(), TimeUnit.SECONDS);
            if (!exitCode) {
                logger.info(String.format("Timeout %s seconds killed", configure.getTimeout()));
                process.destroy();
                shellResponse.setSuccessful(Boolean.FALSE);
                shellResponse.setTimeout(true);
                Preconditions.checkArgument(false, String.format("Timeout %s seconds", configure.getTimeout()));
            }

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
                String line;
                while (process.isAlive()) {
                    while (bufferedReader.ready()) {
                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.toUpperCase().contains("ERROR")) {
                                logger.error(line);
                            }
                            logger.info(line);
                        }
                    }
                }
            }

            shellResponse.setCode(process.exitValue());
            if (process.exitValue() > 0) {
                List<String> errors = new ArrayList<>();
                new BufferedReader(new InputStreamReader(process.getErrorStream(), StandardCharsets.UTF_8))
                        .lines()
                        .forEach(line -> {
                            logger.error(line);
                            errors.add(line);
                        });
                shellResponse.setErrors(errors);
                shellResponse.setSuccessful(Boolean.FALSE);
            }
        }
        catch (Exception ex) {
            logger.error("Execute failed ", ex);
            shellResponse.setSuccessful(Boolean.FALSE);
        }
        finally {
            if (ObjectUtils.isNotEmpty(process)) {
                process.destroy();
            }
            logger.info("Execute end destroy logger components successful");
            loggerExecutor.destroy();
        }
        return shellResponse;
    }
}
