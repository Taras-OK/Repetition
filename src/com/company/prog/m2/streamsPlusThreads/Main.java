package com.company.prog.m2.streamsPlusThreads;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        ThreadsCopy tc = null;
        try {
            tc = new ThreadsCopy("D:\\Soft\\Install\\Adobe InDesign CC 2015\\Adobe.exe",
                    "D:\\Adobe.exe");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        tc.start();

    }
}
