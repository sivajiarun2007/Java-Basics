package com.rough.java;

public class VolatileTest {

	private static  int counter = 0;
	private static  int local_counter = 0;

	public static void main(String[] args) {
//    	int local_counter = counter;
		Runnable t1 = () -> {
			while (counter < 10) {
				if (local_counter != counter) {
					System.out.println("{T1} the value has changed");
	    			local_counter = counter;
				}
			}
			

		};

		Runnable t2 = () -> {

			while (counter < 10) {
				System.out.println("{T2} th counter value has been incremented to: "+ counter);
				counter = counter + local_counter + 1;
			}

		};

		Thread T1 = new Thread(t1);
		Thread T2 = new Thread(t2);

		T1.start();
		T2.start();

	}
}