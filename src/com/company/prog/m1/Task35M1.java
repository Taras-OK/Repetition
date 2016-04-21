package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*������� �� ����� ��� ������� �����, ������� ������
��������� N.*/

public class Task35M1 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i < n; i++) {
            if (funk(i)) {
                System.out.print(i+", ");
            }
        }
    }

    private static boolean funk(int n) {  //
        if (n == 1) // 1 - �� ������� �����
            return false;
        // ���������� ��������� �������� �� 2 �� sqrt(n)
        for (int d = 2; d * d <= n; d++) {
            // ���� ����������� ������, �� ���������
            if (n % d == 0)
                return false;
        }
        // ���� ��� ������������� ���������, �� �������
        return true;
    }
}
