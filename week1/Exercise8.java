package week1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int first = scanner.nextInt();

        System.out.print("Type another number: ");
        int second = scanner.nextInt();

        int sum = first + second;
        System.out.println("\nSum of the numbers: " + sum);
    }
}