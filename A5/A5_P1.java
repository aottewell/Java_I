/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A5_P1.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sep. 23, 2016
 Problem Statement: Write a program read in a list of exam scores and to output the total number of grades
                    as well as the number of grades in each letter-grade category and what percentage of the 
                    total scores each letter grade represents. 
 
Overall Plan:
1) Prompt the user to input test scores (int percentages 0-100)
2) Create a do/while statement to run the program and end at sentinel -1
3) Perform necessary calculations with type-casting included 

Classes needed and Purpose: Scanner will be needed for collecting user's input and output
                            from the terminal


*/import java.util.Scanner; 

public class A5_P1
{
	public static void main(String[] args)
	{
		//declaration 
		Scanner keyboard = new Scanner(System.in); //new scanner for user input 
		int score = 0;
		int totalScores = 0;
		
		//number of grades per category 
		int numA = 0;
		int numB = 0;
		int numC = 0;
		int numD = 0;
		int numF = 0;

		//grade percentage
		double percentA = 0.0;
		double percentB = 0.0;
		double percentC = 0.0;
		double percentD = 0.0;
		double percentF = 0.0;
		
		
		//prompt for user input 
		System.out.println("Hello, I will count the total number of grades, number of grades in each category, and the percentage of each category.");
		System.out.println("Make sure to enter -1 when you are done.");
		System.out.println("Enter a list of scores (0-100):");
		    
		//Will ask user to input scores
		//Will count and output total amount of scores 
		do
		{
		    score = keyboard.nextInt();//user's input 
		    
		    if(score>=90 && score<=100)
		    {
		    	numA++;
		    }
		    else if(score>=80 && score<90)
		    {
		    	numB++;
		    }
		    else if(score>=70 && score<80)
		    {
		    	numC++;
		    }
		    else if(score>=60 && score<70)
		    {
		    	numD++;
		    }
		    else if(score>=0 && score<60)
		    {
		    	numF++;
		    }
	

		}while (!(score < 0 || score > 100));//loop will end if conditions are not met
		  
		//calculating total amount of scores
		totalScores = numA + numB + numC + numD + numF;
		
		//calculating percentage of each grade category 
		percentA = ((double)numA / totalScores) * 100;
		percentB = ((double)numB / totalScores) * 100;
		percentC = ((double)numC / totalScores) * 100;
		percentD = ((double)numD / totalScores) * 100;
		percentF = ((double)numF / totalScores) * 100;
		
		
		//Prints the total number of grades 
		System.out.println("The total number of grades = " + totalScores);
		
		//Prints number of grades in the category and percentage of category
		System.out.printf("Number of A's = %d which is %.1f%%\n", numA, percentA);
		System.out.printf("Number of B's = %d which is %.1f%%\n", numB, percentB);
		System.out.printf("Number of C's = %d which is %.1f%%\n", numC, percentC);
		System.out.printf("Number of D's = %d which is %.1f%%\n", numD, percentD);
		System.out.printf("Number of F's = %d which is %.1f%%\n", numF, percentF);                  	
		
	}//end of main 
	
}//end of class A5_P1
