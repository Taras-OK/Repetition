package com.company.prog.m2.phone;

public class MainClass {

	public static void main(String[] args) {
		// Phone p = new Phone(); ������ �.�. ����� �����������

		Nokia3310 nokia = new Nokia3310();
		PhoneList.add(nokia);
		IPhone iphone = new IPhone();
		PhoneList.add(iphone);
		IPhone5 iphone5 = new IPhone5();
		PhoneList.add(iphone5);
		SamsungS4 s4 = new SamsungS4();
		PhoneList.add(s4);


		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
		nokia.call("555-55-54");
		nokia.sendSMS("567-78-89", "text message");
		
		System.out.println("----------------------------------");

		System.out.println("IPhone screent size: " + iphone.getScreenSize());
		iphone.call("555-55-52");
		iphone.sendSMS("567-78-89", "text message");
		iphone.sendSMS("567-78-89", "text message");

		System.out.println("----------------------------------");

		System.out.println("IPhone screent size: " + iphone5.getScreenSize());
		iphone5.call("555-55-53");
		iphone5.call("123-45-67");
		iphone5.call("123-45-67");
		iphone5.sendSMS("567-78-89", "text message");
		System.out.println("----------------------------------");

		System.out.println("S4 screent size: " + s4.getScreenSize());
		s4.call("555-55-55");
		s4.sendSMS("567-78-89", "text message");
		s4.sendSMS("567-78-89", "text message");
		s4.sendSMS("567-78-89", "text message");
		s4.sendSMS("567-78-89", "text message");
		System.out.println("----------------------------------");


		System.out.println("----------------------------------");
		System.out.println(s4.getCallsCount()+"| |"+s4.getSmsCount());
		System.out.println(iphone5.getCallsCount()+"| |"+iphone5.getSmsCount());
		System.out.println(iphone.getCallsCount() + "| |" + iphone.getSmsCount());
		System.out.println("----------------------------------");
		System.out.println(PhoneList.phoneList[0].getScreenSize());
		System.out.println(PhoneList.phoneList[1].getScreenSize());
	}
}
