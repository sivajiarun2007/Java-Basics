package com.enumeration;

enum StatusCodes {
	RUNNING(0),
	WAITING(1),
	STOPPED(2),
	NEW(3);

	private int price;
	StatusCodes(int i) {
		this.price = i;
		
	}
	
	public int getPrice() {
		return price;
	}
}

public class Status {
	public static void main(String[] args) {
		System.out.println(StatusCodes.RUNNING.toString() + StatusCodes.RUNNING.getPrice());
		System.out.println(StatusCodes.WAITING.toString() + StatusCodes.WAITING.getPrice());
		System.out.println(StatusCodes.STOPPED.toString() + StatusCodes.STOPPED.getPrice());
		System.out.println(StatusCodes.NEW.toString() + StatusCodes.NEW.getPrice());
	}
}
