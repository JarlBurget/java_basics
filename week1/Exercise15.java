package week1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        String input = reader.nextLine();

        int number = Integer.parseInt(input);

        if (number >= 18) {
            System.out.println("\n" + "Võid jooma minna!");
        } else {
            System.out.println("\n" + "Kus su emme on?");
        }
    }
}

