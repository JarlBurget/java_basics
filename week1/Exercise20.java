package week1;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = scanner.nextLine();

        System.out.print("Type your password: ");
        String password = scanner.nextLine();

        if ((username.equals("alex") && password.equals("mightyducks")) ||
                (username.equals("emily") && password.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }

        scanner.close();
    }
}
