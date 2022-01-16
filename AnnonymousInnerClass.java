//Assignment 7.2
//7.2. Write a program to demonstrate the working of inner classes.


package com.varsha.training.met;

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		
		Remote theRemote = new Remote() {
			@Override
			public void workFromHome() {
				System.out.println("cold, freezing");
				System.out.println("Annonymous Inner Class");
			}
		};
		theRemote.workFromHome();

	}
}

interface Remote{
	void workFromHome();
}
