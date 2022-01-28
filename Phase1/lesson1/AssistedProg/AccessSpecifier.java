//Assignment 2.1
//2.1 Write a program to demonstrate how and when Default access modifiers are used.

package com.training;

class AccessSpecifier1
{ 
  void show() 
     { 
         System.out.println("This is the Default Access Specifier..."); 
     } 
} 

public class AccessSpecifier
{

	public static void main(String[] args)
	{
		
		System.out.println("We have to also called package-privete Access Specifier.");
		AccessSpecifier1 obj = new AccessSpecifier1(); 		  
        obj.show(); 

	}
}

		
		

	
	
	
	
	
	
	
	