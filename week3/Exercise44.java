package week3;

public class Exercise44 {

    public static int least(int number1, int number2) {

        // kui tahad suuremat numbrit siis tuleb muuta lihtsalt < suuremaks märgiks >
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }

}
