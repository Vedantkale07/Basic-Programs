package com.multithreading;

public class StaticSyncMain {
	
	public static void main(String[] args) {
		
		StaticSyncOne t1= new StaticSyncOne();
		
		StaticSyncTwo t2= new StaticSyncTwo();
		
		t1.start();
		t2.start();
	}

}
