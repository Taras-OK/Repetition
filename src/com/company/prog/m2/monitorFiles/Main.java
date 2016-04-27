package com.company.prog.m2.monitorFiles;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] fileList = {"d:\\1.txt", "d:\\2.txt", "d:\\3.txt", "d:\\4.txt"};
        Monitor m = new Monitor(fileList, new FileEvent());
        try {
            m.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}