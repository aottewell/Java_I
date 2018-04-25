/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A6_P2.java
 Programmer: Alexander Ottewell
 Date Last Modified: Sep. 28, 2016
 Problem Statement: Write a program that simulates a slot machine. Have the program randomly select a word from the list:
                    Cherries, Oranges, Plums, Bells, Melons, Bars. Three randomly selected words should be displayed in 
                    one line. If none of the words match, the user wins $0. If two words match, the user doubles his money.
                    If all three words match, the user triples his money. 
                    The program should ask if the user wants to play again. If so, repeat the steps. If not, display total 
                    money entered into slot machine and the total amount won.  
 
Overall Plan:
1) Prompt the user to enter amount of money
2) Randomly select three numbers 0-5 (0=Cherries, 1=Oranges, etc.)
3) Display three words in a line on the screen
4) Inform the user about winnings
5) Ask if the user wishes to repeat. If not, display total $ enterd plus winnings. 

Classes needed and Purpose: Random will be needed for generation of random integers 
                            for the assignment

	
*/import java.util.Random;
  import java.util.Scanner; 
  
  public class A6_P2
  {
  	public static void main (String[] args)
  	{
  		//declaration
  		Scanner keyboard = new Scanner (System.in);
  		Random rnd = new Random();
  		char playAgain;
  		int n = 0; //user's money 
  		int totalEntered = 0;
  		int winnings1 = 0;
  		int winnings2 = 0;
  		
  		//promt user for input 
        	System.out.println("Welcome to the simulated slot machine!");
  		
  		//will collect user input & generate three random numbers. Then random numbers will be assigned
  		//strings based on value. Then program will compare values and determine winnings.
  		//finally, will ask user if they want to play again
  		do
  		{
  			System.out.print("Enter how much money (integer $) you want to enter into the slot machine: ");
  			n = keyboard.nextInt();//user enters money 
  			totalEntered = totalEntered + n;
  			
  			
  			//generating three random numbers (0-5)
  			int number1 = rnd.nextInt(5);
  			int number2 = rnd.nextInt(5);
  			int number3 = rnd.nextInt(5);
  			
  			//assign random numbers 1,2,3 different strings based on number values 0-5
  			switch(number1)
  			{
  				case 0:
  				System.out.print("Cherries");//if random number1 is 0, then Cherries
  				break;
  				
  				case 1:
  				System.out.print("Oranges");
  				break;
  				
  				case 2:
  				System.out.print("Plums");
  				break;
  				
  				case 3:
  				System.out.print("Bells");
  				break;
  				
  				case 4:
  				System.out.print("Melons");
  				break;
  				
  				case 5:
  				System.out.print("Bars");
  				break;
  			}
  			System.out.print(" ");//creates a space between random1 and 2
  			switch(number2)
  			{
  				case 0:
  				System.out.print("Cherries");//if random number2 is 0, then Cherries
  				break;
  				
  				case 1:
  				System.out.print("Oranges");
  				break;
  				
  				case 2:
  				System.out.print("Plums");
  				break;
  				
  				case 3:
  				System.out.print("Bells");
  				break;
  				
  				case 4:
  				System.out.print("Melons");
  				break;
  				
  				case 5:
  				System.out.print("Bars");
  				break;
  			}
  			System.out.print(" ");//creates a space between random2 and 3
  			switch(number3)
  			{
  				case 0:
  				System.out.print("Cherries");//if random number3 is 0, then Cherries
  				break;
  				
  				case 1:
  				System.out.print("Oranges");
  				break;
  				
  				case 2:
  				System.out.print("Plums");
  				break;
  				
  				case 3:
  				System.out.print("Bells");
  				break;
  				
  				case 4:
  				System.out.print("Melons");
  				break;
  				
  				case 5:
  				System.out.print("Bars");
  				break;
  			}
  			System.out.println("");//creates a blank line between randoms and results 
  			
  			//displays results based on randoms 
  			if(number1 != number2 && number2 != number3 && number1 != number3)//when 1,2,3 don't match
  			{
  				System.out.println("Sorry, you lost! You win $0");
  			}
  			else if(number1 == number2 && number2 == number3 && number1 == number3)//when all match 
  			{
  				System.out.println("Congradulations, you win " + n*3 + "$");
  				winnings1 = winnings1 + n*3;
  			}
  			else if(number1 == number2 || number2 == number3 || number1 == number3)//when only two of out of three match
  			{
  				System.out.println("Congradulations, you win " + n*2 + "$");
  				winnings2 = winnings2 + n*2;
  			}
  			
  			//asks the user if they want to play again 
  			System.out.print("Would you like to play more? (Y/N)");
  			playAgain = keyboard.next().charAt(0); //user's input
  			System.out.println(" "); 
  			
  		}while(playAgain == 'Y' || playAgain == 'y');//if user enters yes, then will repeat loop
  		
  		//displays total amount eneted and total amount in winnings
  		int totalWinnings = winnings1 + winnings2; 
  		System.out.println("Thank you for playing!");
  		System.out.println("You entered: "+ totalEntered +"$");
  		System.out.println("You won: "+ totalWinnings +"$");
  		
  		
  	}//end of main 
  	
  }//end of class A6_P2
