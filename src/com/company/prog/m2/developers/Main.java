package com.company.prog.m2.developers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        String[] name = new String[]{"James", "Christopher", "Ronald", "Mary", "Lisa", "Michelle",
                "John", "Daniel", "Anthony", "Patricia", "Nancy", "Laura",
                "Robert", "Paul", "Kevin", "Linda", "Karen", "Sarah",
                "Michael", "Mark", "Jason", "Barbara", "Betty", "Kimberly",
                "William", "Donald", "Jeff", "Elizabeth", "Helen", "Deborah",
                "Joseph", "Edward", "Margaret", "Ruth", "Thomas", "Brian"};

        Developer[] developers = new Developer[100];
        for (int i = 0; i < developers.length; i++) {
            Developer jun = new JuniorDeveloper();
            Developer sen = new SeniorDeveloper();
            Developer team = new TeamLeadDeveloper();
            Developer mid = new MiddleDeveloper();
            Developer[] random = new Developer[]{jun, sen, team, mid};
            developers[i] = random[ran.nextInt(3)];
            developers[i].setName(name[ran.nextInt(name.length)]);
            developers[i].setBasicSalary(ran.nextInt(700));
            developers[i].setExperience(ran.nextInt(10));
        }
        for (Developer d:developers) {
            if (d instanceof SeniorDeveloper && d.getSalary() > 1500) {
                System.out.println(d.getName() + ", has salary: " + d.getSalary() + "$ and experience: " + d.getExperience() + " year.");
            }
        }
        Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new SeniorDeveloper("Jack", 500, 5),
                new SeniorDeveloper("Jack", 500, 5),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLeadDeveloper("Robby", 500, 7),
                new TeamLeadDeveloper("Robby", 500, 7),
                new TeamLeadDeveloper("Robby", 500, 7),
                new MiddleDeveloper("Andre", 520, 5),
                new MiddleDeveloper("Andre", 520, 5),
                new MiddleDeveloper("Andre", 520, 5)
        };

        StringBuilder sb;

        for (Developer d : list) {
            sb = new StringBuilder() // !!!
                    .append(d.getName())
                    .append(": ")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());

            System.out.println(sb.toString());
        }
        JuniorDeveloper[] listJun = new JuniorDeveloper[5];
        SeniorDeveloper[] listSen = new SeniorDeveloper[5];
        TeamLeadDeveloper[] listTeam = new TeamLeadDeveloper[5];
        MiddleDeveloper[] listM = new MiddleDeveloper[5];
        int jun1 = 0;
        int sen1 = 0;
        int team1 = 0;
        int m = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof JuniorDeveloper) {
                listJun[jun1] = (JuniorDeveloper) list[i];
                jun1++;
            } else if (list[i] instanceof SeniorDeveloper) {
                listSen[sen1] = (SeniorDeveloper) list[i];
                sen1++;
            } else if (list[i] instanceof TeamLeadDeveloper) {
                listTeam[team1] = (TeamLeadDeveloper) list[i];
                team1++;
            } else if (list[i] instanceof MiddleDeveloper) {
                listM[m] = (MiddleDeveloper) list[i];
                m++;
            }
        }
        listJun = Arrays.copyOf(listJun, jun1);
        System.out.println("Jun-------------------------------");
        for (Developer d : listJun) {
            System.out.print(d.getName() + "| ");
        }
        System.out.println();
        System.out.println("Senior----------------------------");
        for (Developer d : listSen) {
            if (d != null)
                System.out.print(d.getName() + "| ");
        }
        System.out.println();
        System.out.println("Team------------------------------");
        for (Developer d : listTeam) {
            if (d != null)
                System.out.print(d.getName() + "| ");
        }
        System.out.println();
        System.out.println("Middle----------------------------");
        for (Developer d : listM) {
            if (d != null)
                System.out.print(d.getName() + "| ");
        }
    }
}
