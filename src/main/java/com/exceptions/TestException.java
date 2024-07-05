package com.exceptions;

public class TestException {
	
	public static void main(String[] args) {
		
		
		int i= 0;
		int j=0;
		
		try {
			j=15;
			j= j/0;
		} catch(Exception e) {
			System.out.println("getting into catch"+ e);
			throw new NullPointerException();
		}
		
		System.out.println(j);
	}

}
