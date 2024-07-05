package com.functional.interfc;


@FunctionalInterface
interface testFunc1 {
	void funcInterImpl();
//	void test();
}

public class TestFuncImple {

	public static void main(String[] args) {
		
		/*Lambda imolementation*/
		testFunc1 test = () -> 			System.out.println("Interface implemented");
		test.funcInterImpl();
	}

}
