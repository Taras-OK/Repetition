package com.company.prog.m2.recursion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Recursion {

    private static void listAll(String path, ArrayList<String> res)
            throws IOException {
        File dir = new File(path);
        File[] list = dir.listFiles();

        if (list == null) return;

        for (File f : list) {

            if (f.isFile() && f.getName().length() > 5 && f.getName().charAt(1) == 'A') {
                res.add("File: " + f.getCanonicalPath());
            } else if (!f.isFile()) {
                if (f.getName().length() > 5 && f.getName().charAt(1) == 'A') {
                    res.add("Dir: " + f.getCanonicalPath());
                }
                    listAll(f.getCanonicalPath(), res);
            }
        }
    }

    public static void main(String[] args) {
        final String path = "C:\\";
        ArrayList<String> res = new ArrayList<String>();

        try {
            listAll(path, res);
        } catch (IOException e) {
           e.printStackTrace();
        }

        for (String s : res)
            System.out.println(s);
        System.out.println(res.size());
    }
}