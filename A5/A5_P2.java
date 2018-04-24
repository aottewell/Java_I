/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A5_P2.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sep. 21, 2016
 Problem Statement: Write a program that takes as input the gender of the child, 
                    the height of the mother in inches, and the height of the father in inches,
                    and outputs the estimated adult height of the child in inches. 
 
Overall Plan:
1) Initial message & prompt user for input
2) Create a switch for the case of a male and female child
3) Allow the user to enter a new set of values by creating a do while loop
4) Output result in feet and inches 

Classes needed and Purpose: Scanner will be needed for collecting user's input and output
                            from the terminal


*/import java.util.Scanner; 

public class A5_P2
{
	public static void main(String[] args)
	{
		//declaration
		Scanner keyboard;
		double heightMother = 0; 
		double heightFather = 0;
		char gender;
		char tryAgain;
		
		//Create an instance of the new Scanner class for user input
		keyboard = new Scanner(System.in);
		
		//will gather child's gender and parents' height from user. 
		//according to input, calculations in case M or F will be performed.
		//the result will be provided and the user will be asked if they would like to try again 
		do
		{
		    //message to prompt the user for input 
		    System.out.println("Hello, I will estimate the adult height of your child.");
		
		    System.out.print("Indicate your child's gender (M/F): ");
		    gender = keyboard.next().charAt(0);//user input
		
		    System.out.print("Indicate mother's height (inches): ");
		    heightMother = keyboard.nextDouble();//user input
		
		    System.out.print("Indicate father's height (inches): ");
		    heightFather = keyboard.nextDouble();//user input
		
			switch(gender)
			{
			    case 'm':
			    case 'M':
			
			    double heightMaleChild = ((heightMother * (13.0/12.0)) + heightFather)/2.0; //calculating male height 
			    
			    System.out.printf("The estimated adult height of your child is %.2f inches ", heightMaleChild);
			    
			    heightMaleChild = heightMaleChild / 12;//converting height from inches to feet 
			    
			    System.out.printf("or %.2f feet \n",heightMaleChild);
			    break;//end of case M
			
			    case 'f':
			    case 'F':
			
			    double heightFemaleChild = ((heightFather * (12.0/13.0)) + heightMother)/2.0; //calculating female height
			     
			    System.out.printf("The estimated adult height of your child is %.2f inches ",heightFemaleChild);
			    
			    heightFemaleChild = heightFemaleChild / 12;//converting height from inches to feet
			    
			    System.out.printf("or %.2f feet \n",heightFemaleChild);
			    break;//end of case F 
			
			    default:
			    System.out.println("Error! Please indicate appropriate gender!");
			    break;
			}//end of switch 
			
	           System.out.println("Would you like to try again? Y or N");
	           tryAgain = keyboard.next().charAt(0); //user input
		
		}while (tryAgain == 'Y' || tryAgain == 'y'); //if yes then runs the loop again 
		
		
	}//end of main 
	
}//end of class A5_P2
