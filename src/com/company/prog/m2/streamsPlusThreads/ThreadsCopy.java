package com.company.prog.m2.streamsPlusThreads;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ThreadsCopy extends Thread {

    public static CopyFileStreams cfs;
    public static int bufSize;

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
        int available = cfs.getIsSize();
        bufSize = 1024 * 1024 * 50;
        int threadsCount = available / bufSize + 1;
        ArrayList<ThreadsPartFile> list = new ArrayList<ThreadsPartFile>();

        for (int i = 0, c = 0; i < threadsCount; i++) {
            ThreadsPartFile pf = new ThreadsPartFile(c, bufSize);
            c += bufSize;
            pf.start();
            try {
                pf.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(pf);
        }
        System.out.println("All part of file is copied");

        for (ThreadsPartFile f : list) {
            f.interrupt();
        }
        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2 / 1000);
    }
}
