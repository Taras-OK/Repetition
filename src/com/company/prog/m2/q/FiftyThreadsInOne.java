package com.company.prog.m2.q;

import java.util.ArrayList;

public class FiftyThreadsInOne extends Thread {
    int count;
    ArrayList<Thread> trList = new ArrayList<Thread>();


    public FiftyThreadsInOne(int count) {
        this.count = count;
    }

    @Override
    public void run() {

        for (int i = 0; i < count; i++) {
            trList.add(new HundredThreads());
            trList.get(i).start();
            try {
                trList.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            trList.get(i).interrupt();

            //System.out.println("My ID is:" + trList.get(i).getId());
        }
    }

    public static void main(String[] args) {

        FiftyThreadsInOne ftio = new FiftyThreadsInOne(50);
        ftio.start();
        try {
            ftio.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ftio.interrupt();
    }
}
