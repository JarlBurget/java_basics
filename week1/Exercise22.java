package week1;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "carrot";

        while (true) {
            System.out.print("Type the password: ");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: U gay!");
                break;  // exit the loop
            } else {
                System.out.println("Wrong!");
            }
        }

        scanner.close();
    }
}
