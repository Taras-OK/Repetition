package com.company.prog.m2.monitorDate;

import java.util.Calendar;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.println("File added: " + s);
    }

    @Override
    public void createdDate(long s) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(s);
        System.out.println("Created date: " + c.get(Calendar.DAY_OF_MONTH) + "." + (c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR));
    }
}
