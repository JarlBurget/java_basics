package week4;

public class Exercise75 {
    private int value;          // current counter value
    private int initialValue;   // remembers the initial value

    public Exercise75(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart; // store the starting value
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    // Decrease the counter by 1, but not below 0
    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    // Reset counter to zero
    public void reset() {
        this.value = 0;
    }

    // Set counter back to its initial value
    public void setInitial() {
        this.value = this.initialValue;
    }
}