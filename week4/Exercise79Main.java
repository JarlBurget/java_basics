package week4;

import java.util.Scanner;

public class Exercise79Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Must be created in this order!
        Exercise79 allNumbers = new Exercise79();
        Exercise79 evenNumbers = new Exercise79();
        Exercise79 oddNumbers = new Exercise79();

        System.out.println("Type numbers:");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }

            allNumbers.addNumber(number);

            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }

        System.out.println("sum: " + allNumbers.sum());
        System.out.println("sum of even: " + evenNumbers.sum());
        System.out.println("sum of odd: " + oddNumbers.sum());
    }
}

// max lahe, et me siin koolis midagi ei õpi