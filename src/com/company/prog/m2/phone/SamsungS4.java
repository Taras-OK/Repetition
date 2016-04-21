package com.company.prog.m2.phone;

/**
 * Created by Palamarjuk on 15.04.2016.
 */
public class SamsungS4 extends Phone {
        private String myNumber = "555-55-55";

    public SamsungS4() {
        System.out.println("S4 Phone constructor");

        touch = true;
        hasWifi = true;
        screenSize = 5;
        callsCount = 0;
        smsCount = 0;
    }

    @Override
    public String getMyNumber() {
        return myNumber;
    }

    @Override
    public void call(String number) {
        System.out.println("SamsungS4 class is calling " + number);
        super.call(number);
        callsCount++;
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("HELLO! " + message + " to " + number);
        smsCount++;
    }

    @Override
    public void answer() {
        System.out.println("Hello! I am SamsungS4");
    }

}


