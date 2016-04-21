package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 05.04.2016.
 */

/*¬вести с консоли число в бинарном формате. ѕеревести
        его в int и вывести на экран (У10Ф -> 2).*/

public class Task25M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите воичное число");
        String s = scanner.nextLine();
        int a = Integer.parseInt(s, 2);
        String st = "\"";
        System.out.printf(st + s + st + " ->" + " " + a);
    }
}

