package week3;

import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = scanner.nextLine();

        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(scanner.nextLine());

        int startIndex = word.length() - length;

        String endPart = word.substring(startIndex);

        System.out.println("Result: " + endPart);
    }
}