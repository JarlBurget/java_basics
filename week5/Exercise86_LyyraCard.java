package week5;

public class Exercise86_LyyraCard {
    private double balance;

    public Exercise86_LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean pay(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
