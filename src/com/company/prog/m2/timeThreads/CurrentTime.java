package com.company.prog.m2.timeThreads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 06.05.2016.
 */
public class CurrentTime extends Thread {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    Date dt = new Date();
    //private boolean status = false;

    @Override
    public void run() {

        while (!isInterrupted()) {
            dt.setTime(System.currentTimeMillis());
            System.out.print("\r" + sdf.format(dt));

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

   /* public void finish() {
        status = true;
    }*/

    public static void main(String[] args) {
        CurrentTime ct = new CurrentTime();
        System.out.println("Current time:");
        Scanner sc = new Scanner(System.in);

        System.out.println("If you want close program press ENTER");

        ct.start();
        System.out.println();
        String s = sc.nextLine();

        if (s != null) {
            ct.interrupt();
            //System.out.println("Program will be closed in a few seconds");
        }
    }
}

