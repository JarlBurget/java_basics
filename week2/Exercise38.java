package week2;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How many times u want to print this? ");
        int times = Integer.parseInt(reader.nextLine());

        int count = 0;
        while (count < times) {
            printText();
            count++;
        }

        reader.close();
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
