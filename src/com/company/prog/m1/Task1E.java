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

public class Task1E {
    public static void main(String[] args) { //��� ���������� ������� ����
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
        int[] b = new int[]{5, 6, 7, 888, 22};
        task1(b);
        System.out.println(Arrays.toString(b));
    }
    private static void task1(int[] a) { //���������� ��������� ������, ����� �� �����������
        final int len = a.length;
        int t;
        for (int i = 0; i < len / 2; i++) {
            t = a[i];
            a[i] = a[len - i - 1];
            a[len - i - 1] = t;
        }
    }
}
