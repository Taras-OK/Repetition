package com.company.prog.m2.waitNotify;

/**
 * Created by Palamarjuk on 06.05.2016.
 */

import java.util.Arrays;
import java.util.Random;

class CalcThread extends Thread { // среднее арифметическое
    long res;
    int[] arr;

    public CalcThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        synchronized (this) {
            for (int i : arr) {
                res += i;
            }
            res /= arr.length;
            notify(); // сообщаем об окончании работы
        }
    }

    public long getResult() {
        return res;
    }
}

class WaitNotifyMain {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10000000];
        Arrays.fill(arr, r.nextInt(Integer.MAX_VALUE));

        CalcThread ct = new CalcThread(arr);
        ct.start(); // запускаем подсчет в отдельном потоке

        synchronized (ct) {
            try {
                ct.wait(); // ждем завершения потока
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println("Result is " + ct.getResult()); // результат
        }
    }
}