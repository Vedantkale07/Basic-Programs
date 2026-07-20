package com.exceptionHandling;

public class Assignment1
{
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,66};
		
		try {
			System.out.println(a[9]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			System.out.println( a[3]/0 );
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
