//Write a program in Java to create a thread by extending the ‘Thread’ class and by implementing the “Runnable” interface

package com.Assignment.lesson3;

public class ThreadInterface3_3_1 extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		ThreadInterface3_3_1 thread = new  ThreadInterface3_3_1();
  		thread.start();
 	}
}


	

