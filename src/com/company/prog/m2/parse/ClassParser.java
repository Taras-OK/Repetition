package com.company.prog.m2.parse;

/**
 * Created by Palamarjuk on 20.04.2016.
 */
public class ClassParser {
    String string;

    public ClassParser(String string) {
        this.string = string;
    }

    public int parse() throws NumberFormatException {
        if (string.equals(null) || string.equals("")) {
            throw new NumberFormatException(string + " = null or \"\"!");
        }
        int i = 0;
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) < 48 || string.charAt(j) > 58) {
                throw  new NumberFormatException(string);
            }
            i += (string.charAt(j)-48);
            i *= 10;
        }
        return i/10;
    }
}
