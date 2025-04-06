import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE
        /*
         * DECLARE VARIABLES
         * DISPLAY WELCOME MESSAGE
         * PLAY IF BALANCE > 0
         * ENTER BET AMOUNT
         *      VERIFY IF THE BET > BALANCE
         *      VERIFY IF BET > 0
         *      SUBTRACT BET FROM BALANCE
         * SPIN ROW
         * PRINT ROW
         * GET PAYOUT
         * ASK TO PLAY AGAIN
         * DISPLAY EXIT MESSAGE
         */

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("**********Welocome to Java Slots**********");
        System.out.println("|        Symbols: 🍒 🍉 🍋 🔔 🍆         |");       
        System.out.println("******************************************");

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amout: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("INFUFFICIENT FUNDS");
                continue;
            } else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
                System.out.println("$" + balance);
            }
            System.out.println("Spinining...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
            } else {
                System.out.println("Sorry you lost this round");
            }

            System.out.println("Do you want to play again?: ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }
        System.out.println("GAME OVER! Your final balance is: $" + balance);
        scanner.close();
    }

    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "🍆" };
        String[] row = new String[3];
        Random random = new Random();


        for(int i = 0; i < 3; i++){
            row[i] =  symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println("*************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*************");
    }

    static int getPayout(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch (row[0]) {
                case "🍒":
                    return bet * 3;
                case "🍉":
                    return bet * 4;
                case "🍋":
                    return bet * 5;
                case "🔔":
                    return bet * 10;
                case "🍆":
                    return bet * 20;
                default:
                    return 0;
            }
        } else if(row[0].equals(row[1])){
            switch (row[1]) {
                case "🍒":
                    return bet * 2;
                case "🍉":
                    return bet * 3;
                case "🍋":
                    return bet * 4;
                case "🔔":
                    return bet * 5;
                case "🍆":
                    return bet * 10;
                default:
                    return 0;
            }
        } else if(row[1].equals(row[2])){
            switch (row[1]) {
                case "🍒":
                    return bet * 2;
                case "🍉":
                    return bet * 3;
                case "🍋":
                    return bet * 4;
                case "🔔":
                    return bet * 5;
                case "🍆":
                    return bet * 10;
                default:
                    return 0;
            }
        }
        return 0;
    }
}