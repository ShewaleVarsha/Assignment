package com.Assignment.lesson3;


import java.util.Scanner;
public class ExceptionHandler3_10 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers (please 🙏🏽 dont enter the second number as 0)");
		
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		divideNumbers(first, second);
		
	}
	
	static void divideNumbers(int first, int second)
	{
		int result = 0;
		try {
		 result = first / second;
		 System.out.println("Division of numbers is : " + result);
		}catch(ArithmeticException se) {
			System.out.println("Sorry divide by zero isn't defined yet. ");
		}	
		finally {
			System.out.println("finally always runs...");
		}
	}


}
