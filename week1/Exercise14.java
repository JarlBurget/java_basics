package week1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        String input = reader.nextLine();

        // Convert input String to int
        int number = Integer.parseInt(input);

        if (number >= 0) {
            System.out.println("\n" + "Your number is positive!");
        } else {
            System.out.println("\n" + "Your number is negative!");
        }
    }
}

