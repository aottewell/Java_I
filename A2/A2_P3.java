/*CS 111 - Programming Style Sheet
 Chapter No. 1 - Exercise No. 3
 File Name: A2_P3.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sept. 6, 2016
 Problem Statement:  Ask the user to input a line of text from the keyboard then:
 
Print the text to the screen.
Print the length of the string.
Print the string in all uppercase.
Print the string in all lowercase.
Print the string with the first and last character missing.

Overall Plan:
1) Print an initial welcoming message to the screen
2) Prompt the user to enter text

Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A2_P3
{
    public static void main(String[] args)
    {
        //Initial welcoming message 
        System.out.println("Hello!");
        System.out.println("Please input a line of text:");
        
        //Create an instance of the new Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        //Prints user input to the screen
        String s1 = input.nextLine();
	System.out.println("Your string:");
        System.out.println(s1);
        
        //Prints the length of the string
        int count = s1.length();
	System.out.println("String length:");
        System.out.println(count);    
         
        //Prints the string in all uppercase
        s1 = s1.toUpperCase();
	System.out.println("String in all upper case:");
        System.out.println(s1);
         
        //Prints the string in all lowercase
        s1 = s1.toLowerCase();
	System.out.println("String in all lower case:");
        System.out.println(s1);
                                    
        //Prints the string with the first and last character missing
        System.out.println("String with the first and last characters missing:");
        System.out.println(s1.substring(1, count - 1));
                                
        //Final message 
        System.out.println("Bye!");
        
        
    }// end of main
}// end of class MyFirstProgram      
