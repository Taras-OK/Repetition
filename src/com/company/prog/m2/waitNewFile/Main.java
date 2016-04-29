package com.company.prog.m2.waitNewFile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static class MyFileFilter implements FilenameFilter {
        private String ext;

        public MyFileFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }

    private static void findFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext));

        for (int i = 0; i < files.length; i++) {
            list.add(files[i].getCanonicalPath());
        }

        System.out.println("Package contain:");
        for (String s : list)
            System.out.println(s);

        while (true) {

            findNewFiles(srcPath, ext, list);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void findNewFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext));
        int count = 0;

        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (files[i].getCanonicalPath().equalsIgnoreCase(list.get(j))) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("New file: " + files[i].toString() + files[i].getTotalSpace());
                list.add(files[i].toString());
                count = 0;
            }
            count = 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        try {
            findFiles("d:\\", ".txt", list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}