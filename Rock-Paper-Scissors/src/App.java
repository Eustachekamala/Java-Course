import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            
            System.out.println("************Welcome to the Rock-Paper-Scissors Game************");
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice is: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("******************");
                System.out.println("* It's a tie! 〠 *");
                System.out.println("******************");

            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                        System.out.println("****************");
                        System.out.println("* You win! ✅ *");
                        System.out.println("****************");
            } else {
                System.out.println("****************");
                System.out.println("* You lose! ❌ *");
                System.out.println("****************");
            }

            System.out.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while ( playAgain.equals("yes"));

        System.out.println("THANS FOR PLAYING");

        scanner.close();

    }
}
