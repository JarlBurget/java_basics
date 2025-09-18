package week2;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int i = Integer.parseInt(reader.nextLine());

        int count = 1;
        int sum = 0;

        while (count <= i) {
            sum += count;
            count++;
        }

        System.out.println("Sum is " + sum);

        reader.close();
    }
}
