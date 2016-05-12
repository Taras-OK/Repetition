package com.company.prog.m2.writeFromDifThreads;

import java.util.ArrayList;

/**
 * Created by Palamarjuk on 11.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        String[] pathList = new String[]{"D:\\1.txt", "D:\\2.txt", "D:\\3.txt"};
        ArrayList<ClassReaderFile> threadsList = new ArrayList<ClassReaderFile>();

        for (int i = 0; i < pathList.length; i++) {
            threadsList.add(new ClassReaderFile(pathList[i]));
            threadsList.get(i).run();
        }

        ClassWriterFile cw = new ClassWriterFile(threadsList, "D:\\4.txt");
        cw.run();
    }
}
