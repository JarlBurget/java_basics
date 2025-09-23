package week2;

public class Exercise40 {

    private static void printWhitespaces(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
    }

    private static void printStars(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
            System.out.println();
        }
    }

    private static void xmasTree(int height) {
        // Triangle
        for (int i = 1; i <= height; i++) {
            int stars = 2 * i - 1;
            int whitespaces = height - i;
            printWhitespaces(whitespaces);
            printStars(stars);
            System.out.println();
        }

        // Stand
        for (int i = 0; i < 2; i++) {
            printWhitespaces(height - 2);
            printStars(3);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Right-aligned triangle (size=4):");
        printTriangle(4);
        System.out.println();

        System.out.println("Christmas tree (height=4):");
        xmasTree(4);
        System.out.println();

        System.out.println("Christmas tree (height=10):");
        xmasTree(10);
    }
}
