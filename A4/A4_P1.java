/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A4_P1.java
 Programmer: Alexander Ottewell 
 Date Last Modified: Sep. 14, 2016
 Problem Statement: Write a program that prompts the user to enter a number within the range of 1 through 10.
                    The program should display the roman numeral version of that number. 
                    If the number is outside of the range 1-10, the program should display an error message.
 
Overall Plan:
1) Prompt the user to enter a number 1-10
2) Create a switch statement 
3) Create a an error message if the nmber is outside the range of 1-10
4) The program should read input as an integer


Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A4_P1
{
	public static void main (String[] args)
	{
		//declaration
		Scanner keyboard;
		int n;
		
		//Create an instance of the new Scanner class for user input
        	keyboard = new Scanner(System.in);
        	
        	//prompt the user to enter a number 1-10
        	System.out.println("I will display a roman numeral version of a number for you.");
        	System.out.println("Enter any number 1 through 10: ");
        	
        	//assign user input
        	n = keyboard.nextInt();
        	
		//close the keyboard
        	keyboard.close();
        	
        	switch (n)
        	{
        		case 1:
        		System.out.println("I");
        		break;
        		
        		case 2:
        		System.out.println("II");
        		break;
        		
        		case 3:
        		System.out.println("III");
        		break;
        		
        		case 4:
        		System.out.println("IV");
        		break;
        		
        		case 5:
        		System.out.println("V");
        		break;
        		
        		case 6:
        		System.out.println("VI");
        		break;
        		
        		case 7:
        		System.out.println("VII");
        		break;
        		
        		case 8:
        		System.out.println("VIII");
        		break;
        		
        		case 9:
        		System.out.println("IX");
        		break;
        		
        		case 10:
        		System.out.println("X");
        		break;
        		
        		default:
        		System.out.println("Error! Wrong entry, please try again.");
        		break;
        	
        		
        	}//end of switch
        	
	}//end of main
	
}//end of class A4_P1
