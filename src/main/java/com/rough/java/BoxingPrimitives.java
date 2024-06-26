package com.rough.java;

public class BoxingPrimitives {

	public static void main(String[] args) {

		Integer num1 = new Integer(1); // Boxing
		print(num1);

		Integer num2 = 2; // auto boxing

		print(num2);
		
		int num3 = num2; // auto unboxing 
		print(num3);
		
		int num4 = num2.intValue(); // unboxing
		print(num4);
	}

	private static void print(Object obj) {
		System.out.println(obj);
	}

}
