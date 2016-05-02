package com.company.prog.m2.fileAdded;

import java.io.File;
import java.util.Calendar;

public class FileAdded {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        long l = c.getTimeInMillis();
        File f = new File("d:\\tmp");

        while (true) {

            String[] list = f.list(new MyFileFilter(l));
            l = MyFileFilter.getExt();

            for (String s : list) {
                System.out.println();
                System.out.println(s);
            }
            list = null;
            System.out.print("\rWait...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r       ");

        }

    }
}
