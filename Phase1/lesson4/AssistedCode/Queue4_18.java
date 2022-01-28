package com.Assignment.lesson4;

import java.util.*;
public class Queue4_18 {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		queue.add("Pune");
	    queue.add("Satara");
 		queue.add("Karad");
 		queue.add("Islampur");
	    queue.add("kolhapur");
	    
	    System.out.println("Queue is : " + queue);
	    System.out.println("Head of Queue : " + queue.peek());
	    queue.remove();
	    System.out.println("-----------------------------------------");
	    System.out.println("After removing Head of Queue : " + queue);
	    System.out.println("Size of Queue : " + queue.size());
	    	}


}
