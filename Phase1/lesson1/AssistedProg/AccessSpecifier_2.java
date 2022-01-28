//Assignment 2.3
//2.3 Write a program to demonstrate how and when private access modifiers are used.


package com.training;

class Protected1 {

	
		protected void show() 
	    { 
	        System.out.println("This is protected access specifier and protected aceess modifier is accessible in another package."); 
	    } 
	}

	public class AccessSpecifier_2 extends Protected1 {

		public static void main(String[] args) {
			AccessSpecifier_2 as = new AccessSpecifier_2 ();   
		      as.show();  
		}

	}
	