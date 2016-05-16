package com.company.prog.m2.serializableHuman;

import java.io.*;
import java.util.Date;

/**
 * Created by Palamarjuk on 16.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human h = new Human("Anna", "Palamarjuk", new Date(DateToMilis.getMillis("10.08.1981")));
        FileOutputStream fo= null;
        ObjectOutputStream oo = null;
        try {
            fo = new FileOutputStream("D:\\Serializable\\test.out");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            oo = new ObjectOutputStream(fo);
            oo.writeObject(h);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Human h1 = null;

        FileInputStream fi = null;
        try {
            fi = new FileInputStream("D:\\Serializable\\test.out");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream oi = new ObjectInputStream(fi);
            h1 = (Human) oi.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(h1.toString());
    }
}
