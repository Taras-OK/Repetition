package com.company.prog.m2.monitorDate;

public class FileEvent implements IFileEvent {
	@Override
	public void onFileAdded(String s) {
		System.out.println("File added: " + s);
	}
}
