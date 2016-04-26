package com.company.prog.m2.compare;

public class Human implements Comparable{
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Object o) {
        Human h = (Human) o;

        if (age > h.getAge()) {
            return -1;
        } else if (age == h.getAge()) {
            return 0;
        } else if (age < h.getAge()) {
            return 1;
        }
        return 0;
    }
}
