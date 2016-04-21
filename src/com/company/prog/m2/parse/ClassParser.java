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
        int i = 0;
        char[] ch = new char[string.length() - 1];
        for (int j = 0; j < string.length()-1; j++) {
            if (string.charAt(j) < 48 || string.charAt(j) > 58) {
                throw  new NumberFormatException(string);
            }
            ch[j] = string.charAt(j);
        }
        return i =(int) Character.codePointBefore(ch,1);
    }
}
