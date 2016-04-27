package com.company.prog.m2.monitorDate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Monitor {
    String file;
    IFileEvent event;

    public Monitor(String file, IFileEvent event) {
        this.file = file;
        this.event = event;
    }

    public void start() throws IOException {
        while (true) {
            File f = new File(file);

            if (f.exists() && f.isFile()) {
                if (event != null) {
                    event.onFileAdded(file);
                    Path path = f.toPath();
                    BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
                    event.createdDate(attr.creationTime());

                }
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("Waiting...");
        }
    }
}
