/*CS 111 - Programming Style Sheet
 Chapter No. 2 - Exercise No. 4
 File Name: A3_P4.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sep. 12, 2016
 Problem Statement: Write a program that reads a sentence from the user and effectively moves the first word of the string to the end. 
                    Be sure to make the first character of the new last word lower case, and the first character of the new first word upper case.
                    Do not worry about punctuation marks, meaning if they are included by the user, just ignore them.
 
Overall Plan:
1) Create a new Scanner class for user input
2) Separate first letters from first and last sentences
3) Change capitalization
4) Rephrase sentence 


Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A3_P4
{
	public static void main (String[] args)
	{
		
		//declaration
		Scanner keyboard;
		String sentBegin, sentEnd, sentBegLetter, sentEndLetter;
		
		//Initial welcoming message 
        	System.out.println("Hello!");
        	System.out.println("Please input a line of text:");
        	
        	//Create an instance of the new Scanner class for user input
        	keyboard = new Scanner(System.in); 
        	sentBegin = keyboard.next();
        	sentEnd = keyboard.nextLine().trim();//clean up whitespace
        	
        	keyboard.close();//end of user input
        	
        	sentBegLetter = sentBegin.substring(0,1);//using substring to separate first letter from each sentence
        	sentEndLetter = sentEnd.substring(0,1);  //to correct capitaliztion during rephrasing 
        	
        	sentBegin = sentBegin.substring(1);
        	sentEnd = sentEnd.substring(1);
        	
        	//prints rephrased sentence to screen 
        	System.out.println(sentEndLetter.toUpperCase() + sentEnd.toLowerCase() 
				   + " " + sentBegLetter.toLowerCase() + sentBegin.toLowerCase());
        
        
	}//end of main 
	
}//end of class A3_P4
