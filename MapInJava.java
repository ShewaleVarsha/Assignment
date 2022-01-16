//Assignment 7
//7. Write a program to demonstrate the uses of Map.

package com.training;

import java.util.*;

public class MapInJava {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Sachin");    
	      hm.put(2,"Varsha");    
	      hm.put(3,"Vishal");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(7,"Sharayu");  
	      ht.put(6,"Nikita");  
	      ht.put(5,"Shivani");  
	      ht.put(4,"Vinay");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Aditya");    
	      map.put(9,"Snehal");    
	      map.put(10,"Sujata");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      

	}

}
