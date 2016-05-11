package com.company.prog.m2.streamsPlusThreads;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        ThreadsCopy tc = null;
        try {
            tc = new ThreadsCopy("D:\\Install\\ACad\\Autodesk_AutoCAD_Electrical_2012_EN-RU.isz",
                    "D:\\Autodesk_AutoCAD.isz");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        tc.start();
    }
}
