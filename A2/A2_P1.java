/*CS 111 - Programming Style Sheet
 Chapter No. 1 - Exercise No. 2
 File Name: A2_P1.java
 Programmer: Alexander Ottewell
 Date Last Modified: Aug. 31, 2016
 Problem Statement:  Ask the user to enter two numbers, calculate the sum of these
 two numbers, difference, product, and display to the screen.

Overall Plan:
1) Print an initial welcoming message to the screen
2) Prompt the user for two integers
3) Calculate the sum, difference, product of the integers
4) Print results to the screen

Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A2_P1
{
    public static void main(String[] args)
    {
        //Initial welcoming message 
        System.out.println("Hello!");
        System.out.println("I will add, subtract and multiply two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");

        //Declare variables 
        int n1, n2;
        int sum;
        int difference;
        int product;

        //Create an instance of the new Scanner class for user input
        Scanner keyboard = new Scanner(System.in);
        
        //Obtain variables from the user 
        n1 = keyboard.nextInt( );
        n2 = keyboard.nextInt( );
       
        //Perform calculations 
        sum =        (n1 + n2);
        difference = (n1 - n2);
        product =    (n1 * n2);

        //Final message 
        System.out.println("The sum of these two numbers is");
        System.out.println(sum);
        System.out.println("The difference of these two numbers is");
        System.out.println(difference);
        System.out.println("The product of these two numbers is");
        System.out.println(product);
        
    }// end of main
}// end of class MyFirstProgram      
