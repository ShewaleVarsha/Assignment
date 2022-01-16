//Assignment 5.1
//5.1. Write a program to demonstrate the uses of constructors and its types.


package com.training;

public class Constructor {
	int id;
	String Name;
	
	Constructor()
	{
		System.out.println("This is the Default Constructor");
	}
	
	void show()
	{
		System.out.println(id + "" + Name);
	}
	
	

	public static void main(String[] args) {
		
		Constructor c1 = new Constructor();
		c1.show();
		

	}

}
