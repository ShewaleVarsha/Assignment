//Assignment 4
//4.	Write a program to demonstrate different methods of different return types.

package com.training;

import java.util.Scanner;
public class DifferentMethods {
	void Addition(float x, float y)
	{
		System.out.println("Addition of two float Numbers : "+(x+y));
	}
	
	public void area(int b,int h)//method overload here
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) //method overload here
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
    
    int operation(int val){//call by method here 
    	System.out.println("val  : "+val*10/100);
    	return(val);
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two Numbers: ");
		int b = scan.nextInt();
		int h = scan.nextInt();
		DifferentMethods method = new DifferentMethods();
		method.area(b, h);
				
		System.out.println("----------------------------------");
	
		System.out.println("Enter The One Number : ");
		DifferentMethods method1 = new DifferentMethods();
		int r = scan.nextInt();
		method1.area(r);
				
		System.out.println("----------------------------------");
				
		System.out.println("Enter the one value: ");
		int val = scan.nextInt();
		method.operation(val);
				
		System.out.println("----------------------------------");
				
		System.out.println("Enter two Float Numbers: ");
		float x = scan.nextFloat();
		float y =scan.nextFloat();
		method.Addition(x, y);
		

	}

}
