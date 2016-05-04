package com.company.prog.m2.pathList;

import java.io.IOException;

import static com.company.prog.m2.pathList.PathList.pathList;

/**
 * Created by Palamarjuk on 04.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        try {
            pathList("D:\\MM\\");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
