package week2;

import java.util.Scanner;
import java.util.Random;

public class Exercise41 {

    // Simulates drawing a number between 0 and 100 inclusive
    public static int drawNumber() {
        Random random = new Random();
        return random.nextInt(101); // 0 to 100 inclusive
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberToGuess = drawNumber();
        int guessesMade = 0;
        boolean guessedCorrectly = false;

        // Uncomment the line below to see the drawn number for debugging:
        // System.out.println("DEBUG: Number to guess is " + numberToGuess);

        while (!guessedCorrectly) {
            System.out.print("Guess a number: ");
            int userGuess = Integer.parseInt(reader.nextLine());

            guessesMade++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations, your guess is correct!");
                guessedCorrectly = true;
            } else if (userGuess > numberToGuess) {
                System.out.println("The number is lesser, guesses made: " + guessesMade);
            } else {
                System.out.println("The number is greater, guesses made: " + guessesMade);
            }
        }

        reader.close();
    }
}
