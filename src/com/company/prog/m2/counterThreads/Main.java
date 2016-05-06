package com.company.prog.m2.counterThreads;

/**
 * Created by Palamarjuk on 06.05.2016.
 */
public class Main {
    public static class Counter extends Thread {
        int start;
        int end;

        public Counter(int start, int end) {
            this.start = start;
            this.end = end;
        }


        public void run() {
            int x = start;
            int count = 0;
            int[] a = new int[end - start + 1];
            int[] b = new int[a.length];
            boolean rev = false;
            for (int i = 0; i < a.length; i++) {
                a[i] = x++;
                b[b.length - 1 - i] = x - 1;
            }
            while (count++ < 5) {
                if (rev == false) {
                    for (int k : a) {
//                        try {
//                            Thread.sleep(200);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        System.out.print(k + " ");
                    }
                    rev = true;
                    System.out.println();
                } else {
                    for (int k : b) {
//                        try {
//                            Thread.sleep(200);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        System.out.print(k + " ");
                    }
                    rev = false;
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {

        try {
            Counter c = new Counter(105, 139);
            c.start(); // запускаем поток
            c.join(); // ждем завершения потока
            System.out.println("Thread finished");

        } catch (Exception e) {
            ;
        }
    }
}