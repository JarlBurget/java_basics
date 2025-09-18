package week2;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Alates mis numbrist? ");
        int limit1 = Integer.parseInt(reader.nextLine());


        System.out.print("Kuni mis numbrini? ");
        int limit2 = Integer.parseInt(reader.nextLine());

        int number = limit1;

        while (number >= limit1 && number <= limit2) {
            System.out.println(number);
            number++;
        }

        reader.close();
    }
}
