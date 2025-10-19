package week5;

public class Exercise84 {
    private int value;   // current value of the counter
    private boolean check; // true = prevent counter from going below 0

    // Constructor 1: starting value + check
    public Exercise84(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    // Constructor 2: starting value, check is off
    public Exercise84(int startingValue) {
        this(startingValue, false);
    }

    // Constructor 3: only check, starting value = 0
    public Exercise84(boolean check) {
        this(0, check);
    }

    // Constructor 4: default, starting value = 0, check off
    public Exercise84() {
        this(0, false);
    }

    // Return current value
    public int value() {
        return this.value;
    }

    // Increase by 1
    public void increase() {
        this.value++;
    }

    // Decrease by 1, respecting check
    public void decrease() {
        if (this.check && this.value <= 0) {
            return;
        }
        this.value--;
        if (this.check && this.value < 0) {
            this.value = 0;
        }
    }

    // Overloaded increase: increase by given amount
    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
            return; // ignore negative increases
        }
        this.value += increaseAmount;
    }

    // Overloaded decrease: decrease by given amount
    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return; // ignore negative decreases
        }

        this.value -= decreaseAmount;

        if (this.check && this.value < 0) {
            this.value = 0; // prevent going below 0
        }
    }
}

