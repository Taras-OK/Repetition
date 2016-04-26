package com.company.prog.m2.compare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human[] list = {new Human(40), new Human(20), new Human(3), new Human(7)};
        Arrays.sort(list, new HumanComparator()); //implements Comparator
        for (Human h : list) {
            System.out.print(h.getAge() + " ");
        }
        System.out.println();
        Arrays.sort(list); // inverse sorting; implements Comparable
        for (Human h : list) {
            System.out.print(h.getAge() + " ");
        }
    }
}
