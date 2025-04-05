import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static boolean isRunning = true;
    public static void main(String[] args) throws Exception {
        
        //DICE ROLLER PROGRAM
        /*
         * 1. DECLARE VARIABLES
         * 2. GET # OF DICE FROM THE USER
         * 3. CHECK IF # OF DICE > 0
         * 4. ROLL ALL THE DICE
         * 5. GET THE TOTAL
         * 6.  DISPLAY ASCII OF DICE
         */

        int numOfDice;
        int total = 0;

        while (isRunning) {
            System.out.print("Enter the # of Dice to roll: ");
            numOfDice = scanner.nextInt();

            if (numOfDice > 0) {
                for(int i = 0; i < numOfDice; i++){
                    int roll = random.nextInt(6) + 1;
                    printDie(roll);
                    System.out.println("You rolled: " + roll);
                    total += roll;
                }
                System.out.println("Total: " + total);
            } else {
                System.out.println("# of dice must be greater than zero");
            }
        }


        scanner.close();
    }

    static void printDie(int roll){
        String dice1 = """
                
                 -------
                |       |
                |   ●   |
                |       |
                 -------

                """;

        String dice2 = """
                
                 -------
                | ●     |
                |       |
                |     ● |
                 -------

                """;

        String dice3 = """
                
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------

                """;

        String dice4 = """
                
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------

                """;

        
        String dice5 = """
                
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------

                """;

        
        String dice6 = """
                
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------

                """;
        
        switch (roll) {
            case 1: System.out.println(dice1);
                break;
            
            case 2: System.out.println(dice2);
                break;
            
            case 3: System.out.println(dice3);
                break;
            
            case 4: System.out.println(dice4);
                break;
            
            case 5: System.out.println(dice5);
                break;
            
            case 6: System.out.println(dice6);
                break;
        
            default: 
                System.out.println("Invalid number of roll");
                break;
        }
    }
}
