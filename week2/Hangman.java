package week2;

public class Hangman {
    // Internal state variables like:
    private String word;          // The word to guess
    private boolean[] guessed;    // Which letters have been guessed
    private int guessesMade;
    private String unusedLetters;

    public Hangman() {
        // Initialize the game:
        this.word = "variable"; // example
        this.guessed = new boolean[word.length()];
        this.guessesMade = 0;
        this.unusedLetters = "abcdefghijklmnopqrstuvwxyz";
    }

    public boolean gameOn() {
        // Return true if the game is still ongoing
        for (boolean b : guessed) {
            if (!b) {
                return true;
            }
        }
        return false;
    }

    public void printStatus() {
        // Print guessesMade and unusedLetters
        System.out.println("You have made " + guessesMade + " guesses.");
        System.out.println("Unused letters: " + unusedLetters);
    }

    public void printWord() {
        // Print the word with '?' for unguessed letters
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (guessed[i]) {
                sb.append(word.charAt(i));
            } else {
                sb.append("?");
            }
        }
        System.out.println("Word to be guessed: " + sb.toString());
    }

    public void printMan() {
        // Print the hangman graphic based on guessesMade
        System.out.println("Hangman state, guesses: " + guessesMade);
        // (Implement as you want)
    }

    public void guess(String letter) {
        // Process the guess
        letter = letter.toLowerCase();
        if (!unusedLetters.contains(letter)) {
            System.out.println("Letter " + letter + " has already been used.");
            return;
        }

        guessesMade++;
        unusedLetters = unusedLetters.replace(letter, "");

        if (word.contains(letter)) {
            System.out.println("The letter " + letter + " was found in the word!");
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter.charAt(0)) {
                    guessed[i] = true;
                }
            }
        } else {
            System.out.println("The letter " + letter + " is not in the word.");
        }
    }
}
