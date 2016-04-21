package com.company.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Palamarjuk on 30.03.2016.
 */
public class Main2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date dt = new Date();
        Date dt1 = new Date();
        try {
            dt = sdf.parse("28.3.1970");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            dt1 = sdf.parse("28.3.1970");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean b = dt.equals(dt1);
        boolean c = sdf.format(dt).equals(sdf.format(dt1));
        boolean c1 = sdf.format(dt).equals("28.3.1970");
        boolean c3 = false;
        try {
            c3 = sdf.format(dt).equals(sdf.parse("28.3.1970"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String s = sdf.format(dt);
        //String s1 = sdf.format(Date("28.3.1970"));
        System.out.println(s);
        //System.out.println(s1);
        //boolean c5 = s.equals(s1);
        boolean c2 = "28.3.1970".equals("28.3.1970");
        boolean c4 = false;
        try {
            c4 = sdf.parse("28.3.1970").equals(sdf.format("28.3.1970"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
