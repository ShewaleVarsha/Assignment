//Assignment 3
//3.	As a developer, write a program to create an arithmetic calculator.


package com.training;

import java.util.Scanner;
public class AirthmaticCalculator
{
    public static void main(String args[])
  {
    int first, second, add, sub, mul;
    float div;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    sub = first - second;
    mul = first * second;
    div = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + sub);
    System.out.println("Multiplication = " + mul);
    System.out.println("Division = " + div);
  }
}

