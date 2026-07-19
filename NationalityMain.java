package com.exceptionHandling;

import java.util.Scanner;

public class NationalityMain
{
	public static void main(String[] args) throws InvalidCountryException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter country name:");
		String country=sc.next();
		
		NationalityClass nc=new NationalityClass();
		
		nc.Nationality(country);
		
		sc.close();
	}
}
