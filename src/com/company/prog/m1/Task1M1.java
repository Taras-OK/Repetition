package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*������ 1:
        1. ������ ������ ����� ����� ������� 10 ��.
        2. ������������� ����� � �������
        3. ������� �� ����� ���������.
        4. ������� ����������� ���������� ������� � ����������*.*/

public class Task1M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter " + a.length + " array elements");
        int c;
        for (int i = 0; i < a.length; i++) {
            c = scanner.nextInt();
            a[i] = c;
        }
        System.out.println("You enter: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.print("You array sorting: ");
        System.out.println(Arrays.toString(a));
    }
}
