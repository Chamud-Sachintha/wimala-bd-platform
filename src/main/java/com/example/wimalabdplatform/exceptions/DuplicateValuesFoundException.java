package com.example.wimalabdplatform.exceptions;

public class DuplicateValuesFoundException extends RuntimeException {

    public DuplicateValuesFoundException() {
        super();
    }

    public DuplicateValuesFoundException(String message) {
        super(message);
    }
}
