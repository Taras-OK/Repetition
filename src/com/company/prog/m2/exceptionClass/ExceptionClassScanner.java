package com.company.prog.m2.exceptionClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 18.04.2016.
 */
public class ExceptionClassScanner {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("d:\\1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        String s = sc.nextLine();
        System.out.println(s);
        s = sc.nextLine();
        System.out.println(s);
        s = sc.nextLine();
        System.out.println(s);
    }
}
