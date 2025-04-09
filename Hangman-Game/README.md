# Java Hangman Game

## Overview
This is a simple Hangman game implemented in Java. The program reads a list of words from a file and selects one randomly for the user to guess. The user has six attempts to guess the word correctly by guessing one letter at a time. The game also tracks the player's wins and losses and saves the results to a score file.

## Features
- Reads a list of words from a file (`words.txt`).
- Randomly selects a word for the game.
- Displays the current state of the word with underscores for unguessed letters.
- Tracks the number of incorrect guesses and displays a Hangman ASCII art.
- Ends the game when the word is guessed or the user exceeds six incorrect guesses.
- Tracks the total number of games played, wins, and losses.
- Saves the game summary to a score file (`score.txt`).

## How It Works
1. The program reads words from the file `Hangman-Game/src/words.txt`.
2. A random word is selected from the file.
3. The user guesses letters one at a time.
4. The program updates the word's state if the guessed letter is correct or increments the wrong guess count if incorrect.
5. The game ends when:
   - The user guesses the word correctly.
   - The user exceeds six incorrect guesses.
6. After the game ends, the user is prompted to play again.
7. At the end of all games, the program displays a summary of wins and losses and saves the results to `score.txt`.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- A `words.txt` file located in the `Hangman-Game/src/` directory containing a list of words (one word per line).

## How to Run
1. Ensure the `words.txt` file exists in the `Hangman-Game/src/` directory and contains words.
2. Compile and run the program:
   ```bash
   javac Main.java
   java Main