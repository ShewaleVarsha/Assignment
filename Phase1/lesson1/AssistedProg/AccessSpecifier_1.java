//Assignment 2.2
//2.2 Write a program to demonstrate how and when private access modifiers are used.

package com.training;

class Private
{ 
   private void show() 
    { 
        System.out.println("this is the private access_specifier method.."); 
    } 
} 

public class AccessSpecifier_1 {

	public static void main(String[] args) {
		
		System.out.println("We can't access the private method of another class");
		AccessSpecifier_1  obj = new AccessSpecifier_1 (); 
         
        //obj.show(); can not access Another class private method

	}
}



	
