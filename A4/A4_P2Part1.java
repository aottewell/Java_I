/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A4_P2Part1.java
 Programmer: Alexander Ottewell 
 Date Last Modified: Sep. 14, 2016
 Problem Statement: Write a program that calculates a customer's monthy phone bill, including the package (A,B,C) and the number of minutes used.
                    
 
Overall Plan:
1) Prompt the user to select a package and enter the number of minutes used
2) Create a switch statement for (A,B,C) subscription packages. 
3) Display the total charges


Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A4_P2Part1
{
	public static void main (String[] args)
	{
		//declaration
		Scanner keyboard;
		char subscription; //subscription packages
		double m; //minutes used
		
		//Create an instance of the new Scanner class for user input
		keyboard = new Scanner(System.in);
		
		//prompt the user to select a package and enter the number of minutes used
		System.out.println("I will display your total phone bill charges.");
		System.out.println(" ");
		
		System.out.println("Package A: For $39.99 per month 450 minutes are provided.");
		System.out.println("Additional minutes are $0.45 per minute.");
		System.out.println(" ");
		
		System.out.println("Package B: For $59.99 per month 900 minutes are provided.");
		System.out.println("Additional minutes are $0.40 per minute.");
		System.out.println(" ");
		
		System.out.println("Package C: For $69.99 per month unlimited minutes are provided.");
		System.out.println(" ");
		
		System.out.print("Enter your subscription package (A,B or C): ");
		subscription = keyboard.next().charAt(0); //assign user input
		
		System.out.print("Eneter the number of minutes used: ");
		m = keyboard.nextDouble();//assign user input

		keyboard.close();
		
		switch (subscription)
		{
			case 'a':
			case 'A':
			//if the user exceeds the 450 minutes limit
			if (m>450)
			{
				//calculate base cost with additional 45 cents per minute
				double cost = 39.99 + (0.45 * m);
				System.out.printf("Your charge is $%.2f\n", cost);
			}
			else
			{
				System.out.println("Your charge is $39.99");
			}//end of case 'a/A' 
			break;
			
			case 'b':
			case 'B':
			if (m>900)
			{
				double cost = 59.99 + (0.40 * m);
				System.out.printf("Your charge is $%.2f\n", cost);
			}
			else
			{
				System.out.println("Your charge is $59.99");
			}//end of case 'b/B'
			break;
			
			case 'c':
			case 'C':
			System.out.println("Your charge is $69.99 with unlimited minutes!");
			break;//end of case 'c/C'
			
			default:
			System.out.println("Error! Plese enter the appropriate subscriprion package.");
			break;
			
		}//end of switch
		
		
	}//end of main
	
}//end of class A4_P2Part1
