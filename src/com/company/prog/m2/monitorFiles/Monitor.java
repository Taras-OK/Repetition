package com.company.prog.m2.monitorFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Monitor {
    String[] fileList;
    IFileEvent event;

    public Monitor(String[] fileLis, IFileEvent event) {
        this.fileList = fileLis;
        this.event = event;
    }

    public void start() throws IOException {
        int count = 0;
        while (count <= fileList.length) {
            String file = fileList[count];
            File f = new File(file);

            if (f.exists() && f.isFile()) {
                if (event != null) {
                    event.onFileAdded(file);
                    Path path = f.toPath();
                    BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
                    event.createdDate(attr.creationTime());
                    count++;
                }
                if (count == fileList.length) break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Waiting...");
        }
    }
}
