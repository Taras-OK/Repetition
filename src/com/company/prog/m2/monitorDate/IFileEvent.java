package com.company.prog.m2.monitorDate;

import java.nio.file.attribute.FileTime;

public interface IFileEvent {
    void onFileAdded(String s);

    void createdDate(FileTime s);
}
