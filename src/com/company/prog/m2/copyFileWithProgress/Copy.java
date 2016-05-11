package com.company.prog.m2.copyFileWithProgress;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Copy extends Thread {

    private static final int BLOCK_SIZE = 1024;

    String src, dest;
    IProgress progress;
    long counter;

    public Copy(String src, String dest, IProgress progress) {
        this.src = src;
        this.dest = dest;
        this.progress = progress;
    }

    public void run() {
        try {
            copyFile();
        } catch (IOException e) {
            return;
        }
    }

    private void copyFile() throws IOException {
        long t1 = System.currentTimeMillis();
        RandomAccessFile in = new RandomAccessFile(src, "r");
        try {
            final double onePersent = in.length() / 100.0; // !!!

            counter = 0;

            RandomAccessFile out = new RandomAccessFile(dest, "rw");
            try {
                byte[] buf = new byte[BLOCK_SIZE];
                int r;

                do {
                    r = in.read(buf, 0, buf.length);
                    if (r > 0) {
                        out.write(buf, 0, r);
                        counter += r;

                        if (progress != null)
                            progress.update(counter / onePersent);
                    }
                } while (r > 0 && !isInterrupted());
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println();
        System.out.println(t2 / 1000);
    }
}
