package com.company.prog.m2.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Palamarjuk on 05.05.2016.
 */
public class ConcatSIS {

    public static void main(String[] args) {
        ArrayList<String> fileList = new ArrayList<String>();
        fileList.add("D:\\oneS.txt");
        fileList.add("D:\\twoS.txt");
        fileList.add("D:\\threeS.txt");

        Vector v = new Vector(fileList);

        String outFile = "D:\\ConcatS.txt";
        try {
            concatFiles(fileList, outFile);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public static void concatFiles(ArrayList fileList, String outFile) throws FileNotFoundException {
        Vector vector = new Vector(fileList.size());
        try{
            for (int i = 0; i < fileList.size(); i++) {
                vector.addElement(new FileInputStream((String) fileList.get(i)));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SequenceInputStream sis = new SequenceInputStream(vector.elements());
        FileOutputStream fos = new FileOutputStream(outFile);

        try {
            int b;
            while (true) {
                b = sis.read();
                if (b == -1)
                    break;
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                sis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
