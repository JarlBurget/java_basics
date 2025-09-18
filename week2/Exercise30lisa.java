package week2;

import java.util.Scanner;

public class Exercise30lisa {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        double limit = Double.parseDouble(reader.nextLine());

        double number = 1.0;

        while (number <= limit) {
            System.out.printf("%.1f%n", number);  // prints with 1 decimal place
            number += 0.1;  // increment by 0.1
        }

        reader.close();
    }
}