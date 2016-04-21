package com.company.prog.m2.shape;

/**
 * Created by Palamarjuk on 18.04.2016.
 */
public class RadiusException extends Exception {

    public RadiusException(String message) {
        super(message);
    }

    public String getMessage() {
        return "RadiusException: " + super.getMessage();
    }
}
