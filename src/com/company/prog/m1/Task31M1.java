package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*������� �� ����� ��� ����� ����������� ��������.
*/

public class Task31M1 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 0; i < 26; i++) {
            System.out.print(ch++ + " ");
        }
        System.out.println();
        ch = 97;
        for (int i = 0; i < 26; i++) {
            System.out.print(ch++ + " ");
        }
        System.out.println();
        for (char � = '�'; � <= '�'; �++) {
            System.out.print(� + " ");
        }
        System.out.println();
        for (char � = '�'; � <= '�'; �++) {
            System.out.print(� + " ");
        }
    }
}
