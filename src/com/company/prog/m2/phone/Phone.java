package com.company.prog.m2.phone;

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected int callsCount;
    protected int smsCount;
    private String myNumber;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getCallsCount() {
        return callsCount;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public abstract String getMyNumber();

    public void call(String number) {
        //System.out.println("Phone class is calling " + number);
        PhoneList.find(number);
    }

    public abstract void sendSMS(String number, String message);

    public abstract void answer();

}
