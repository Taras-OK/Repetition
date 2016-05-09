package com.company.prog.m2.streamsPlusThreads;

import java.io.*;

public class CopyFileStreams {


    String inPath;
    String outPath;
    volatile InputStream is;
    volatile OutputStream os;


    public CopyFileStreams(String inPath, String outPath) throws FileNotFoundException {
        this.inPath = inPath;
        this.outPath = outPath;
        this.is = new FileInputStream(inPath);
        this.os = new FileOutputStream(outPath);
    }

    public int getIsSize() {
        try {
            return is.available();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
