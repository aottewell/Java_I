/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A4_P5.java
 Programmer: Alexander Ottewell 
 Date Last Modified: Sep. 19, 2016
 Problem Statement: Write a program that prompts the user to enter values for a, b and c and displays the result based on the discriminant.
                    If the discriminant is positive, display two roots. If the discriminant is 0, display one root.
                    Otherwise, display "The equation has no real roots."
 
Overall Plan:
1) Prompt the user to enter values for a, b and c.
2) Based on the discriminat display whether there are one or two roots.
3) Then state the roots.
4) Otherwise, display "The equation has no real roots."


Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner; 

public class A4_P5
{
	public static void main (String[] args)
	{
		//declaration 
		Scanner keyboard;
		double a,b,c,discriminant,root1,root2;
		
		//create a new Scanner class for user input
		keyboard = new Scanner (System.in);
		
		//Prompt the user to enter values for a, b and c.
		System.out.println("I will desplay roots of a quadratic equation of form:");
		System.out.println("a(x^2) + bx + c");
		System.out.print("Enter values for a, b, c in a line: ");
		
		//assign user input
		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		
		//calculations
		discriminant = Math.pow(b, 2)-(4*a*c);
		root1 = (-b + Math.pow(discriminant, 0.5)) / 2*a;
		root2 = (-b - Math.pow(discriminant, 0.5)) / 2*a;
		
		//conditions 
		if (discriminant > 0)
		{
			System.out.println("The equation has two roots " + root1 +" "+ root2);
		}
		else if (discriminant == 0)
		{
			System.out.println("The equation has one root " + root1);
		}
		else
		{
			System.out.println("The equation has no real roots.");
		}
		
	}//end of main
	
}//end of class A4_P5
