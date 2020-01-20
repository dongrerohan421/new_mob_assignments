package com.denso.demo.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestControllerAdvice
public class ControllerAdvice {


    @ExceptionHandler(value = {Exception.class})
    public void springHandleNotFound(HttpServletRequest httpServletRequest, HttpServletResponse response, Exception exception) throws IOException {

        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

}