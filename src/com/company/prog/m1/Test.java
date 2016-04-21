package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String s = scanner.nextLine();
        String[] text = s.split("[ ,-.;]");
        System.out.println(Arrays.toString(text));
    }
}
