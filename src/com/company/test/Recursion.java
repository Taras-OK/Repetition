package com.company.test;

import java.util.Random;

public class Recursion {
    double[] mas;
    private int masLength;


    public Recursion(int masLength) {
        this.masLength = masLength;
        mas = new double[masLength];
        Random ran = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = ran.nextDouble();
        }
    }

    public void print() {
        if(masLength==0) return;
        System.out.println("[" + mas[masLength - 1] + "] ");
        masLength--;
        print();
    }

    public static void main(String[] args) {
        Recursion rec = new Recursion(5);
        rec.print();
    }
}
