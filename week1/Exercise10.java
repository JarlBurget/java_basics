package week1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a radius: ");
        int radius = scanner.nextInt();

        double pi = Math.PI;

        double result = (double) radius * pi * 2  ;

        System.out.println("\nCircumference of the circle: " + result);
    }
}
