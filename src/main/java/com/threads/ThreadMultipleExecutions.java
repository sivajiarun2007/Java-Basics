package com.threads;


class Constructor {
	
}
class Counter {
	int count;
	
	public void increment() {
		count++;
	}
}

public class ThreadMultipleExecutions {
	

	public static void main(String[] args) throws InterruptedException {
		Counter countObj = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i =0; i<100000; i++) {
				countObj.increment();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i =0; i<100000; i++) {
				System.out.println("Count value: " + countObj.count);
			}
		});
		
		t1.start();
		t2.start();
		
//		t1.join();
//		t2.join();
		
//		System.out.println("Count value: " + countObj.count);
		
	}

}
