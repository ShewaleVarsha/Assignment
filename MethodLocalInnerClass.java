//Assignment 7.4
//7.4. Write a program to demonstrate the working of inner classes.



package com.varsha.training.met;

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		new outer().fun();

	}

}

class outer{
	final int val=89;
	int LENGTH = 90;
	void fun() {
		boolean flag;
		flag = false;
		class Inner{ 
			void in() {
				System.out.println("this is Method Local Inner class..");
				System.out.println(flag);
			}
		}
		new Inner().in();
	}
	
}


