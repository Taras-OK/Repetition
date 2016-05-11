package com.company.prog.m2.streamsPlusThreads;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileStreams {


    String inPath;
    String outPath;
    volatile InputStream is;
    volatile OutputStream os;
    Path p;
    BasicFileAttributes at;


    public CopyFileStreams(String inPath, String outPath) throws FileNotFoundException {
        this.inPath = inPath;
        this.outPath = outPath;
        this.is = new FileInputStream(inPath);
        this.os = new FileOutputStream(outPath);
        File f = new File(inPath);
        p = f.toPath();
        try {
            at = Files.readAttributes(p,BasicFileAttributes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long getIsSize() {
        long size = at.size();
        return size;
    }
}
