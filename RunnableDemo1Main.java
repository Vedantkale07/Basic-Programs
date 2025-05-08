package com.multithreading;

public class RunnableDemo1Main {
	
	public static void main(String[] args) {
		
		RunnableDemo1 rd1= new RunnableDemo1();
		Thread t1=new Thread(rd1);
		t1.start();
		
		RunnableDemo1 rd2= new RunnableDemo1();
		Thread t2=new Thread(rd2);
		t2.start();
		
		RunnableDemo1 rd3= new RunnableDemo1();
		Thread t3=new Thread(rd3);
		t3.start();
		
		RunnableDemo1 rd4= new RunnableDemo1();
		Thread t4=new Thread(rd4);
		t4.start();
	}

}
