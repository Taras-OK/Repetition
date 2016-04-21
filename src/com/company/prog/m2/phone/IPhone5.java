package com.company.prog.m2.phone;

public class IPhone5 extends IPhone {
	private String myNumber = "555-55-53";

	public IPhone5() {

		System.out.println("IPhone5 constructor");

		screenSize = 4;
	}

	@Override
	public String getMyNumber() {
		return myNumber;
	}
	
	/*@Override
	public void call(String number) {
		System.out.println("IPhone class is calling " + number);
	}*/ // ������ �.�. ����� final

	@Override
	public void sendSMS(String number, String message) {
		System.out.println("IPhone5 class is sending sms " + message + " to " + number);
		super.sendSMS(number, message);
	}

	@Override
	public void answer() {
		System.out.println("Hello! I am IPhone5");
	}
}
