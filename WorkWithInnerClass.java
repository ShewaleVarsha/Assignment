//Assignment 7.1
//7.1. Write a program to demonstrate the working of inner classes.


package com.varsha.training;

public class WorkWithInnerClass {

	public static void main(String[] args) {
		new outer().new Inner().in();
	}

}

class outer{
	private int val;
	class Inner{
		int val;
		void in() {
			int val=90;
			System.out.println("This is the Inner Class...");
			System.out.println("print instance value: "+val);
			System.out.println("print instance value : "+this.val);
			System.out.println("print local value: " +outer.this.val);
		}
	}

	void met() {
	Inner ref = new Inner();
	ref.in();
	}
}



