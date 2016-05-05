package com.company.prog.m2.streams;

import java.io.*;

/**
 * Created by Palamarjuk on 05.05.2016.
 */
public class ReadWriteBIS {

    public static void main(String[] args) {
        String path = "D:\\one.txt";
        try {
            readWriteFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readWriteFile(String path) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        byte[] b = new byte[bis.available()];
        bis.read(b);
        bis.close();
        String s = new String(b);
        String out = s.replace("Hello", "By, See you tomorrow");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        bos.write(out.getBytes(),0,out.length());
        bos.close();

    }
}
