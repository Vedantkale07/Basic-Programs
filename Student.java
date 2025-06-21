package com.PolymorphismAssignment;

public class Student {
	String name;
	int age;
	String email;
	
	void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void setData(String name,int age, String email)
	{
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	void display()
	{
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student email: "+email);

	}

}
