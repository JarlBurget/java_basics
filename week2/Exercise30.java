package week2;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());

        int number = 1;

        while (number <= limit) {
            System.out.println(number);
            number++;
        }

        reader.close();
    }
}
