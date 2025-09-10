package week1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int first = scanner.nextInt();

        System.out.print("Type another number: ");
        int second = scanner.nextInt();

        double result = (double) first / second;

        System.out.println("\nDivision: " + result);
    }
}
