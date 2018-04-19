/*CS 111 - Programming Style Sheet
 Chapter No. 1 - Exercise No. 2
 File Name: A2_P1.java
 Programmer: Alexander Ottewell
 Date Last Modified: Aug. 31, 2016
 Problem Statement:  Ask the user to enter temperature in Celsius, calculate the temperature in Fahrenheit and display to the screen.

Overall Plan:
1) Print an initial welcoming message to the screen
2) Prompt the user to enter a value for temperature Celsius
3) Calculate temperature in Fahrenheit
4) Print result to the screen

Classes needed and Purpose: Scanner will be needed for general purpose
 input and output from the terminal


*/import java.util.Scanner;

public class A2_P2
{
    public static void main(String[] args)
    {
        //Initial welcoming message 
        System.out.println("Hello!");
        System.out.println("I will convert degree Celsius to Fahrenheit for you.");
        System.out.println("Enter number in degree Celsius:");

        //Declare variable 
        double n1;
        

        //Create an instance of the new Scanner class for user input
        Scanner keyboard = new Scanner(System.in);
        
        //Obtain variable from the user 
        n1 = keyboard.nextDouble( );
        
      

        //Final message 
        System.out.println(n1 + " degrees Celsius in Fahrenheit is");
        System.out.println(n1 * 1.8 + 32 );
        
    }// end of main
}// end of class MyFirstProgram     
