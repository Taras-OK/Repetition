package com.company.prog.m2.streams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Palamarjuk on 04.05.2016.
 */
public class ReadWriteFile {

    public ReadWriteFile(String path) throws IOException {


        FileInputStream read = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(read);
        try {
            String s = dis.readUTF();
            System.out.println(s);
        } catch (IOException e) {

        }finally {
            dis.close();
        }

        //System.out.println(s);
    }
}

