package week3;

import java.util.Scanner;

public class Exercise49 {

    // See võtab viimase tähe
    public static char lastCharacter(String text) {
        // ainuke erinevus on siin ja klassi nimi
        return text.charAt(text.length() - 1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        char first = lastCharacter(name);

        System.out.println("Last character: " + first);
    }
}
