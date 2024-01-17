package com.luv2code.springboot.restsecurity.exceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeErrorResponse {
    private int status;
    private String message;
    private LocalTime timeStamp;
}
