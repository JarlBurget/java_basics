package week9.Ex18.logic;

import week9.Ex18.domain.Box;
import week9.Ex18.domain.Thing;

import java.util.List;
import java.util.ArrayList;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<>();
        Box currentBox = new Box(boxesVolume);

        for (Thing thing : things) {
            if (!currentBox.addThing(thing)) {
                boxes.add(currentBox);
                currentBox = new Box(boxesVolume);
                currentBox.addThing(thing);
            }
        }

        boxes.add(currentBox);
        return boxes;
    }
}
