package com.io.rph.ExceptionHandlingApp.exception;

public class NoProductFoundException  extends RuntimeException{
    public NoProductFoundException(String message) {
        super(message);
    }
}
