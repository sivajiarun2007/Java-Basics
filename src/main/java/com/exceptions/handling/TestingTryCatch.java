package com.exceptions.handling;

public class TestingTryCatch {

	public static void main(String[] args) {
		
		int denominator = 1;
		
		try {
			int res = 10/denominator;
			System.out.println("Inside try");
//			System.exit(1); -- Finally will not be called
		} catch (Exception e) {
			System.out.println("Inside catch");
		} finally {
			System.out.println("Inside finaly");
		}
	}

}
