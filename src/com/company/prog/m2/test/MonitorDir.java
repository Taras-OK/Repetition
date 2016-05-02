package com.company.prog.m2.test;

import java.io.File;
import java.util.Arrays;

public class MonitorDir {
    String[] dir;
    IDirEvent event;

    public MonitorDir(String[] dir, IDirEvent event) {
        this.dir = Arrays.copyOf(dir, dir.length);
        this.event = event;
    }

    public void start() {
        File f;
        int n = 0;

        while (true) {
            for (int i = 0; i < dir.length; i++) {
                if (dir[i] != null) {
                    f = new File(dir[i]);
                    if (f.exists() && f.isDirectory()) {
                        event.onDirAdded(dir[i]);
                        dir[i] = null;

                        n++;
                    }
                }

            }
            if (n == dir.length) {

                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Waiting...");
        }

    }
}