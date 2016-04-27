package com.company.prog.m2.monitorFiles;

import java.nio.file.attribute.FileTime;
import java.util.Calendar;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.println("File added: " + s);
    }

    @Override
    public void createdDate(FileTime s) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(s.toMillis());
        String s1 = c.get(Calendar.MINUTE) < 10 ? (s1 = "0" + c.get(Calendar.MINUTE)) : (s1 = "" + c.get(Calendar.MINUTE));
        System.out.println("Created date: " + c.get(Calendar.DAY_OF_MONTH) + "." + (c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR) + " "
                + c.get(Calendar.HOUR_OF_DAY) + ":" + s1 + ":" + c.get(Calendar.SECOND));
        //System.out.println(s.toString());
    }
}
