package com.company.prog.m1;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*��������� ������ ������� ������ � ���������.
������: �((x � 8)+a(y � 1))�.*/

public class Task32M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            }else if (s.charAt(i) == ')') {
                count2++;
            }
        }
        if (count2 != count) {
            System.out.println("Error!");
        }else System.out.println("OK!");
    }
}
