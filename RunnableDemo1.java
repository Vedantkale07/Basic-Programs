package com.multithreading;

public class RunnableDemo1 implements Runnable {
	
	public void run()
	{
		for (int i = 0; i <7; i++) {
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			
		}
	}

}
