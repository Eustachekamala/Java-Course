import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "Hangman-Game/src/words.txt";
        String scoreFilePath = "Hangman-Game/src/score.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(System.in);

        int wins = 0;
        int losses = 0;

        boolean playAgain = true;

        while (playAgain) {
            String word = "";

            // Load random word
            if (file.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    List<String> words = new ArrayList<>();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        words.add(line.trim());
                    }
                    if (!words.isEmpty()) {
                        word = words.get((int) (Math.random() * words.size())).toLowerCase();
                    } else {
                        System.out.println("The word list is empty. Exiting...");
                        return;
                    }
                } catch (IOException e) {
                    System.out.println("Error reading the file.");
                    return;
                }
            } else {
                System.out.println("Word file not found. Exiting...");
                return;
            }

            ArrayList<Character> wordState = new ArrayList<>();
            Set<Character> guessedLetters = new LinkedHashSet<>();
            int wrongGuesses = 0;

            for (int i = 0; i < word.length(); i++) {
                wordState.add('_');
            }

            System.out.println("\n*************** Welcome to Java Hangman Game ***************");

            while (wrongGuesses < 6) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.print("Word: ");
                for (char c : wordState) {
                    System.out.print(c + " ");
                }
                System.out.println();
                System.out.println("Guessed letters: " + guessedLetters);

                System.out.print("Guess a letter: ");
                String input = scanner.nextLine().toLowerCase().trim();

                if (input.isEmpty()) {
                    System.out.println("Please enter a letter.\n");
                    continue;
                }

                char guess = input.charAt(0);

                if (!Character.isLetter(guess)) {
                    System.out.println("Please enter only letters.\n");
                    continue;
                }

                if (guessedLetters.contains(guess)) {
                    System.out.println("You already guessed that letter!\n");
                    continue;
                }

                guessedLetters.add(guess);

                if (word.indexOf(guess) >= 0) {
                    System.out.println("✅ Correct!\n");
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == guess) {
                            wordState.set(i, guess);
                        }
                    }
                    if (!wordState.contains('_')) {
                        System.out.println("🎉 You won! The word was: " + word);
                        wins++;
                        break;
                    }
                } else {
                    wrongGuesses++;
                    System.out.println("❌ Wrong guess!\n");
                }
            }

            if (wrongGuesses >= 6) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("☠️ GAME OVER! The word was: " + word);
                losses++;
            }

            System.out.print("\nPlay again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        // Game summary
        int totalGames = wins + losses;
        System.out.println("\n📊 Game Summary:");
        System.out.println("Total games played: " + totalGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

        // Save to score file
        try (FileWriter scoreWriter = new FileWriter(scoreFilePath)) {
            scoreWriter.write("Total games: " + totalGames + "\n");
            scoreWriter.write("Wins: " + wins + "\n");
            scoreWriter.write("Losses: " + losses + "\n");
            System.out.println("📁 Score saved to " + scoreFilePath);
        } catch (IOException e) {
            System.out.println("⚠️ Could not save score to file.");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                     0
                    
                    
                    """;
            case 2 -> """
                     0
                     |
                    
                    """;
            case 3 -> """
                     0
                    /|
                    
                    """;
            case 4 -> """
                     0
                    /|\\
                    
                    """;
            case 5 -> """
                     0
                    /|\\
                    /
                    """;
            case 6 -> """
                     0
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }
}
