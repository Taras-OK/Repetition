package com.company.prog.m1;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Написать ф-ю, которая принимает на вход массив чисел и
        возвращает его длину в байтах как результат.*/


public class Task19M1 {

    private static int lenghtByte(int[] a) {
        int lenght = a.length * 4;
        return lenght;
    }
    private static int lenghtByte(byte[] a) {
        int lenght = a.length;
        return lenght;
    }
    private static int lenghtByte(short[] a) {
        int lenght = a.length * 2;
        return lenght;
    }
    private static int lenghtByte(long[] a) {
        int lenght = a.length * 8;
        return lenght;
    }
    private static int lenghtByte(float[] a) {
        int lenght = a.length * 4;
        return lenght;
    }
    private static int lenghtByte(double[] a) {
        int lenght = a.length * 8;
        return lenght;
    }
    private static int lenghtByte(char[] a) {
        int lenght = a.length * 2;
        return lenght;
    }

    public static void main(String[] args) {
        int[] a = new int[1];
        byte[] b = new byte[1];
        short[] c = new short[1];
        long[] d = new long[1];
        float[] e = new float[1];
        double[] f = new double[1];
        char[] g = new char[1];
        String[] g1 = new String[1];
        System.out.println(lenghtByte(a));
        System.out.println(lenghtByte(b));
        System.out.println(lenghtByte(c));
        System.out.println(lenghtByte(d));
        System.out.println(lenghtByte(e));
        System.out.println(lenghtByte(f));
        System.out.println(lenghtByte(g));
    }
}
