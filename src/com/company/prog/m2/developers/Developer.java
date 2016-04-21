package com.company.prog.m2.developers;

public class Developer {

    protected String name;
    protected double basicSalary;
    protected int experience;

    public Developer() {
    }

    public Developer(String name, double basicSalary, int experience) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getSalary() {
        return basicSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
