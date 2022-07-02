package com.session.third;
//encapusilation (all instance variables are private, only way to get them is by use of get method)
public class DonorRegistration {

	private String name;
	private int age;
	private String contact_number;
	private String blood_group;
	private String organ;

	public DonorRegistration(String name, int age, String contact_number, String blood_group, String organ) {
		this.name = name;
		this.age = age;
		this.contact_number = contact_number;
		this.blood_group = blood_group;
		this.organ = organ;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getContact_number() {
		return contact_number;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public String getOrgan() {
		return organ;
	}
}
