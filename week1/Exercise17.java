package week1;


import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kasutan jälle doubleit et saaks kasutada ka komadega arve. Sama tulemuse saab kui kasutada int
        System.out.print("Type the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Type the second number: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Greater number: " + secondNumber);
        } else {
            System.out.println("The numbers are equal.");
        }

        scanner.close();
    }
}
