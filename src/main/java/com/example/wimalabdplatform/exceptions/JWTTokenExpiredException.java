package com.example.wimalabdplatform.exceptions;

public class JWTTokenExpiredException extends RuntimeException {

    public JWTTokenExpiredException () {
        super();
    }

    public JWTTokenExpiredException(String message) {
        super(message);
    }
}
