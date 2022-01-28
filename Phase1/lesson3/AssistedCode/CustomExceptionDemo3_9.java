package com.Assignment.lesson3;

import java.util.Scanner;
//import java.util.ArithmeticException;
public class CustomExceptionDemo3_9 {
	
	public static void main(String[] args) throws UserNameNotValidException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter employee's username : ");
		
		String userName = scan.nextLine();
		int a=45,b=0,rs=0;
		try {
			validateUserName(userName);
            rs = a / b;
		} catch (UserNameNotValidException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException Ex)
		{
			System.out.println("Sorry divide by zero isn't defined yet "+Ex);
		}
		finally
        {
            System.out.print("\n\tThe result is : "+rs);
        }

	}

	private static void validateUserName(String userName) throws UserNameNotValidException {
		if(userName.startsWith("emp_"))
			System.out.println("Welcome " + userName + ", you are now logged in.");
		else
			throw new UserNameNotValidException("Invalid employee name, should start with emp_");
	}

}


class UserNameNotValidException extends Exception{
	public UserNameNotValidException(String message) {
		super(message);
	}
}


