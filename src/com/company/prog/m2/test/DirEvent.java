package com.company.prog.m2.test;

import java.io.File;
import java.util.Date;
public class DirEvent implements IDirEvent {
    @Override
    public void onDirAdded(String s) {
        System.out.println("Folder added: " + s);
        File f = new File(s);
        long l = f.lastModified();
        Date d = new Date(l);
        System.out.println(d.toString());
    }
}