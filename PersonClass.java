package com.arraylist;

public class PersonClass {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PersonClass(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String toString() {
		return name + " " + age + " ";
	}

}
