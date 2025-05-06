package com.string;

import java.util.Arrays;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String string="vedant";
		
	    System.out.println(string);
	    System.out.println("reverse String is:");
		ReverseString.reverseString(string);
		
	}
	
	public static void reverseString(String str) {
		
		char [] ch= str.toCharArray();
		
		int n=str.length();
		
		while(n>0) {
			
			System.out.print(ch[n-1]+" ");
			n--;
			
		}
	}

}
