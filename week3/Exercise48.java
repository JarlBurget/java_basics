package week3;

import java.util.Scanner;

public class Exercise48 {

    // See võtab esimese tähe
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        char first = firstCharacter(name);

        System.out.println("First character: " + first);
    }
}
