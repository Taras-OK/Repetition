package com.company.prog.m2.pathList;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Palamarjuk on 04.05.2016.
 */
public class PathList {


    public static void pathList(String path) throws IOException {
        FileOutputStream write = null;
        try {
            write = new FileOutputStream(path + "PathList for current dir.txt");
            allList(path, write);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            write.close();
        }

    }

    private static void allList(String path, FileOutputStream fis)throws IOException {
        File f = new File(path);
        File[] list = f.listFiles();
        String tab = "";

        if(list==null) return;

        for (File s : list) {

            if (s.isFile()) {
                String canonicalPath = tab + s.getCanonicalPath();
                canonicalPath += "\r\n";
                byte[] c = canonicalPath.getBytes();
                fis.write(c, 0, c.length);
            } else {
                String canonicalPath = tab + s.getCanonicalPath();
                canonicalPath += "\r\n";
                byte[] c = canonicalPath.getBytes();
                fis.write(c, 0, c.length);
                tab += "    ";
                allList(s.getCanonicalPath(),fis);
            }

        }
    }
}
