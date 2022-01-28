//Assignment 2.4
//2.4 Write a program to demonstrate how and when private access modifiers are used.

package com.training;

 class Public {
	
			public void display() 
		    { 
		        System.out.println("This is Public Access Specifier and this is accessible whole code."); 
		    } 
		}

		public class AccessSpecifier_3 {

			public static void main(String[] args) {
				
				Public p1 = new Public(); 
		        p1.display();  
				
			}

}
