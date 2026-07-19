package com.exceptionHandling;

import java.util.Scanner;

public class MultiplyTryCatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter array index: ");
		int index=sc.nextInt();
		System.out.println("Enter demonimator: ");
		int demo=sc.nextInt();
		
		System.out.println("displaing index of given elements:");
		try {
			System.out.println(a[index]);
			if(index>=0) {
				System.out.println("perforom division..!!");
				try {
						int div=a[index]/demo;
						System.out.println("division is: "+div);
					
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nthanks ..!!");
	}
}
