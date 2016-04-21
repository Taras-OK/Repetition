package com.company.prog.m1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*Вычислить x^n.
*/

public class Task34M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ar = s.split("\\^");
        System.out.println(Arrays.toString(ar));
        int chisl = Integer.parseInt(ar[0]);
        int st = Integer.parseInt(ar[1]);
        int sum = chisl;
        for (int i = 1; i < st; i++) {
            sum *= chisl;
        }
        System.out.println(sum);
    }
}
