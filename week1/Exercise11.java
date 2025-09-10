package week1;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        double first = scanner.nextDouble();

        System.out.print("Type another number: ");
        double second = scanner.nextDouble();

        System.out.println("\nThe bigger number of the two numbers given was: " + Math.max(first, second));
    }
}

// Kasutasin doubleit et saaks kasutada ka komasi