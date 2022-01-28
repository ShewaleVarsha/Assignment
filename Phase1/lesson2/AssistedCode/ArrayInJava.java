//Assignment 9
//9. Write a program to create single-dimensional and multidimensional arrays.

package com.training;

public class ArrayInJava {

	public static void main(String[] args) {
		
		int a[]= {100,200,300,400,500};
		for(int i=0;i<5;i++) {
		System.out.println(+a[i]);
		}

		int[][] b = {
		            {5,10,96,4,8}, 
		            {7,6,1} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      System.out.println("\nLength of row 2: " + b[1].length);
		      
		      }
}
