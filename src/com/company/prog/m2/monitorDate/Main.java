package com.company.prog.m2.monitorDate;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Monitor m = new Monitor("d:\\1.txt", new FileEvent());
		try {
			m.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}