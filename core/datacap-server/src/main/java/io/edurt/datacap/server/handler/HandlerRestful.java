package io.edurt.datacap.server.handler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.edurt.datacap.common.enums.ServiceState;
import io.edurt.datacap.common.response.CommonResponse;
import io.edurt.datacap.server.authorize.UserNotEqualsException;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestControllerAdvice
public class HandlerRestful
{
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResponse<List<HandlerField>> handlerMethodArgumentNotValidException(MethodArgumentNotValidException ex)
    {
        List<HandlerField> list = new ArrayList<>();
        BindingResult bindingResult = ex.getBindingResult();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            HandlerField field = new HandlerField();
            field.setField(fieldError.getField());
            field.setMessage(fieldError.getDefaultMessage());
            list.add(field);
        }
        return CommonResponse.failure(ServiceState.REQUEST_VALID_ARGUMENT, list);
    }

    @ExceptionHandler({ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResponse<String> handlerConstraintViolationException(ConstraintViolationException ex)
    {
        return CommonResponse.failure(ex.getMessage());
    }

    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResponse<String> handlerConstraintViolationException(HttpMessageNotReadableException ex)
    {
        log.error("", ex);
        if (ex.getCause() instanceof InvalidFormatException) {
            return CommonResponse.failure(ServiceState.REQUEST_VALID_ARGUMENT_FORMAT);
        }
        else {
            return CommonResponse.failure(ServiceState.REQUEST_VALID_ARGUMENT_LAYOUT);
        }
    }

    @ExceptionHandler({UserNotEqualsException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResponse<String> handlerUserNotEqualsException(UserNotEqualsException ex)
    {
        return CommonResponse.failure(ServiceState.USER_UNAUTHORIZED);
    }

    @ExceptionHandler({NoHandlerFoundException.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResponse<Object> handlerNoHandlerFoundException(NoHandlerFoundException ex)
    {
        log.error("", ex);
        return CommonResponse.failure(ServiceState.REQUEST_EXCEPTION, ex.getMessage());
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CommonResponse<Object> handlerException(Exception ex)
    {
        log.error("", ex);
        return CommonResponse.failure(ServiceState.REQUEST_EXCEPTION, ex.getMessage());
    }
}
