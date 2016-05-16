package com.company.prog.m2.serializableHuman;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Palamarjuk on 13.05.2016.
 */
public class MainHum {
    public static void main(String[] args) {

        Human hum1 = null;
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {
            fis = new FileInputStream("D:\\Serializable\\temp.out");
            try {
                oin = new ObjectInputStream(fis);
                int i = 0;
                while (i++ < 3) {
                    hum1 = (Human) oin.readObject();
                    System.out.println(hum1.toString());
                    if (oin == null) {
                        break;
                    }
                }

                /*oin = new ObjectInputStream(fis);
                hum1 = (Human) oin.readObject();
                System.out.println(hum1.toString());

                hum1 = (Human) oin.readObject();
                System.out.println(hum1.toString());

                hum1 = (Human) oin.readObject();
                System.out.println(hum1.toString());*/

            } catch (EOFException q) {

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("You must enter 10 people's name and they birth");

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + i + " name:");
            String name = scanner.nextLine();
            System.out.println("Enter " + i + " surname:");
            String surname = scanner.nextLine();
            System.out.println("Enter the birth date (For example: 5.2.1956):");
            Date birth = new Date(DateToMilis.getMillis(scanner.nextLine()));
            humanList.add(new Human(name, surname, birth));
        }

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("D:\\Serializable\\temp.out");
            oos = new ObjectOutputStream(fos);

            int i = 0;

            while (i < humanList.size()) {
                oos.writeObject(humanList.get(i));
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}