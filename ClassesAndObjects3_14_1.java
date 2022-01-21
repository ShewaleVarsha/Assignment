package com.Assignment.lesson3;

public class ClassesAndObjects3_14_1 {
	
public static void main(String[] args) {
		
//		Syantax for creating a new object
//		Type identifier = new Type();
		
//		Create an object of Human
//		Human ref = new Human();
		
		Human ref;
		
		ref = new Human();
		
		Human otherRef = new Human();
		
		Human sameer = new Human();
		
		ref.legs = 2;
		ref.eyes = 2;
		
		ref.breathe();
		ref.walk();
		
		new Human().sleep();//Valid way of creating objects
		
	}

}


class Human{
	int legs, eyes;
	float fingers;
	
	void breathe() {
		System.out.println("Human's breathe");
	}
	
	void sleep() {
		System.out.println("Human's sleep");
	}
	
	void walk() {
		System.out.println("Human's walk");
	}
}


