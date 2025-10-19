package week7.Ex4;

public class Main {
    public static void main(String[] args) {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        // Suitcases
        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        // Container
        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);
        System.out.println("Contents of the container:");
        container.printThings();

        // Add lots of bricks
        Container bigContainer = new Container(1000);
        addSuitcasesFullOfBricks(bigContainer);
        System.out.println(bigContainer);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i <= 100; i++) {
            Suitcase suitcase = new Suitcase(1000); // single brick per suitcase
            Thing brick = new Thing("Brick", i);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }
}
