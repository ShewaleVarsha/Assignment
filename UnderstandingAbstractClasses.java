package com.Assignment.lesson3;


public class UnderstandingAbstractClasses {

	public static void main(String[] args) {
		
//		new Human();//We can't do this now...
		
		Lakshmi lakshmi = new Lakshmi();
		
		lakshmi.eat();
		lakshmi.walk();
		lakshmi.breathe();
		
		new Imran().eat();

	}

}

abstract class Human{
	abstract void eat();
	abstract void walk();
	
	void breathe() {
		System.out.println("Generic way of breathing...");
	}
}

class Imran extends Human{
	@Override
	void eat() {
		System.out.println("Imran's own way of eating...");
		
	}
	
	@Override
	void walk() {
		System.out.println("Imran's walk...");
		
	}
}

class Lakshmi extends Human{
	@Override
	void eat() {
		System.out.println("Lakshmi's eat...");
		
	}
	
	@Override
	void walk() {
		System.out.println("Lakhsmi's walk...");
		
	}
}