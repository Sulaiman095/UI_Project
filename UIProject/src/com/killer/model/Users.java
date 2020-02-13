package com.killer.model;

public class Users {
	private String name;
	private String mail;
	private String password;
	private int age;
	private String gender;

	public Users(String name, String mail, String password, int age, String gender) {
		super();
		this.name = name;
		this.mail = mail;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public String getPassword() {
		return password;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

}
