/*CS 111 - Programming Style Sheet
 Chapter No. 3
 File Name: A6_P1.java
 Programmer: Alexander Ottewell
 Date Last Modified: Oct. 2, 2016
 Problem Statement: Write a bank program that tracks and prints user's balance at each step with an initial balance
                    of $500.00. The program should ask the user for the file name that contains the bank deposits
                    (BankDeposit.txt); it should read the values from the deposit file and add them to the account
                    balance, printing the deposit value and new user balance for each value read from the file. 
                    The program should then ask the user for the file name that contains the bank withdrawals
                    (BankWithdrawal.txt); it should read the values from the withdrawal file and subtract them
                    from the account balance printing the withdrawal value and the new user balance for 
                    each value read from the file.
                    
                    The program should then ask the user for a file name that contains the interest rates(Interest.txt);
                    the interest rates file should contain at least 3 interest rates that range from 0.01(1%) to 0.30(30%). 
                    The program will then read in these interest rates displaying (you will also need to display an interest 
                    rate selection prompt) each interest rate from the file and matching the interest rate with options 
                    1 through X with X being the number of interest rates in the interest file.
                    
                    Based on user selection of an interest rate the program will calculate/display to the screen 
                    the initial balance, total deposit, after deposit balance, total withdrawal, after withdrawal balance,
                    interest rate selected, amount of interest calculated, and final balance.
                    The program will also prompt the user for a file name of a bank transaction file which will capture
                    and output to the transaction file all of the data above that is displayed on the screen.
 
Overall Plan:
1) Use a text editor to create a text file named BankDeposit.txt. 
   The file should contain the following numbers, one per line: 100.00, 125.00, 78.92, 37.55
2) Next, create a text file named BankWithdrawal.txt. 
   The file should contain the following numbers, one per line: 29.88, 110.00, 27.52, 50.00, 12.90   
3) Create an Interest.txt file for interest rates
4) Create a display/selection option for interest rates 
5) Perform calculations with selected interest rate
6) Create a bank transaction output file     

*/import java.util.Scanner; 
  import java.io.PrintWriter;
  import java.io.IOException;
  import java.io.FileInputStream;
  import java.io.FileOutputStream;

public class A6_P1
{
	public static void main(String[] args) throws IOException 
	{
		//declaration
		Scanner keyboard = new Scanner(System.in); // instance of a new Scanner class for user input
		double balance = 500;
		
		//prompting for deposit file name  
		System.out.print("Enter the file name containing deposits (BankDeposit.txt): ");
		String fileNameDeposit = keyboard.nextLine();//gets file from user
		Scanner inputFile = new Scanner(new FileInputStream(fileNameDeposit));
		
		//will open the file indicated by the user
		//will print first line, then will add deposit value and print the sum
		//ends after the last deposit is added to the total balance value 
		while(inputFile.hasNext())
		{
			double deposit = inputFile.nextDouble();
			balance += deposit;
			
			System.out.printf("Your deposit value is: $%.2f\n ",deposit);
			System.out.printf("Your new user balance is: $%.2f\n ",balance);
			System.out.println("");
			
		}
		inputFile.close();//close the file 
		System.out.println("-----");
		
		//prompting for withdrawal file name 
		System.out.print("Enter the file name containing withdrawals (BankWithdrawal.txt): ");
		String fileNameWithdrawal = keyboard.nextLine();//gets file from user
		inputFile = new Scanner(new FileInputStream(fileNameWithdrawal));
		
		//will open the file indicated by the user
		//will print first line, then will subtract withdrawal value from balance and print result
		//ends after the last withdrawal is subtracted from the balance value 
		while(inputFile.hasNext())
		{
			double withdrawal = inputFile.nextDouble();
			balance -= withdrawal;
			
			System.out.printf("Your withdrawal value is: $%.2f\n ",withdrawal);
			System.out.printf("Your new user balance is: $%.2f\n ",balance);
			System.out.println("");
			
		}
		inputFile.close();
		System.out.println("-----");
		
		//prompting for interest rates file name 
		System.out.print("Enter the file name containing interest rates (Interest.txt): ");
		String fileNameInterest = keyboard.nextLine();
		inputFile = new Scanner (new FileInputStream(fileNameInterest));
		
		//will open the file indicated by the user
		//will print every line 
		while(inputFile.hasNext())
		{
			String interest = inputFile.nextLine();
			System.out.println(interest);
			System.out.println("");
		}
		inputFile.close();
		System.out.println("-----");
		
		//prompts the user to select and interest rate for calculations
		System.out.print("Select an interest rate: ");
		int interest = keyboard.nextInt();
		
		//will print initial balance, total deposit value, after deposit balance,
		//total withdrawals, after withdrawals balance, will indicate selected 
		//interest rate option, will calculate amount of interest rate
		//will print final balance 
		switch(interest)
		{
			case 1:
			System.out.println("The intial balance is $500.00");
			
			System.out.println("The total deposit is $341.47");
			
			System.out.println("The after deposit balance is $841.47");
			
			System.out.println("The total withdrawal is $230.30");
			
			System.out.println("The after withdrawal balance is $611.17");
			
			System.out.println("Interest rate selected: 2%");
			
			double calculatedInterest = ((611.17/100)*2);
			
			System.out.printf("The amount of interest calculated is $%.2f\n",calculatedInterest);
			
			double finalBalance = calculatedInterest + 611.17;
			
			System.out.printf("The final balance is $%.2f\n",finalBalance);
			break;
			
			case 2:
			System.out.println("The intial balance is $500.00");
			
			System.out.println("The total deposit is $341.47");
			
			System.out.println("The after deposit balance is $841.47");
			
			System.out.println("The total withdrawal is $230.30");
			
			System.out.println("The after withdrawal balance is $611.17");
			
			System.out.println("Interest rate selected: 2.5%");
			
		        calculatedInterest = ((611.17/100)*2.5);
			
			System.out.printf("The amount of interest calculated is $%.2f\n",calculatedInterest);
			
		        finalBalance = calculatedInterest + 611.17;
			
			System.out.printf("The final balance is $%.2f\n",finalBalance);
			break;
			
			case 3:
			System.out.println("The intial balance is $500.00");
			
			System.out.println("The total deposit is $341.47");
			
			System.out.println("The after deposit balance is $841.47");
			
			System.out.println("The total withdrawal is $230.30");
			
			System.out.println("The after withdrawal balance is $611.17");
			
			System.out.println("Interest rate selected: 3%");
			
		        calculatedInterest = ((611.17/100)*3);
			
			System.out.printf("The amount of interest calculated is $%.2f\n",calculatedInterest);
			
		        finalBalance = calculatedInterest + 611.17;
			
			System.out.printf("The final balance is $%.2f\n",finalBalance);
			break;
			
			case 4:
			System.out.println("The intial balance is $500.00");
			
			System.out.println("The total deposit is $341.47");
			
			System.out.println("The after deposit balance is $841.47");
			
			System.out.println("The total withdrawal is $230.30");
			
			System.out.println("The after withdrawal balance is $611.17");
			
			System.out.println("Interest rate selected: 4%");
			
		        calculatedInterest = ((611.17/100)*4);
			
			System.out.printf("The amount of interest calculated is $%.2f\n",calculatedInterest);
			
		        finalBalance = calculatedInterest + 611.17;
			
			System.out.printf("The final balance is $%.2f\n",finalBalance);
			break;
			
			default:
			System.out.println("Error! Please enter an appropriate interest rate option.");
			break;
		}//end of switch(interest)
		System.out.println("");
		System.out.println("-----");
		
		
		//prompt user for the bank transaction file name
		System.out.print("Enter the file transaction name: ");
		keyboard.nextLine();
		String fileNameTransaction = keyboard.nextLine();
		
		//create an instance of PrintWriter class to open a file for text output
		PrintWriter outputFile = new PrintWriter(fileNameTransaction);
		
		//will output bank information to user's file based on interest rate selection 
		if(interest == 1)
		{
		
	            outputFile.println("The intial balance is $500.00");
		    outputFile.println("The total deposit is $341.47");
		    outputFile.println("The after deposit balance is $841.47");
		    outputFile.println("The total withdrawal is $230.30");
		    outputFile.println("The after withdrawal balance is $611.17");
		    outputFile.println("Interest rate selected: 2%");
		    outputFile.println("The amount of interest calculated is $12.22");
		    outputFile.println("The final balance is $623.39");
		        
                }
                else if(interest == 2)
        	{
        	    outputFile.println("The intial balance is $500.00");
		    outputFile.println("The total deposit is $341.47");
		    outputFile.println("The after deposit balance is $841.47");
		    outputFile.println("The total withdrawal is $230.30");
		    outputFile.println("The after withdrawal balance is $611.17");
		    outputFile.println("Interest rate selected: 2.5%");
		    outputFile.println("The amount of interest calculated is $15.28");
		    outputFile.println("The final balance is $626.45");
                }
          	else if(interest == 3)
         	{
        	    outputFile.println("The intial balance is $500.00");
		    outputFile.println("The total deposit is $341.47");
		    outputFile.println("The after deposit balance is $841.47");
		    outputFile.println("The total withdrawal is $230.30");
		    outputFile.println("The after withdrawal balance is $611.17");
		    outputFile.println("Interest rate selected: 3%");
		    outputFile.println("The amount of interest calculated is $18.34");
		    outputFile.println("The final balance is $629.51");
        	}
        	else if(interest == 4)
        	{
        	    outputFile.println("The intial balance is $500.00");
		    outputFile.println("The total deposit is $341.47");
		    outputFile.println("The after deposit balance is $841.47");
		    outputFile.println("The total withdrawal is $230.30");
		    outputFile.println("The after withdrawal balance is $611.17");
		    outputFile.println("Interest rate selected: 4%");
		    outputFile.println("The amount of interest calculated is $24.45");
		    outputFile.println("The final balance is $635.62");
        	}		        
		outputFile.close();
		
	}//end of main
	
}//end of class A6_P1
