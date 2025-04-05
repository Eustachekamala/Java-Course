import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // JAVA QUIZ
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was facebook launched?",
                "Who's known the father of computer?",
                "What was the first programming language?"
        };

        String[][] options = {
                { "1. Storing files", "2. Encrypting data", "3. For Directing internet trafic", "4. Managing passwords" },
                { "1. CPU", "2. HARD DRIVE", "3. RAM", "4. GPU" },
                { "1. 2000", "2. 2004", "3. 2006", "4. 2008" },
                { "1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage" },
                { "1. COBOL", "2. C", "3. FORTRAN", "4. ASSEMBLY" }, };

        int[] answers = { 3, 1, 2, 4, 3 };

        int score = 0;
        int guess;

        System.out.println();
        System.out.println("**********Welcome to the Java Quiz**********");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for( String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            scanner.nextLine();

            if(guess == answers[i]){
                System.out.println("***************");
                System.out.println("* CORRECT! ✅ *");
                System.out.println("***************");
                System.out.println();
                score++;
            } else {
                System.out.println("*************");
                System.out.println("* WRONG! ❌ *");
                System.out.println("*************");
                System.out.println();
            }
        }

        System.out.println("Your score final is: " + score + " ✅ out of " + questions.length);

        scanner.close();
    }
}
