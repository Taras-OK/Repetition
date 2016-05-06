package com.company.prog.m2.q;

import java.util.ArrayList;

public class HundredThreads extends Thread {
    @Override
    public void run() {
        System.out.println("My ID is: " + getId());
    }


    public static void main(String[] args) {

        ArrayList<Thread> tList = new ArrayList<Thread>();
        for (int i = 0; i < 100; i++) {
            tList.add(i, new HundredThreads());
            tList.get(i).start();
            try {
                tList.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Thread t : tList) {
            t.interrupt();
        }

    }
}