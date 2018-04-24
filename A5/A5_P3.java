/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A5_P3.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sep. 24, 2016
 Problem Statement: Write a program that asks the user to enter the size of a triangle to print out,
                    then print the triangle by printing a series of lines consisting of asterisks.
                    The first line will have one asterisk, the next two, and so on, with each line having 
                    more asterisk than the previous line, up to the number entered by the user.
                    One the next line print one less asterisk and continue by decreasing the number of asterisks
                    by 1 for each successive line until only one asterisk is printed
 
Overall Plan:
1) Initial message & prompt user for input
2) Create a nested for loop; the outside loop will control th enumber of lines to print,
   and the inside loop will control the number of asterisks to print on each line 

Classes needed and Purpose: Scanner will be needed for collecting user's input and output
                            from the terminal


*/import java.util.Scanner; 

public class A5_P3
{
	public static void main (String[] args)
	{
		//declaration
		Scanner keyboard = new Scanner (System.in); //new scanner to read and print user input
		int n = 0; //size of the triangle
		
		//prompt the user for input
		System.out.println("Hello, I will draw a triangle for you!");
		System.out.print("Enter the size of a triangle as an integer from 1 to 50: ");
		n = keyboard.nextInt(); //user's input
		
		if(n>50 || n<0) //Error statement in case user enters inappropriate triangle size 
		{
			System.out.println("Error! Please enter the appropriate size, an integer from 1 to 50.");
		}
		else
		{
		    //outside loop, will control number of lines to print
		    for (int i = 0; i <= 2*n - 1; i++)
		    {
			    if(i <= n-1)
			    {
			         //inside loop, will control how many asterisks to print
				 //on the first half of the triangle
				 for (int j = 0; j < i + 1; j++)
			         {
			    	     System.out.print("*");
			         }
			         System.out.println(""); //allows to print on the next line
			    }
			    else
			    {
				 //inside loop, will control how many asterisks to print
				 //on the second half of the triangle
				 for (int j = 2*n - 1; j > i; j--)
				 {
			              System.out.print("*");
				 }
				 System.out.println("");
			    }
			
			
		     }//end of outside for statement
		
		}
		
	}//end of main
	
}//end of class A5_P3
