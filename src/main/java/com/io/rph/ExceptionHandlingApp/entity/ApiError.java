package com.io.rph.ExceptionHandlingApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiError {
    private Integer errorCode;
    private String errorDesc;
    private Date date;
}
