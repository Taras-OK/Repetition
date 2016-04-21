package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 05.04.2016.
 */

/*¬вести с консоли число в бинарном формате. ѕеревести
        его в int и вывести на экран (У10Ф -> 2).*/

public class Task25M1Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите двоичное число");
        String s = scanner.nextLine();
        int a = Integer.parseInt(s, 2);
        //String st = "\"";
        System.out.println("\"" + s + "\"" + " ->" + " " + (a));
        System.out.println("\"" + s + "\"" + " ->" + " " + binToDec(s));
    }

    static int binToDec(String s) {
        int dec = 0;
        int pow = s.length() - 1;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            //System.out.println(ch);
            dec += (ch - 48) * Math.pow(2, pow);
            pow--;
        }
        return dec;
    }
}

