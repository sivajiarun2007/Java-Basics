package com.rough.java;

import java.util.Objects;

class Car {
	
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	String model;
	int price;
}


public class ObjectComparison {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "BMW";
		c1.price = 10000;
		
		
		Car c2 = new Car();
		c2.model = "BMW";
		c2.price = 10000;
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c2.equals(c2));
		System.out.println(c1 == c2);
	}

}
