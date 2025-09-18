package week1;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int points = scanner.nextInt();

        String grade;

        if (points >= 0 && points <= 29) {
            grade = "failed";
        } else if (points >= 30 && points <= 34) {
            grade = "1";
        } else if (points >= 35 && points <= 39) {
            grade = "2";
        } else if (points >= 40 && points <= 44) {
            grade = "3";
        } else if (points >= 45 && points <= 49) {
            grade = "4";
        } else if (points >= 50 && points <= 60) {
            grade = "5";
            // Kui teha selline hindamine siis oleks vaja luua ka valede punktide sisestamis loogika (- see, et siis tuleks igale poole kirjutada ette Grade,
            // sest muidu on vale punktide lisamise väärtus imelik)
        } else {
            grade = "Invalid points";
        }

        System.out.println("Grade: " + grade);
        scanner.close();
    }
}