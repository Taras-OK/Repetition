package com.company.prog.m2.findFiles;

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
            list.add(srcPath + files[i].getName());
        }
    }

    private static void findNewFile() {

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();

        try {
            findFiles("d:\\", ".txt", list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("d:\\" + " contain: ");

        for (String s : list)
            System.out.println(s);

        System.out.println("_____________________");

        int count = list.size();

        while (true) {
            try {
                findFiles("d:\\", ".txt", list1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (list1.size() > count) {
                System.out.println();
                System.out.println("New file added: " + list1.get(0).toString());
                count++;
            } else {
                System.out.print(".");
            }
            list1.clear();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}