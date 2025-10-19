package week3;

import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String first = scanner.nextLine();

        System.out.print("Type the second word: ");
        String second = scanner.nextLine();

        if (first.indexOf(second) != -1) {
            System.out.println("The word '" + second + "' is found in the word '" + first + "'.");
        } else {
            System.out.println("The word '" + second + "' is not found in the word '" + first + "'.");
        }
    }
}