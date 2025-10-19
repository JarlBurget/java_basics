package week7.Ex7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");

        while (true) {
            System.out.print("\nStatement: ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (command.equals("add")) {
                addWord();
            } else if (command.equals("translate")) {
                translateWord();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    private void addWord() {
        System.out.print("In Finnish: ");
        String word = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(word, translation);
    }

    private void translateWord() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        String translation = dictionary.translate(word);
        if (translation != null) {
            System.out.println("Translation: " + translation);
        } else {
            System.out.println("Word not found");
        }
    }
}
