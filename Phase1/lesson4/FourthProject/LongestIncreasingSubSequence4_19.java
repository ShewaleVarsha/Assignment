package com.Assignment.lesson4;

public class LongestIncreasingSubSequence4_19 {
	
	static int increaseSubSequence(int my_arr[], int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++)
//	      for(int val : seq_arr)
//	    	  System.out.println(val);
	         seq_arr[i] = 1;
	      for (i = 1; i < arr_len; i++)
	      for (j = 0; j < i; j++)
	      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
	      seq_arr[i] = seq_arr[j] + 1;
	      for (i = 0; i < arr_len; i++)
	      if (max < seq_arr[i])
	      max = seq_arr[i];
	      return max;
	   }
	   public static void main(String args[]){
	      int my_arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
	      int arr_len = my_arr.length;
	      System.out.println("length of the longest increasing subsequence is " +  increaseSubSequence(my_arr, arr_len));
	   }

}
