package com.rough.java;

public class RoughWork {
	
	public static  int classVariable=10;

	public static void main(String[] args) {
		int classVariable = 0;
		short test = 2;
		long testLong = 3000l;
		double testDouble = 23.56;
		float testFloat = 23.56f;
		
		int binaryInt  = 0b10;
		
		
		byte a=0;
		int b = 150;
		a=(byte)b;
		System.out.println(a);
		
		int num1 = 10;
		int num2 = 10;
		add(num1,num2);
		System.out.println(add(num1,num2));
		
		String text;
		
		
	}
	
	
	public static long add(Integer a, Integer b) {
		System.out.println("Int add");
		return a + b;
	}
	
	public static long add(int a, int b) {
		System.out.println("Long add");
		return a + b;
	}
	
	

}
