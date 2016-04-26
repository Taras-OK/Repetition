package com.company.prog.m2.studentWihtExcep;
import java.text.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        StudentList sl = new StudentList();
        Scanner sc = new Scanner(System.in);
        String enter;
        String in;
        boolean b = true;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        for (; ; ) {
            System.out.println("Enter: \"A\" - add student, \"D\" - delete student, \"E\" - exit");
            in = sc.nextLine();
            if (in.equalsIgnoreCase("a")) {
                System.out.println("Enter student data throught the space");
                System.out.println("e.g. Name Surname dd.mm.yyyy and press \"ENTER\"");
                enter = sc.nextLine();
                String[] ar = enter.split(" ");
                Date dt = new Date();
                try {
                    dt = sdf.parse(ar[2]);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("You are trying to enter the incorrect data!");
                    System.out.println("Try again...");
                } catch (ParseException e) {
                    System.out.println("Wrong date!");
                    System.out.println("Try again...");
                }
                if (ar.length == 3) {
                    sl.add(new Student(ar[0], ar[1], ar[2]));
                }
            } else if (in.equalsIgnoreCase("d")) {
                System.out.println("Enter student surname");
                sl.del(sl.findName(sc.nextLine()));
            } else if (in.equalsIgnoreCase("e")) {
                break;
            }else System.out.println("Wrong!");
        }
        System.out.println("You are came out");
    }
}
