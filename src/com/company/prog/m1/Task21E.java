package com.company.prog.m1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 04.04.2016.
 */

/*������ � ������� ����. �������� �� � ������� ����� �
        �������. ������� ������������ ����� (���, �����) ��
        �����.*/

public class Task21E {
    public static void main(String[] args) throws ParseException {
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
            year = "������ �� " + s.get(Calendar.YEAR) + "-� ���, � " + c.get(Calendar.YEAR) + "-�. ";
            //System.out.println("Entered data matches the current");
        }
        if (c.get(Calendar.MONTH) != s.get(Calendar.MONTH)) {
            mouns = "������ �� " + (s.get(Calendar.MONTH) + 1) + "-� �����, � " + (c.get(Calendar.MONTH) + 1) + "-�. ";
            //System.out.println("Entered data matches the current");
        }
        if (c.get(Calendar.DAY_OF_MONTH) != s.get(Calendar.DAY_OF_MONTH)) {
            day = "������ �� " + s.get(Calendar.DAY_OF_MONTH) + "-� ����, � " + c.get(Calendar.DAY_OF_MONTH) + "-�.";
            //System.out.println("Entered data matches the current");
        }
        if (mouns == "" && year == "" && day == "") {
            System.out.println("����������� ���� ������������� ���������!");
        }
        System.out.print("������� ����� ������: ");
        if (year != "") {
            System.out.print(c.get(Calendar.YEAR) - s.get(Calendar.YEAR)+" �., ");
        }
        if (mouns != "") {
            System.out.print(c.get(Calendar.MONTH) - s.get(Calendar.MONTH)+" ���., ");
        }
        if (day != "") {
            System.out.print(c.get(Calendar.DAY_OF_MONTH) - s.get(Calendar.DAY_OF_MONTH)+" ��.");
        }
      /*  long d;
        if (c.getTimeInMillis() > s.getTimeInMillis()) {
            d = (long) c.getTimeInMillis() - s.getTimeInMillis();
        } else d = (long) s.getTimeInMillis() - c.getTimeInMillis();

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(d);
        Date dtr = calendar.getTime();
        Date dts = new Date(d);
        Date dtt = new Date(0);
        System.out.println(sdf.format(dtr));
        System.out.println(sdf.format(dts));
        System.out.println(d);
        System.out.println(c.getTimeInMillis());
        System.out.println(s.getTimeInMillis());
        System.out.println(c.getTimeInMillis() - s.getTimeInMillis());
        System.out.println(sdf.format(dtt));
        System.out.println(sdf.format(dtt));*/
        //task1(s);
    }

    static void task1(Calendar s){ //���������� �� �����������, �� ����� �� ����������!!
        //Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        //calendar2.setTime(new Date());
        if (!s.equals(calendar2)) {
            long m1 = s.getTimeInMillis();
            long m2 = calendar2.getTimeInMillis();
            if (m1 != m2) {
                System.out.println(m1 + "-" + m2);
                SimpleDateFormat sdf = new SimpleDateFormat("MM.yyyy");
                System.out.println(new Date(m1));
                System.out.println(new Date(m2));
            }
        }
    }
}
