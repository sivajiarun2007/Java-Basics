package com.exceptions;

class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public MyException(String messsage) {
		super("Custome Exception: " + messsage);
	}
	
}

public class CustomException {
	public static void main(String[] args) throws MyException {
		throw new MyException("Issue from Main block");
	}
	
}
