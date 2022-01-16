//Assignment 10
//10. Write a program to search a specific string from the given set of strings using regular expressions.

package com.training;

import java.util.regex.*;
public class StringUsingRegularExpression {

	public static void main(String[] args) {
		
		String pattern = "[a-z]+";
		String check = "Regular Expressions";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
			System.out.println( check.substring( c.start(), c.end() ) );

		

	}

}
