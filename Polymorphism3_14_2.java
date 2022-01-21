package com.Assignment.lesson3;

public class Polymorphism3_14_2 {
	
	public static void main(String[] args) {
		Polymorphism3_14_2 ref = new Polymorphism3_14_2();
		
		int result  = ref.add(45, 10);
        int result1  = ref.add(45, 10, 70);
		
		System.out.println("Addition is : " + result);
		System.out.println("Addition is : " + result1);

	} 
	
	int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	int add(int firstNumber, int secondNumber, int thirdNumber) {
		return firstNumber + secondNumber + thirdNumber;
	}
	
	int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
		return firstNumber + secondNumber + thirdNumber + fourthNumber;
	}
	
	int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
		return firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
	}

}


