package week7.Ex4;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Thing thing : things) {
            total += thing.getWeight();
        }
        return total;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) return null;

        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }

    public String toString() {
        int count = things.size();
        String text = "";
        if (count == 0) {
            text = "empty";
        } else if (count == 1) {
            text = "1 thing";
        } else {
            text = count + " things";
        }
        return text + " (" + totalWeight() + " kg)";
    }
}