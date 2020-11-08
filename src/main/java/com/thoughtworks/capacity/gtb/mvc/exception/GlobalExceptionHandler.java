package com.thoughtworks.capacity.gtb.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNameAndPasswordIsNullException.class)
    public ResponseEntity<ErrorResult> handle(UserNameAndPasswordIsNullException ex) {
        ErrorResult errorResult = new ErrorResult(ex.getMessage(),400);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
    }

    @ExceptionHandler(UserIsExistException.class)
    public ResponseEntity<ErrorResult> handleUserIsExistException(UserIsExistException ex) {
        ErrorResult errorResult = new ErrorResult(ex.getMessage(),400);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
    }
}
