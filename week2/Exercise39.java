package week2;

public class Exercise39 {

    private static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            printStars(sideSize);
        }
    }

    private static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    public static void main(String[] args) {
        // Testing part 39.1
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();

        // Testing part 39.2
        printSquare(4);
        System.out.println();

        // Testing part 39.3
        printRectangle(17, 3);
        System.out.println();

        // Testing part 39.4
        printTriangle(4);
    }
}
