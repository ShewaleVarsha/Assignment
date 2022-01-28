package com.Assignment.lesson3;

public class Try_CatchDemo3_8 {
	
    public static void main(String args[]) 
    {
        int[] array = new int[3];
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("This is try catch block..."); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }


}
