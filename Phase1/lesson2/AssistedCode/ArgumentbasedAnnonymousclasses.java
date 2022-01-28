//Assignment 7.3
//7.3. Write a program to demonstrate the working of inner classes.


package com.varsha.training.met;

public class ArgumentbasedAnnonymousclasses {

	public static void main(String[] args) {
		
		
		
		Other other = new Other();
		other.doSomething(new some() {
			@Override
			public void work()
			{
				System.out.println("This is a Argument Base Annonymous Classes");
			}
		});

	}

}

interface some{
	void work(); 
}

class sub implements some{
	@Override
	public void work() {
		
	}
}
 class Other
 {
	 
	void doSomething(some ref) {
		 ref.work();	 
	 }
 }