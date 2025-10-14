package week3;

public class Exercise46 {

    // arvutab summa
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    // arvutab keskmise
    public static double average(int number1, int number2, int number3, int number4) {
        int total = sum(number1, number2, number3, number4); // use the helper method
        double average = total / 4.0; // peab olema komaga, et saaks komaga vastuse.
        return average;
    }


    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }
}