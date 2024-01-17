package com.luv2code.springboot.restsecurity.exceptionHandler;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
