package com.annotation;

import java.io.Serializable;

class A {
	
	public void showToBeDisplayedFromThisClass() {
		System.out.println("In A show");
	}
}

class B extends A implements Serializable,Cloneable {
	@Override
	public void showToBeDisplayedFromThisClass() {
		System.out.println("In B show");
	}
}

public class TestAnnotate {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.showToBeDisplayedFromThisClass();
		
	}

}
