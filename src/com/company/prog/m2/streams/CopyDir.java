package com.company.prog.m2.streams;

import java.io.File;

import static com.company.prog.m2.streams.ReplaceTextFile.copyFile;

public class CopyDir {

    private static void listAll(String pathSrc, String pathDest)
            throws Exception {
        File dir = new File(pathSrc);
        File[] list = dir.listFiles();

        if (list == null) return;

        for (File f : list) {

            if (f.isFile()) {
                copyFile(f.getCanonicalPath(), pathDest + "\\" + f.getName());
            } else {
                new File(pathDest + "\\" + f.getName()).mkdir();
                listAll(f.getCanonicalPath(), pathDest + "\\" + f.getName());
            }
        }
    }


    public static void main(String[] args) {
        String pathSrc = "D:\\Soft\\Install\\Adobe InDesign CC 2015";
        String pathDest = "D:\\test";

        long t1 = System.currentTimeMillis();

        try {
            listAll(pathSrc, pathDest);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long t2 = System.currentTimeMillis() - t1;
        System.out.println(t2 / 1000);
    }
}