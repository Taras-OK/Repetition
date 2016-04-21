package com.company.prog.m2.cars;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        Car ferrari = new Car("Ferrari", 20000, 3);
        Car mb = new Car("MB", 10, 5);

        bmw.turnOn();
        ferrari.turnOn();
        mb.turnOn();

        final int[] speeds = new int[]{20, 60, 100};

        for (int s : speeds)
            bmw.start(s, 0.5);
        for (int s : speeds)
            ferrari.start(s, 1);
        for (int s : speeds)
            mb.start(s, 2);

        bmw.turnOff();
        ferrari.turnOff();
        mb.turnOff();

        System.out.println(bmw.getName() + ": " + bmw.getMileage() + ": " + bmw.getRate() + "L.");
        System.out.println(ferrari.getName() + ": " + ferrari.getMileage() + ": " + ferrari.getRate() + "L.");
        System.out.println(mb.getName() + ": " + mb.getMileage() + ": " + mb.getRate() + "L.");
    }
}
