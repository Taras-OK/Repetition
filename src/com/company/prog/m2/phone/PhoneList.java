package com.company.prog.m2.phone;

public class PhoneList {
    public static Phone[] phoneList = new Phone[10];
    private static int el;

    public static void add(Phone p) {
        if (el >= phoneList.length) {
            Phone[] newList = new Phone[phoneList.length * 2];
            for (int i = 0; i <= el; i++) {
                newList[i] =(Phone) phoneList[i];
            }
            phoneList = newList;
        }
        phoneList[el++] = p;
    }

    public static void find(String number) {
        for (int i = 0; i < el; i++) {
            if (phoneList[i].getMyNumber().equals(number)) {
                phoneList[i].answer();
            } else {
                //System.out.println("Not found!");
            }
        }
    }

}
