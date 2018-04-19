
/*CS 111 - Programming Style Sheet
 Chapter No. 2 - Exercise No. 2
 File Name: A3_P2.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sep. 10, 2016
 Problem Statement:  Write a program that reads the subtotal and gratuity rate, then computes the gratuity and total.

Overall Plan:
1) Rewrite the program following proper formatting rules.


Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A3_P2
{
	public static void main (String[] args)
	{
		//create an instance of the new Scanner class for user input
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		double subTotal, gratuity, total, tip;
		
		//Obtain data from the user
		System.out.print("Enter the subtotal: ");
		subTotal = keyboard.nextDouble( );
		
		System.out.print("Enter the gratuity rate: ");
		gratuity = keyboard.nextDouble( );
		
		//calculations
		tip = gratuity / subTotal;
		System.out.printf("The gratuity is $%.2f%n" , tip );
		
		//output total with formatting
		total = subTotal + tip;
		System.out.printf("The total is $%.2f%n" , total );
		
		//close the keyboard to avoid unnecessary inputs
		keyboard.close();
		
	}//end of main
	
}//end of class A3_P2
