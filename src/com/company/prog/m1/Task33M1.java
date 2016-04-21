package com.company.prog.m1;

import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.04.2016.
 */

/*ѕроверить баланс круглых скобок в выражении.
ѕример: У((x Ц 8)+a(y Ц 1))Ф.*/

public class Task33M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long enteredInt = scanner.nextLong();
        long div = 10;
        int sum = 0;
        for (long i = 1; ; i *= 10) {
            if (enteredInt > div && enteredInt < (div * i)) {
                sum += enteredInt / i;
                enteredInt = enteredInt % i;
                i = 1;
            }else if (enteredInt < div) {
                sum += enteredInt;
                break;
            }
        }
        System.out.println(sum);
    }
}
