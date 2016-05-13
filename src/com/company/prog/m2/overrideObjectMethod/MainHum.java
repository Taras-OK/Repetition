package com.company.prog.m2.overrideObjectMethod;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Palamarjuk on 13.05.2016.
 */
public class MainHum {
    public static void main(String[] args) {

        ArrayList<Human> humanList = new ArrayList<Human>();


//!!!!      See how GC working! (@Override method finalize)
        /*for (int i = 0; i < 100000; i++) {
            new Human("Andrey", "Voronoy", new Date(DateToMilis.getMillis("5.11.1988")));
        }*/

        humanList.add(new Human("Andrey", "Voronoy", new Date(DateToMilis.getMillis("5.11.1988"))));
        humanList.add(new Human("Andrey", "Voronoy", new Date(DateToMilis.getMillis("5.11.1988"))));
        humanList.add(new Human("Nikolay", "Poroshenko", new Date(DateToMilis.getMillis("3.2.1963"))));
        humanList.add(new Human("Ivan", "Popov", new Date(DateToMilis.getMillis("13.5.1933"))));
        humanList.add(new Human("Fedor", "Onischenko", new Date(DateToMilis.getMillis("5.11.1974"))));
        humanList.add(new Human("Andrey", "Voronoy", new Date(DateToMilis.getMillis("5.11.1988"))));

        Human hum = null;
        try {
            hum = (Human) humanList.get(2).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        for (Human h : humanList) {
            System.out.print(h.toString());
            System.out.println("| Age: " + h.hashCode());
        }
        System.out.println("__________________________");
        System.out.println(humanList.get(0).equals(humanList.get(1)));
        System.out.println(humanList.get(0).equals(humanList.get(5)));
        System.out.println(humanList.get(5).equals(humanList.get(1)));
        System.out.println(humanList.get(2).equals(hum));
        System.out.println(hum.getBirth()==humanList.get(2).getBirth());
        System.out.println(hum.getBirth().equals(humanList.get(2).getBirth()));

    }
}
