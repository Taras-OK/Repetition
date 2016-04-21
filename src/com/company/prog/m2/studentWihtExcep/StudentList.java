package com.company.prog.m2.studentWihtExcep;

import java.text.ParseException;
import java.util.Date;

public class StudentList {
    private Student[] list = new Student[1];
    private int p = 0;
    private int len = list.length;

    public void add(Student s) {
        if (p == list.length - 1) {
            Student[] list1 = new Student[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                list1[i] = list[i];
            }
            list = list1;
            len = list.length;
        }
        list[p++] = s;
    }

    public int getLenght() {
        return p;
    }

    public Student get(int n) {
        if (n > p || n < 0) {
            System.out.println("Is empty!");
        }
        return list[n];
    }

    public int findName(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return i;
        }

        return -1;
    }

    public int findSurname(String surname) {
        for (int i = 0; i < p; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }

        return -1;
    }

    public int findDate(String birth) {
        Date dt1 = new Date();
        try {
            dt1 = Student.sdf.parse(birth);
        } catch (ParseException e) {
            System.out.println("Wrong date!");
        }
        for (int i = 0; i < p; i++) {
            if (list[i].getBirth().equals(Student.sdf.format(dt1)))
                return i;
        }
        return -1;
    }

    public void del(int n) {
        if (n < 0 || n > p) {
            return;
        }
        Student[] list1 = new Student[list.length];
        for (int i = 0, j = 0; i <= p; i++, j++) {
            if (j == n)
                j++;
            list1[i] = list[j];
        }
        list = list1;
        p--;
    }
}
