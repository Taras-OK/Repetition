package com.company.prog.m2.writeFromDifThreads;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Palamarjuk
 */
public class ClassReaderFile extends Thread {

    String path;
    RandomAccessFile raf = null;

    public ClassReaderFile(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        try {
            raf = new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public int read(byte[] b) throws IOException {
        int count = 0;

        count = raf.read(b, 0, b.length);

        return count;
    }
}
