package com.company.prog.m2.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	private String name;
	private String surname;
	private Date birth;

	public Student(String name, String surname, String birth) {
		this.name = name;
		this.surname = surname;
		try {
			this.birth = sdf.parse(birth);
		} catch (ParseException e) {
			System.out.println("Wrong date!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirth() {
		return sdf.format(birth);
	}

	public void setBirth(String birth) {
		try {
			this.birth = sdf.parse(birth);
		} catch (ParseException e) {
			System.out.println("Wrong date!");
		}
	}
}
