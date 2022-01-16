//Assignment 5.2
//5.2. Write a program to demonstrate the uses of constructors and its types.


package com.training;

public class ParameterizedConstructor {
	
	int id;
	String Name;
	
	ParameterizedConstructor(int i,String n)
	{
		id=i;
		Name =n;
	}
	
	void dis()
	{
		System.out.println(id +""+ Name);
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor pc1 =new ParameterizedConstructor(1, "Varsha");
		pc1.dis();
	}

}
