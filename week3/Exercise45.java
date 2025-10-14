package week3;

public class Exercise45 {

    public static int greatest(int number1, int number2, int number3) {
        int greatest = number1;

        if (number2 > greatest) {
            greatest = number2;
        }

        if (number3 > greatest) {
            greatest = number3;
        }

        return greatest;
    }
    // sarnaselt eelmisele ülesandele saab siin ka muuta märgi ära et leida väikseim.
    public static void main(String[] args) {
        int answer = greatest(2, 7, 3);
        System.out.println();
        System.out.println("Greatest: " + answer);
    }
}