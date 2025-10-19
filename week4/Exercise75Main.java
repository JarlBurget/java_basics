package week4;

public class Exercise75Main {
    public static void main(String[] args) {
        Exercise75 counter = new Exercise75(100);

        counter.printValue();    // value: 100

        counter.decrease();
        counter.printValue();    // value: 99

        counter.decrease();
        counter.printValue();    // value: 98

        counter.reset();
        counter.printValue();    // value: 0

        counter.setInitial();
        counter.printValue();    // value: 100
    }
}

// üli lahe
// Viimane number peab olema -1