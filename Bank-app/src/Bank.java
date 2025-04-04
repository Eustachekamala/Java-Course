import java.util.Scanner;

public class Bank {
	private static double balance = 0.0;
	private static final String currency = "$";
	private static boolean isRunning = true;
	private static int choice;
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// JAVA BANKING PROGRAM
		System.out.println("*********BANKING PROGRAM************");
		System.out.println("1. Show Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("*************************************");


		while (isRunning) {

			System.out.print("Enter your choice (1-4): ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					showBalance();
					break;

				case 2:
					makeDeposit();
					break;

				case 3:
					withdraw();
					break;

				case 4:
					exitApp();
					break;

				default:
					System.out.println("Invalid choice");
					break;
			}
		}

		scanner.close();
	}

	static void showBalance() {
		System.out.println("Your balance is: " + currency  + balance);
	}

	static void makeDeposit() {
		System.out.print("Enter deposit amount: ");
		double deposit = scanner.nextDouble();
		if (deposit > 0) {
			balance += deposit;
			System.out.println("Deposit successful. New balance: " + currency  + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	static void withdraw() {
		System.out.print("Enter withdrawal amount: ");
		double withdrawal = scanner.nextDouble();
		if (withdrawal > balance) {
			System.out.println("Insufficient balance.");
		} else if (withdrawal > 0) {
			balance -= withdrawal;
			System.out.println("Withdrawal successful. New balance: " + currency  + balance);
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

	static void exitApp() {
		System.out.println("Thank you for using the banking program. Goodbye!");
		isRunning = false;
	}
}
