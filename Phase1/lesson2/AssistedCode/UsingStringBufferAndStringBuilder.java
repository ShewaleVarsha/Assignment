//Assignment 8
//8. Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder.


package com.training;

public class UsingStringBufferAndStringBuilder {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("it cold today");
		buffer.append(" very clod today");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("hi I am varsha here....");
		builder.append("I am from mphasis family now");
		System.out.println(builder);
		
		System.out.println("-------------------------------------");
		
        System.out.println("Methods of Strings");
		
		String sl=new String("Hello World");
		System.out.println(sl.length());

		
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));

		
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));

		
		String s4="";
		System.out.println(s4.isEmpty());

		
		String s5="MADAM";
		System.out.println(s1.toLowerCase());
		
		
		String s6="Rcmchcndrc";
		String replace=s2.replace('c', 'a');
		System.out.println(replace);

		
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));


	}

}
