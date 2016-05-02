package com.company.prog.m2.fileAdded;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileFilter implements FilenameFilter {
    private static long ext;

    public MyFileFilter(long ext) {
        this.ext = ext;
    }

    public static long getExt() {
        return ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        boolean b =false;

        File f = new File(dir, name);
        Path path = f.toPath();
        BasicFileAttributes attr = null;
        try {
            attr = Files.readAttributes(path, BasicFileAttributes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (attr.creationTime().toMillis() > ext) {
            b = true;
            ext = attr.creationTime().toMillis();
        }
        return b;
    }

}
