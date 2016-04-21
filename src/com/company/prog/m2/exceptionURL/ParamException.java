package com.company.prog.m2.exceptionURL;

/**
 * Created by Palamarjuk on 18.04.2016.
 */
public class ParamException extends Exception {
    public ParamException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "ParamException: " + super.getMessage();
    }
}
