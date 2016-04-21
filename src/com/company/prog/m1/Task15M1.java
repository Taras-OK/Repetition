package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать игру «Крестики нолики» используя
        двухмерные массивы.*/

public class Task15M1 {
    public static void main(String[] args) {
        String[][] a = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        a[0][0] = "1";
        a[1][0] = "2";
        a[2][0] = "3";
        a[0][1] = "4";
        a[1][1] = "5";
        a[2][1] = "6";
        a[0][2] = "7";
        a[1][2] = "8";
        a[2][2] = "9";
        System.out.println("Игра крестики - нолики!!! Версия №1");
        System.out.println("Игрок №1: (X)");
        System.out.println("Игрок №2: (O)");
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));
        System.out.println();
        int user = 1;
        int count = 0;
        String ent;
        String fin = "";
        for (int i = 0; i < 9; i++) {
            System.out.println("Игрок №" + user + ", введите номер ячейки и нажмите ENTER.");
            ent = scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (a[j][k].equals(ent)) {
                        count++;
                        if (user == 1) {
                            ent = "X";
                        } else ent = "O";
                        a[j][k] = ent;
                        System.out.println(Arrays.toString(a[0]));
                        System.out.println(Arrays.toString(a[1]));
                        System.out.println(Arrays.toString(a[2]));
                        fin = ent;
                        ent = "";
                    }
                }
            }
            if (count == 0) {
                System.out.println("Вы неможете выбрать эту ячейку!!!");
            }
            if ((a[0][0].equals(fin) && a[1][0].equals(fin) && a[2][0].equals(fin)) ||
                    (a[0][1].equals(fin) && a[1][1].equals(fin) && a[2][1].equals(fin)) ||
                    (a[0][2].equals(fin) && a[1][2].equals(fin) && a[2][2].equals(fin)) ||
                    (a[0][0].equals(fin) && a[0][1].equals(fin) && a[0][2].equals(fin)) ||
                    (a[1][0].equals(fin) && a[1][1].equals(fin) && a[1][2].equals(fin)) ||
                    (a[2][0].equals(fin) && a[2][1].equals(fin) && a[2][2].equals(fin)) ||
                    (a[0][0].equals(fin) && a[1][1].equals(fin) && a[2][2].equals(fin)) ||
                    (a[0][2].equals(fin) && a[1][1].equals(fin) && a[2][0].equals(fin))) {
                System.out.println("Поздравляем!!!");
                System.out.println("Игрок №" + user + ", ВЫИГРАЛ!!!");
                break;
            } else if (user == 1 && count != 0) {
                user = 2;
            } else if (user == 2 && count != 0) {
                user = 1;
            }
            count = 0;
        }
    }
}
