package com.Assignment.lesson3;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingMechanism3_12 {
	
public static void main(String[] args) {
		
		File theFile = new File("work.txt");

		try {
			FileWriter writer = new FileWriter(theFile);//create file
			
			writer.write("Hello guys how are you doing\nWe are just about \nto complete phase 1");
			
			writer.flush();
			
			System.out.println("some.text deleted : " + theFile.delete());//file delete
			
			theFile.renameTo(new File("another.txt"));//update file
		
			writer.close();
			
			
			System.out.println("We wrote some data to the file...");	
			
			
		}
			catch (IOException e) {
			System.out.println("Issues : " + e.getMessage());
		}
		
		
		try {
			FileReader reader = new FileReader(theFile);//read file
			
			char []inputFromFile = new char[100];
			
			reader.read(inputFromFile);
			
			for(char ch : inputFromFile) {
				System.out.print(ch);
			}

			reader.close();
			
		} catch (IOException e) {
			System.out.println("Issues : " + e.getMessage());
		}
	
	}

}
