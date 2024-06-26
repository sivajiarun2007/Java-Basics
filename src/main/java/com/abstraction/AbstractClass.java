package com.abstraction;

abstract class Car implements CarInterFace {
	public abstract void drive();
}

class ElectricCar extends Car {

	public void drive() {
		System.out.println("Electric car drive");
	}

	@Override
	public void playMusic() {
		System.out.println("Play music..");
	}

}

public class AbstractClass {

	public static void main(String[] args) {

	}

}
