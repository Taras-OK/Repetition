package com.company.prog.m2.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Palamarjuk on 04.05.2016.
 */
public class ReplaceTextFile {

    public static void main(String[] args) {
        try {
            replaceFile("D:\\test\\1.txt", "D:\\test\\1test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void replaceFile(String src, String dest) throws Exception {
        FileInputStream in = new FileInputStream(src);
        String temp = "D:\\test\\2test.txt";
        String s = "";
        String s1 = "";
        String s2 = "";
        try {
            FileOutputStream out = new FileOutputStream(dest);
            FileOutputStream out1 = new FileOutputStream(temp);
            try {
                byte[] buf = new byte[1024 * 1024]; // 1 KB
                int r;
                do {
                    r = in.read(buf, 0, buf.length);
                    if (r > 0) {
                        out.write(buf, 0, r);
                        s = new String(buf, "UTF-8");
                        s1 = s.trim();
                        s2 = s1.replace("Hello", "1234");
                        byte[] buf1 = s2.getBytes();
                        out1.write(buf1, 0, buf1.length);
                    }
                } while (r > 0);

            } finally {
                out.close();
                out1.close();
            }
        } finally {
            in.close();
        }
        copyFile(temp, src);
    }

    static void copyFile(String src, String dest) throws Exception {
        FileInputStream in = new FileInputStream(src);
        try {
            FileOutputStream out = new FileOutputStream(dest);
            try {
                byte[] buf = new byte[1024 * 1024]; // 1 KB
                int r;
                do {
                    r = in.read(buf, 0, buf.length);
                    if (r > 0) {
                        out.write(buf, 0, r);
                    }
                } while (r > 0);

            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}