package week1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name1 = scanner.nextLine();

        System.out.print("Type your age: ");
        int age1 = Integer.parseInt(scanner.nextLine());

        System.out.print("\nType your name: ");
        String name2 = scanner.nextLine();

        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(scanner.nextLine());

        int totalAge = age1 + age2;

        System.out.println("\n" + name1 + " and " + name2 + " are " + totalAge + " years old in total.");
    }
}
