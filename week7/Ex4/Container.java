package week7.Ex4;

import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
