package com.company.prog.m2.writeFromDifThreads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by Palamarjuk
 */
public class ClassWrite extends Thread {

    ArrayList<ClassReade> threadsList;
    String outFile;
    OutputStream os = null;

    public ClassWrite(ArrayList<ClassReade> threadsList, String outFile) {
        this.threadsList = threadsList;
        this.outFile = outFile;
    }

    @Override
    public void run() {
        byte[] b = new byte[1024];
        int r = 0;
        try {
            os = new FileOutputStream(outFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //while (!isInterrupted()) {
            for (int i = 0; i < threadsList.size(); i++) {
                while (r >= 0) {
                    try {
                        r = threadsList.get(i).read(b);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (r > 0) {
                        try {
                            os.write(b);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                r = 0;
                threadsList.get(i).interrupt();
            }
       // }
    }
}
