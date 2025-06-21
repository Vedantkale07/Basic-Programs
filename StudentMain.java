package com.PolymorphismAssignment;

public class StudentMain {
	public static void main(String[] args) {
		Student s1= new Student();
		
		s1.setData("vedant", 21);
		s1.setData("Vedant", 22,"vedantkale0707@gmail.com");
		s1.display();
		
		System.out.println("\n_____ 2nd student info____ \n");
		
		Student s2= new Student();
		s2.setData("Gaurav", 21);
		s2.setData("Gaurav", 23,"gauravkale0707@gmail.com");
		s2.display();
		
	}

}
