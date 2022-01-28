package com.varsha.Project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class EmailIDValidation {
	
	   public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";


	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }

	   public static void main(String[] args) {
	       List<String> emails = new ArrayList<String>();
	     
	       
	       emails.add("varshashe@example.com");
	       emails.add("varshashewa@example.com");
	       emails.add("abcd@example.me.org");


	       emails.add("welcome.maphasi.com");
	       emails.add("sachin.mom@example.com");
	       emails.add("adhere@.example.com");

	       for (String value : emails) {
	           System.out.println("Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("----------------------------------------------");
	       System.out.println("Enter any email address to check valid or not");
	       Scanner scan = new Scanner(System.in);
	       String input = scan.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
	   }
	   


}
