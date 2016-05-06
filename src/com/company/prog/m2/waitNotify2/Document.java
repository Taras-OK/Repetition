package com.company.prog.m2.waitNotify2;

// схематически :)
public class Document {
	private byte[] data;

	public void setData(byte[] data) {
		this.data = data;
	}

	public boolean ready() {
		return data != null;
	}
}
