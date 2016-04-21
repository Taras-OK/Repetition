package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*С помощью консоли пользователь вводит
        математическое выражение типа “1+33-4*7”. Написать
        программу для подсчета его значения. Приоритет
        операций не учитывается.*/

public class Task16E {
    private static boolean isOperator ( char ch){  //своей реализации пока нет!
        return (ch == '+') || (ch == '-') ||
                (ch == '*') || (ch == '*')||
                (ch == '.');
    }

    private static int calculate(String s) {
        String sc = "";
        char c, op = '+';
        int op1 = 0;

        s = s + '.';

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (Character.isDigit(c)) {
                sc += c;
            } else if (isOperator(c)) {
                int op2 = Integer.parseInt(sc);

                sc = "";

                switch (op) {
                    case '+':
                        op1 += op2;
                        break;
                    case '-':
                        op1 -= op2;
                        break;
                    case '*':
                        op1 *= op2;
                        break;
                    case '/':
                        op1 /= op2;
                        break;
                }

                op = c;
            } else
                System.out.println("Error!");
        }

        return op1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculate(scanner.nextLine()));
    }
}
