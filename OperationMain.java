package com.exceptionHandling;

import java.util.Scanner;

public class OperationMain {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numrator:");
		int num=sc.nextInt();
		System.out.println("enter denominator: ");
		int deno=sc.nextInt();
		
		OpeationClass oc=new OpeationClass();
		oc.operation(num, deno);
		
		sc.close();
	}

}
