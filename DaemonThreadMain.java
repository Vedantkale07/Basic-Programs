package com.multithreading;

public class DaemonThreadMain {
	public static void main(String[] args) {
	
		DaemonThread d= new DaemonThread();
		
		System.out.println(d.isDaemon());
		
		d.setDaemon(true);
		System.out.println(d.isDaemon());

		System.out.println(d.isAlive());
		
    }
}
