package com.company.prog.m1;

/**
 * Created by Palamarjuk on 01.04.2016.
 */

/*Найти в массиве число, которое повторяется
        наибольшее количество раз. Не использовать
        коллекции.*/

public class Task12E {
    public static void main(String[] args) { //моя реализация
        int[] a = new int[]{22, 22, 22, 1, 3, 6, 6, 6, 6};
        int[] b = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {       //вложенный цикл похож на тот, что в перзентации, но дальнейшая реализация отличается
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            b[i] = count;
            count = 0;
        }
        int d = b[0];
        int pos = 0;
        for (int n = 0; n < a.length; n++) {
            if (d < b[n]) {
                d = b[n];
                pos = n;
            }
        }
        System.out.println(a[pos]);
        task7(a);
    }

    private static int task7(int[] a) { //реализация из презентации
        int res = 0, cc, cp = 0;
        for (int i = 0; i < a.length; i++) {
            cc = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i])
                    cc++;
            }
            if (cc > cp) {
                cp = cc;
                res = a[i];
            }
        } // for
        System.out.println(res);
        return res;
    }
}
