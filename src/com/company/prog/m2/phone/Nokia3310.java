package com.company.prog.m2.phone;

public class Nokia3310 extends Phone {
	private String myNumber = "555-55-52";

	public Nokia3310() {
		System.out.println("Nokia3310 constructor");

		touch = false;
		hasWifi = false;
		screenSize = 2;
	}

	@Override
	public String getMyNumber() {
		return myNumber;
	}

	@Override
	public void call(String number) {
		System.out.println("Nokia3310 class is calling " + number);
		super.call(number);
		callsCount++;
	}

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("Nokia3310 class is sending sms " + message + " to " + number);
		smsCount++;
	}

	@Override
	public void answer() {
		System.out.println("Hello! I am Nokia3310");
	}
}
