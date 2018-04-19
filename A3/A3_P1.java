/*CS 111 - Programming Style Sheet
 Chapter No. 2 - Exercise No. 1
 File Name: A3_P1.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sep. 10, 2016
 Problem Statement:  Modify the program so that it uses the spelling conventions, constant naming conventions, and formatting style recommended in this book.

Overall Plan:
1) Rewrite the program following proper formatting rules.


Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A3_P1
{
	//final variable that never changes
	public static final double DISTANCE = 6.21;
	
	public static void main (String[] args)
	{
		System.out.println("This program calculates your pace given a time and distance traveled.");
		
		//define time and pace variables
		double time, pace;
		
		//assign variables
		time = 35.5; //35 minutes and 30 seconds
		pace = time / DISTANCE;
		
		//output
		System.out.println("Your pace is " + pace + " miles per hour.");
		
	}//end of main 
	
}//end of class A3_P1
