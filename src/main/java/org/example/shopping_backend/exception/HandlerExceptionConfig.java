package org.example.shopping_backend.exception;


import lombok.extern.slf4j.Slf4j;
import org.example.shopping_backend.base.ResponseUtil;
import org.example.shopping_backend.base.RestData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestControllerAdvice
public class HandlerExceptionConfig {



    @ExceptionHandler(value = {BadRequestException.class})
    protected ResponseEntity<RestData<?>> handleBadRequestException(BadRequestException exception){
        log.error(exception.getMessage(), exception);
        List<String> messages = new ArrayList<>();
        String message = exception.getMessage();
        messages.add(message);
        return ResponseUtil.error(HttpStatus.BAD_REQUEST, messages);
    }

    @ExceptionHandler(value = {NotFoundException.class})
    protected ResponseEntity<RestData<?>> handleNotFoundException(NotFoundException exception){
        log.error(exception.getMessage(), exception);
        List<String> messages = new ArrayList<>();
        String message = exception.getMessage();
        messages.add(message);
        return ResponseUtil.error(HttpStatus.NOT_FOUND, messages);
    }

    
}
