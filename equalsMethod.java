package com.string;

//equals method check content of string 

public class equalsMethod {
	public static void main(String[] args) {
		
		String name ="vedant";
		
		String str=new String("vedant");
		
		String str2="VEDant";
	
		String s1="gaurav";
		// equals method -> return true or false
		
		boolean s=str.equals(name);
		System.out.println(s);
		
		
		System.out.println(str2.equalsIgnoreCase(name)); //0
		
		System.out.println(name.compareToIgnoreCase(s1));
		
		
		
		
		
	}

}
