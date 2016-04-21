package com.company.prog.m2.cars;

public class Car {
    private String name;
    private Engine engine; // ?????
    private Climate climate = new Climate(); // ??????-????????
    private final double COEFF = 20;
    private double rate;

    public Car(String name) {
        this.name = name;
        engine = new Engine(0);
    }

    public Car(String name, double mileage) {
        this.name = name;
        engine = new Engine(mileage);
    }

    public Car(String name, double mileage, double volume) {
        this.name = name;
        engine = new Engine(mileage, volume);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }

    public double getRate() {
        return rate;
    }

    // ??????? ?????
    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    // ????????? ?????
    public void turnOff() {
        climate.turnOff();
        engine.turnOff();
    }

    // ?????????? ????????
    public void start(int speed, double hours) {
        if (!engine.isStarted())
            return;

        double distance = hours * speed;
        engine.addMileage(distance);

        double r = distance * (engine.getVolume() / COEFF);
        rate += r;
    }
}