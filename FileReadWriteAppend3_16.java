package com.Assignment.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileReadWriteAppend3_16 {
	
public static void main(String[] args) {
		
		
		try {
			

			PrintWriter out = new PrintWriter("newFile.txt");

			out.println("This is an effortless way to write to files...");
			out.println("On the next line");
			out.println("This is cool...");
			

			out.flush();
			
			out.close();
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("newFile.txt")));
			
			String str ="";
			StringBuilder sb = new StringBuilder("");
			

			while((str = reader.readLine()) != null) {
				sb.append(str);
			}
			
			System.out.println("Data from file : ");
			
			System.out.println(sb);
			

			reader.close();
			
			
		} catch (IOException e) {
			System.out.println("Issues : " + e.getMessage());
		}
		
		

	}

	
}
