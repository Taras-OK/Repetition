package com.company.prog.m2.streams;

import java.io.IOException;

/**
 * Created by Palamarjuk on 04.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        try {
            ReadWriteFile rw = new ReadWriteFile("D:\\1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
