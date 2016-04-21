package com.company.prog.m1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*Ввести с консоли дату. Сравнить ее с текущей датой в
        системе. Вывести отличающиеся части (год, месяц) на
        экран.*/

public class Task21M1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar c = Calendar.getInstance();
        Calendar s = Calendar.getInstance();
        System.out.println("Enter the date: ");
        //System.out.println(c.getTime());
        String str = scr.nextLine();
        String year = "";
        String mouns = "";
        String day = "";
        Date dt = new Date();
        try {
            dt = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Error!");
        }
        s.setTime(dt);
        /*System.out.println(c.getTime());
        System.out.println(s.getTime());
        *//*boolean b;
        b = c.get(Calendar.YEAR) == s.get(Calendar.YEAR);
        System.out.println(b);*/
        if (c.get(Calendar.YEAR) != s.get(Calendar.YEAR)) {
            year = "Сейчас не " + s.get(Calendar.YEAR) + "-й год, а " + c.get(Calendar.YEAR) + "-й. ";
            //System.out.println("Entered data matches the current");
        }
        if (c.get(Calendar.MONTH) != s.get(Calendar.MONTH)) {
            mouns = "Сейчас не " + (s.get(Calendar.MONTH) + 1) + "-й месяц, а " + (c.get(Calendar.MONTH) + 1) + "-й. ";
            //System.out.println("Entered data matches the current");
        }
        if (c.get(Calendar.DAY_OF_MONTH) != s.get(Calendar.DAY_OF_MONTH)) {
            day = "Сейчас не " + s.get(Calendar.DAY_OF_MONTH) + "-й день, а " + c.get(Calendar.DAY_OF_MONTH) + "-й.";
            //System.out.println("Entered data matches the current");
        }
        if (mouns == "" && year == "" && day == "") {
            System.out.println("Сегодняшняя дата соответствует введенной!");
        }
        if (year != "") {
            System.out.println(year);
        }
        if (mouns != "") {
            System.out.println(mouns);
        }
        if (day != "") {
            System.out.println(day);
        }
    }
}
