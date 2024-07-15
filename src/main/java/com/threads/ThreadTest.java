package com.threads;

public class ThreadTest {
	
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello printed afte 5s");
	}

}
