package com.company.prog.m2.streamsPlusThreads;

import java.io.IOException;

public class ThreadsPartFile extends Thread {

    long start;
    long stop;

    public ThreadsPartFile(long start, long stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        byte[] buf = new byte[(int)ThreadsCopy.bufSize];
        int counter = 0;

        try {
            counter = ThreadsCopy.cfs.is.read(buf, 0, buf.length);
            if (counter >= 0) {
                ThreadsCopy.cfs.os.write(buf, 0, counter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
