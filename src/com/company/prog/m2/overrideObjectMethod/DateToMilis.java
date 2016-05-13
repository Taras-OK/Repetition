package com.company.prog.m2.overrideObjectMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Palamarjuk on 13.05.2016.
 */
public class DateToMilis {

    private static SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy");

    public static long getMillis(String date) {
        Date dt = new Date();
        try {
            dt = s.parse(date);
        } catch (ParseException e) {
            System.out.println("Wrong date!" + e.getMessage());;
        }
        return dt.getTime();
    }
}
