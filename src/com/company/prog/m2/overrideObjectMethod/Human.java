package com.company.prog.m2.overrideObjectMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Palamarjuk on 13.05.2016.
 */
public class Human implements Cloneable{

    private String name;
    private String surname;
    private Date birth;
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public Human(String name, String surname, Date birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    @Override
    public int hashCode() {
        long i = this.birth.getTime() ^ 1900;
        return (int) i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (this.getClass() != obj.getClass()) // ДЗ
            return false;
        Human other = (Human) obj;
        return (this.birth.getTime() == other.birth.getTime()) && (this.name.equals(other.getName()) && (this.surname.equals(other.getSurname())));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Human o = (Human) super.clone();
        o.birth = (Date) birth.clone(); // создаем копию отдельно
        return o;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", Birth: " + sdf.format(birth);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Is death!");
        super.finalize();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Date getBirth() {
        return this.birth;
    }
}
