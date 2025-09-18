package week2;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        // Lisasin siia ka insert number kuna ei saanud muidu are, et peab üldse numbri sisestama aga töötab ka selleta

        while (true) {
            System.out.print("Insert a number: ");
            String input = reader.nextLine();

            try {
                int read = Integer.parseInt(input);
                if (read == 0) {
                    break;
                }

                sum += read;
                System.out.println("Sum now: " + sum);

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer!");
            }
        }

        System.out.println("Sum in the end: " + sum);
        reader.close();
    }
}
