package com.Assignment.lesson5;

import java.util.Scanner;
public class LinearSearch5_3 {
	
	public static void main(String[] args){

        int[] arr = {10,20,30,40,50};

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int searchValue = scan.nextInt();
        int result = (int) linearing(arr,searchValue);

        if(result==-1)
        {
        	System.out.println("Element not in the array");
        } 
        else 
        {
        	System.out.println("Element found at index "+result+" and the search key is "+arr[result]);
        }


    }
	public static int linearing(int arr[], int x) {
		
		int arrlength = arr.length;
		for (int i = 0; i <=arrlength - 1; i++) {
			
			if (arr[i] == x) {
				return i;
			}
     }
		return -1;
	}


}
