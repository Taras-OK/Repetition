package com.company.prog.m2.cars;

public class Engine {
    private double mileage;
    private double volume;
    private boolean started;
    
    public Engine(double mileage) {
        this.mileage = mileage;
        volume = 2.0;
    }

    public Engine(double mileage, double volume) {
        this.mileage = mileage;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
    
    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }
    
    public boolean isStarted() {
        return started;
    }
    
    public void turnOn() {
        started = true;
    }
    
    public void turnOff() {
        started = false;
    }
}
