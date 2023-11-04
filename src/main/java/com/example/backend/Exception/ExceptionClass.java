package com.example.backend.Exception;

import lombok.Getter;

@Getter
public class ExceptionClass extends Exception{
    private final ExceptionCode businessExceptionCode;

    public ExceptionClass(ExceptionCode businessExceptionCode) {
        super(businessExceptionCode.name());
        this.businessExceptionCode = businessExceptionCode;
    }
}
