package com.company.prog.m2.studentWihtExcep;

/**
 * Created by Palamarjuk on 26.04.2016.
 */
public class NameException extends Exception {

    public NameException(String studentName) {
        super(studentName);
    }

    @Override
    public String getMessage() {
        return "NameException: " + super.getMessage();
    }

    public static void correctName(String s, String name) throws NameException {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < 'a') && (s.charAt(i) > 'z') &&
                    (s.charAt(0) < 'A') && (s.charAt(0) > 'Z') ||
                    (s.equals("") || s.equals(" ") || s.equals(null) ||
                    s.length() < 4)) {
                throw new NameException("You are trying to enter the incorrect " + name);
            }
        }
    }

    public static void correctSurname(String s, String surname) throws NameException {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < 'a') && (s.charAt(i) > 'z') &&
                    (s.charAt(0) < 'A') && (s.charAt(0) > 'Z') ||
                    (s.equals("") || s.equals(" ") || s.equals(null) ||
                    s.length() < 4)) {
                throw new NameException("You are trying to enter the incorrect " + surname);
            }
        }
    }

}
