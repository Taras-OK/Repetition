package com.company.prog.m2.developers;

/**
 * Created by Palamarjuk on 15.04.2016.
 */
public class MiddleDeveloper extends Developer {
    public MiddleDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }

    public MiddleDeveloper() {
    }

    @Override
    public double getSalary() {
        double c = (basicSalary * 1.5) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
        return c;
    }
}
