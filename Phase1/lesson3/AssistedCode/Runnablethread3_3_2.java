package com.Assignment.lesson3;


public class Runnablethread3_3_2 implements Runnable{
	 
    public static int myCount = 0;
    public Runnablethread3_3_2(){
         
    }
    public void run() {
        while(Runnablethread3_3_2.myCount <= 5){
            try{
                System.out.println("Expl Thread: "+(++Runnablethread3_3_2.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting of Main Thread...");
        Runnablethread3_3_2 mrt = new Runnablethread3_3_2();
        Thread t = new Thread(mrt);
        t.start();
        while(Runnablethread3_3_2.myCount <= 5){
            try{
                System.out.println("Main Thread: "+(++Runnablethread3_3_2.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

