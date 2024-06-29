package com.abstraction;


public interface InterfaceTesting {
	
	long testAttr=0; //by default static final, hence a constant
	
	public abstract void test();
	void test1();
	
	//private void test3(); // not allowed
	default void test4() { /// default methods allow implementation
		System.out.println("Print default method...");
	};

}
