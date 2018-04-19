/*CS 111 - Programming Style Sheet
 Chapter No. 2 - Exercise No. 3
 File Name: A3_P3.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sep. 10, 2016
 Problem Statement:  Write a program that prompts the user to enter the distance to drive, the fuel efficiecy of the car im miles per gallon,
                      and the price per gallon, and displays the cost of the trip.

Overall Plan:
1) Prompt the user for distance.
2) Prompt the user for fue efficiency in mpg.
3) Prompt the user for the price per gallon.
4) Dispaly trip cost in $.


Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A3_P3
{
	public static void main (String[] args)
	{
		//create an instance of the new Scanner class for user input
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		double distance, fuel, price, cost;
		
		//receive input from user 
		System.out.print("Enter the distance to drive in miles: ");
		distance = keyboard.nextDouble( );
		
		System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
		fuel = keyboard.nextDouble( );
	
		System.out.print("Enter the price per gallon in $%: ");
		price = keyboard.nextDouble( );
		
		//calculate trip cost
		cost = (distance/fuel)*price;
		
		//print formatted output
		System.out.printf("The cost of the trip is $%.2f%n:" ,cost);
		
		//close the keyboard
		keyboard.close();

	}//end of main
	
}//end of class A3_P3
