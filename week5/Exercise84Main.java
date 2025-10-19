package week5;

public class Exercise84Main {
    public static void main(String[] args) {
        Exercise84 counter1 = new Exercise84(10, true);
        Exercise84 counter2 = new Exercise84(5);
        Exercise84 counter3 = new Exercise84(true);
        Exercise84 counter4 = new Exercise84();

        System.out.println("Initial values:");
        System.out.println("Counter1: " + counter1.value());
        System.out.println("Counter2: " + counter2.value());
        System.out.println("Counter3: " + counter3.value());
        System.out.println("Counter4: " + counter4.value());
        System.out.println();

        System.out.println("Increasing counter1 by 3...");
        counter1.increase(3);
        System.out.println("Counter1: " + counter1.value());

        System.out.println("Decreasing counter1 by 15 (check on)...");
        counter1.decrease(15);
        System.out.println("Counter1: " + counter1.value()); // should not go below 0

        System.out.println();

        System.out.println("Decreasing counter2 by 2 (check off)...");
        counter2.decrease(2);
        System.out.println("Counter2: " + counter2.value());

        System.out.println("Decreasing counter2 by 10 (check off)...");
        counter2.decrease(10);
        System.out.println("Counter2: " + counter2.value()); // can go below 0
    }
}