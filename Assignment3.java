package com.exceptionHandling;

public class Assignment3 {

	public static void main(String[] args) {
		
        int a[]= {2,4,6,12,22,24};
		
		try{
			//System.out.println(a[9]);
			System.out.println(a[3]/0);
		}catch (ArrayIndexOutOfBoundsException | ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
