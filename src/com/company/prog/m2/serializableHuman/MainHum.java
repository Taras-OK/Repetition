package com.company.prog.m2.serializableHuman;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Palamarjuk on 13.05.2016.
 */
public class MainHum {
    public static void main(String[] args) {

        Human hum1;
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {
            fis = new FileInputStream("D:\\Serializable\\temp.out");
            try {
                oin = new ObjectInputStream(fis);
            } catch (EOFException q) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (oin != null) {
                hum1 = (Human) oin.readObject();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException e) {
                //e.printStackTrace();
            }
        }
        ArrayList<Human> humanList = new ArrayList<Human>();

    }
}