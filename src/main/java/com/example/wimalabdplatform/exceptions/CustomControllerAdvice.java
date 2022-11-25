package com.example.wimalabdplatform.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.PrintWriter;
import java.io.StringWriter;

@ControllerAdvice
public class CustomControllerAdvice {

    @ExceptionHandler(JWTTokenExpiredException.class)
    public ResponseEntity<ErrorResponse> handleJWTExipredException(Exception e) {
        HttpStatus httpStatus = HttpStatus.UNAUTHORIZED;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);

        return new ResponseEntity<>(
                new ErrorResponse(
                        httpStatus,
                        e.getMessage()
                ),
                httpStatus
        );
    }

    @ExceptionHandler(DuplicateValuesFoundException.class)
    public ResponseEntity<ErrorResponse> handleDuplicateValueFoundException(Exception e) {
        HttpStatus httpStatus = HttpStatus.IM_USED;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);

        return new ResponseEntity<>(
                new ErrorResponse(
                        httpStatus,
                        e.getMessage()
                ),
                httpStatus
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);

        return new ResponseEntity<>(
                new ErrorResponse(
                        httpStatus,
                        e.getMessage()
                ),
                httpStatus
        );
    }
}
