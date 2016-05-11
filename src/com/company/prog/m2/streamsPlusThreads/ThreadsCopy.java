package com.company.prog.m2.streamsPlusThreads;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ThreadsCopy extends Thread {

    public static CopyFileStreams cfs;
    public static long bufSize;

    public ThreadsCopy(String inPath, String outPath) throws FileNotFoundException {
        cfs = new CopyFileStreams(inPath, outPath);
    }

    @Override
    public void run() {
        try{
            createThreads();
        }finally {
            try {
                cfs.is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                cfs.os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void createThreads() {
        long t1 = System.currentTimeMillis();
        long available = cfs.getIsSize();
        String s = "";
        bufSize = 1024 * 1024 * 50;
        ArrayList<ThreadsPartFile> list = new ArrayList<ThreadsPartFile>();
        long c = 0;

        for (int i = 0; c < cfs.getIsSize(); i++) {
            ThreadsPartFile pf = new ThreadsPartFile(c, bufSize);
            c += bufSize;
            pf.start();
            try {
                pf.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s += "*";
            if (c <= available) {
                System.out.print("\r" + "Progress: " + (c / (cfs.getIsSize() / 100)) + "%" + " [" + s + "]" + cfs.getIsSize());
            } else {
                System.out.print("\r" + "Progress: " + (100) + "%" + " [" + s + "]" + cfs.getIsSize());
            }
            list.add(pf);
        }
        System.out.println();
        System.out.println("All part of file is copied");
        System.out.println(cfs.getIsSize());

        for (ThreadsPartFile f : list) {
            f.interrupt();
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2 / 1000);
    }
}
