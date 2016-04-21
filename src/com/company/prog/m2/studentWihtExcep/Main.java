package com.company.prog.m2.studentWihtExcep;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {

    public static void main(String[] args) {
        StudentList sl = new StudentList();
        Scanner sc = new Scanner(System.in);
        String enter;
        String in;
        boolean b = true;
        for (; ; ) {
            System.out.println("What wold you want?");
            System.out.println("Enter: \"A\" - add student, \"D\" - delete student, \"E\" - exit");
            in = sc.nextLine();
            if (in.equalsIgnoreCase("a")) {
                System.out.println("Enter student data throught the space");
                System.out.println("e.g. Name Surname dd.mm.yyyy and press \"ENTER\"");
                enter = sc.nextLine();
                String[] ar = enter.split(" ");
                if (ar.length != 3) {
                    try {
                        throw new DataFormatException("Wrong data");
                    } catch (DataFormatException e) {
                        System.out.println("Try again...");
                    }
                } else sl.add(new Student(ar[0], ar[1], ar[2]));
            } else if (in.equalsIgnoreCase("e")) {
                break;
            }
        }
        sl.add(new Student("Seva", "Evgienko", "1.1.1986"));
        System.out.println("You exit");
    }
}
