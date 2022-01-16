//Assignment 1
//1.Write a program which will take a string as input and will convert it into other primitive data types.

package com.training;

public class PrimitiveData {

	public static void main(String[] args) {		
		
		System.out.println("This is the implicit type casting....");
		
		char a='A';
		System.out.println("Value of a: "+a);
				
		int b=a;
		System.out.println("Value of b: "+b);
			
				
		long d=a;
		System.out.println("Value of d: "+d);
				
		double e=a;
		System.out.println("Value of e: "+e);
		
		float c=a;
		System.out.println("Value of c: "+c);
				
						
		System.out.println("------------------------------------------");
				
		System.out.println("This is the explicit....");
				
				
		double x=84.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
				
	}

}















