package com.abstraction;


abstract class InnerA {
	public void show() {
		System.out.println("Inside A..");
	}
}

public class AnonymInnerClass {

	public static void main(String[] args) {
		InnerA innerA = new InnerA() {
			public void show() {
				System.out.println("Inside Anonym A..");
			}
		};
		innerA.show();
	}

}
