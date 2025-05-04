package com.AbstractionAssignment;

public class AbsClassMain {

	public static void main(String[] args) {
		
		AbsImpClass ac= new AbsImpClass();
		
		ac.getName("vedant");
		ac.getGender("Male");
		ac.getCity("Pune");
		ac.getCountry("India");
		
		System.out.println("\n Diplay Information..!!!");
		ac.display();
	}
}

