//Assignment 11
//11. Write a program to search a string entered by a user from the array of strings.


package com.training;
import java.util.Scanner;
public class StringEnterByUserFromArray {

	public static void main(String[] args) {
		
		int Num;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Friends You Have: ");
		Num = scan.nextInt();
		String[] names = new String[Num];
		
		for(int count = 0; count < Num; count++)
		{
			System.out.println("Enter the Name of Friends : " + (count+1));
			names[count] = scan.next();
		}
		
		//scan.close();
		System.out.println("Your Friends are: ");
		for(int count = 0; count < Num; count++)
		{
			System.out.println(names[count]);
			
		}
		

	}

}
