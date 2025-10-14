package week3;

import java.util.Scanner;

public class Exercise47 {


    public static int loemeKarraktereid(String text) {
        return text.length();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int length = loemeKarraktereid(name);

        System.out.println("Number of characters: " + length);
    }
}
// see lahendus loeb ka tühikuid (järelikult tähemärk?)