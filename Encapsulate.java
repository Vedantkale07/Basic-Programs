package com.Encapsulation;

public class Encapsulate {
	
	private  String name;
	private int rollno;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
		System.out.println("Roll no:"+this.rollno);
	}
	

}
