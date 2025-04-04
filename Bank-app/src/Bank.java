import java.util.Scanner;

public class Bank {
	static Scanner scanner = new Scanner(System.in);
	static final String carrency = "$";
	static boolean isRunning = true;
	public static void main(String[] args) {
		// BANKING PROGRAM
		double balance = 0;
		int choice = 0;

		System.out.println("*************BANKING PROGRAM***************");
		System.out.println("1. Check Balance");
		System.out.println("2. Make Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("********************************************");

		while (isRunning) {
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					showBalance(balance);
					break;
				case 2:
					balance = makeDeposit(balance);
					break;
				case 3:
					balance = withdraw(balance);
					break;
				case 4: 
					exit();
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					break;
			}
		}

		scanner.close();
	}

	static void showBalance(double balance) {
		System.out.println("Your balance is: $" + balance + carrency);
	}

	static double makeDeposit(double balance) {
		System.out.print("Enter the amount to deposit: ");
		double deposit = scanner.nextDouble();
		if (deposit < 0) {
			System.out.println("Please enter a valid amount.");
		} else {
			balance += deposit;
			System.out.println("Deposit successful. New balance: $" + balance + carrency);
		}
		return balance;
	}

	static double withdraw(double balance) {
		System.out.print("Enter the amount to withdraw: ");
		double withdrawal = scanner.nextDouble();
		if (withdrawal < 0) {
			System.out.println("Please enter a valid amount.");
		} else if (withdrawal > balance) {
			System.out.println("Insufficient balance.");
		} else {
			balance -= withdrawal;
			System.out.println("Withdrawal successful. New balance: $" + balance);
		}
		return balance;
	}

	static void exit(){
		System.out.println("Exiting the program. Goodbye!");
		isRunning = false;
	}
}
