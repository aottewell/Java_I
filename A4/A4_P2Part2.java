/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A4_P2Part2.java
 Programmer: Alexander Ottewell 
 Date Last Modified: Sep. 17, 2016
 Problem Statement: Modify the program so it also calculates and displays the amount Package A customers  
                    would save by switching to B or C, and the amount B customers would save if they switch to C.
                    If there would be no savings, no message should be printed.
 
Overall Plan:
1) Prompt the user to select a package and enter the number of minutes used
2) Create a switch statement for (A,B,C) subscription packages. 
3) Display the total charges
4) If applicable, calculate how much customers will save by switching plans
5) If there are no savings, do not dispplay message


Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A4_P2Part2
{
	public static void main (String[] args)
	{
		//declaration
		Scanner keyboard;
		char subscription; //subscription packages
		double m; //minutes use
		
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
		
		//assigning a price to each package
		double costA = 39.99 + (0.45 * (m - 450));//if over 450 minutes
		double costB = 59.99 + (0.40 * (m - 900));//if over 900 minutes
	    	double costC = 69.99;             	  //unlimited minutes 
		
		switch (subscription)
		{
			case 'a':
			case 'A':
			if (m>450 && m<900)//if the amount of minutes used is in between 450 and 900
			{
				
				System.out.printf("Your charge is $%.2f\n", costA);
				System.out.printf("By switching to Package B you will save $%.2f\n", (costA-59.99));
				System.out.printf("By switching to Package C you will save $%.2f\n", (costA-costC));
			}	
			else if (m>900)//if the amount of minutes used is over 900
			{
				System.out.printf("Your cahrge is $%.2f\n", costA);
				System.out.printf("By switching to Package B you will save $%.2f\n", (costA-costB));
     	        		System.out.printf("By switching to Package C you will save $%.2f\n", (costA-costC));
			}
			else
			{
				System.out.println("Your charge is $39.99");
			}//end of case 'a/A'----------------------------------------------------------------------- 
			break;
			
			case 'b':
			case 'B':
			if (m>900)//if the amount of minutes used is over 900
			{
				System.out.printf("Your charge is $%.2f\n", costB);
				System.out.printf("By switching to Package C you will save $%.2f\n",(costB-costC));
			}
			else
			{
				System.out.println("Your charge is $59.99");
			}//end of case 'b/B'-----------------------------------------------------------------------
			break;
			
			case 'c':
			case 'C':
			System.out.println("Your charge is $69.99 with unlimited minutes!");
			//end of case 'c/C'
			break;
			
			default:
			System.out.println("Error! Plese enter the appropriate subscriprion package.");
			break;
			
		}//end of switch
		
		
	}//end of main
	
}//end of class A4_P2Part
