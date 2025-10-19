package week3;

import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        System.out.print("In reverse order: ");

        int index = name.length() - 1;

        while (index >= 0) {
            System.out.print(name.charAt(index));
            index--;
        }

        System.out.println();
        scanner.close();
    }
}
