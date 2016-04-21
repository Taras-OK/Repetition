package com.company.prog.m2.phone;

public class IPhone extends Phone {
	private String myNumber = "555-55-54";

	public IPhone() {
		System.out.println("IPhone constructor");
		myNumber = "555-55-54";
		touch = true;
		hasWifi = true;
		screenSize = 3;
	}

	@Override
	public String getMyNumber() {
		return myNumber;
	}

	@Override
	final public void call(String number) {
		System.out.println("IPhone class is calling " + number);
		super.call(number);
		callsCount++;
	}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("IPhone class is sending sms " + message + " to " + number);
		smsCount++;
	}

	@Override
	public void answer() {
		System.out.println("Hello! I am IPhone");
	}
}
