package com.company.prog.m2.counterThreads;

/**
 * Created by Palamarjuk on 06.05.2016.
 */
public class Main {
    public static class Counter extends Thread {

        public void run() {
            int x = 1;
            while (x < 10)
                System.out.println(x++);
        }
    }

    public static void main(String[] args) {

        try {
            Counter c = new Counter();
            c.start(); // запускаем поток
            c.join(); // ждем завершения потока
            System.out.println("Thread finished");

        } catch (Exception e) {
            ;
        }
    }
}