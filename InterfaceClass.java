package com.interfaceProgram;

public interface InterfaceClass 
{
	void add(int a,int b);
	void sub(int a,int b);
	void mul(int a,int b);
	
	default void m1()
	{
		System.out.println("Heyy from default method..!!");
		
	}
	
	private void display()
	{
		System.out.println("Hey from private interface class");
	}
	
	
	
}
