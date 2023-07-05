package io.edurt.datacap.security;

import io.edurt.datacap.common.enums.ServiceState;
import io.edurt.datacap.common.response.CommonResponse;
import io.edurt.datacap.common.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@Slf4j
@Component
public class JwtAuthEntryPoint
        implements AuthenticationEntryPoint
{
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException)
            throws IOException
    {
        log.error("Unauthorized error: {}", authException.getMessage());
        if (authException instanceof BadCredentialsException) {
            response.getWriter().print(JsonUtils.toJSON(CommonResponse.failure(ServiceState.USER_BAD_CREDENTIALS)));
        }
        else {
            response.getWriter().print(JsonUtils.toJSON(CommonResponse.failure(ServiceState.USER_UNAUTHORIZED)));
        }
    }
}
