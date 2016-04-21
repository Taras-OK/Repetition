package com.company.prog.m2.student;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.add(new Student("Seva", "Evgienko", "1.1.1986"));
        sl.add(new Student("Vasya", "Pupkin", "28.3.1970"));
        sl.add(new Student("Vova", "Ivanov", "2.11.1968"));
        sl.add(new Student("Kolja", "Popov", "8.4.1988"));
        sl.add(new Student("Kolja", "Popov", "8.4.1988"));
        int n = sl.findName("Seva");
        int k = sl.findSurname("Ivanov");
        int p = sl.findDate("28.03.1970");
        int c = sl.findDate("8.4.1988");
        System.out.println(sl.get(n).getBirth());
        System.out.println(sl.get(k).getBirth());
        System.out.println(sl.get(p).getBirth());
        System.out.println(sl.get(c).getBirth() + " " + sl.get(c).getSurname());
        System.out.println();
        for (int i = 0; i < sl.getLenght(); i++) {
            System.out.println(sl.get(i).getSurname());
        }
        System.out.println("-----------------------------");
        sl.del(sl.findDate("2.11.1968"));
        for (int i = 0; i < sl.getLenght(); i++) {
            System.out.println(sl.get(i).getSurname());
        }
        sl.del(-1);
        System.out.println("-----------------------------");
        sl.del(sl.findDate("2.11.1968"));
        for (int i = 0; i < sl.getLenght(); i++) {
            System.out.println(sl.get(i).getSurname());
        }
    }
}
