import java.util.*;
class Bank
{
	//to display the welcome message
	static {
		System.out.println("Welcome to the Bank!");
	}//static

	int balance = 500;
	public int displayBal(){
		return balance;
	}//displayBal()

	//method to credit the amount
	public void deposit(int amount){
		if (amount > 0)
		{
			balance = balance + amount;
		}
		else{
			System.out.println("Amount should be more than 0");
		}
		
	}//deposit

	//method to deduct the amount
	public void withdraw(int amt){
		if(amt > balance){
			System.out.println("Insufficient Balance");
		}
		else{
		balance = balance - amt;
		}
	}//withdraw
}//Bank

//main class
public class BankApp 
{
	//main method
	public static void main(String[] args) 
	{
		//setting the pin with 1010
		int pin = 1010;

		//declared the required variables
		int userPin, amountToDeposit, amountToWithdraw, userChoice;

		//object of the class Bank
		Bank b = new Bank();

		//object of the default class Scanner
		Scanner scan = new Scanner(System.in);

		//getting the input of the password
		System.out.println("Enter the password: ");

		//storing the entered password
		userPin = scan.nextInt();

		//validating the pin
		int i = 1;
		while (i < 3 && userPin != pin)
		{
			System.out.println("Invalid PIN");
			System.out.println("Enter the PIN");
			userPin = scan.nextInt();
			i++;
			if (i == 3 && userPin != pin)
			{
				System.out.println("Attempts exceeded.");
				System.out.println("Please contact the bank.");
			}
		}//while
		
		while (userPin == pin)
		{
			//
			System.out.println("Options:");
			System.out.println("1. Deposit");
			System.out.println("2. Check Balance");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			int choice;
			System.out.println("Enter the choice.");
			choice = scan.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter the amount to deposit");
				amountToDeposit = scan.nextInt();
				b.deposit(amountToDeposit);
				//validate the entered amount
				break;
			case 2:
				System.out.println("The balance is "+b.displayBal()+".");
				break;
			case 3:
				System.out.println("Enter the amount to withdraw");
				amountToWithdraw = scan.nextInt();
				b.withdraw(amountToWithdraw);
				//validate the entered amount
				break;
			case 4:
				System.out.println("Thank you, visit again!");
				System.exit(0);
			}//switch
		}//while
	}//main method
}//classApp
