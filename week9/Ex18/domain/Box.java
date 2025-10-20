package week9.Ex18.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<>();
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maximumCapacity) {
            this.things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int total = 0;
        for (Thing thing : things) {
            total += thing.getVolume();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Box: total volume " + getVolume() + " dm^3, contents: ");
        for (Thing thing : things) {
            sb.append("\n  - ").append(thing.toString());
        }
        return sb.toString();
    }
}