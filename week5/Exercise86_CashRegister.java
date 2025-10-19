package week5;

public class Exercise86_CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public Exercise86_CashRegister() {
        this.cashInRegister = 1000.0;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    // ----- Paying with cash -----
    public double payEconomical(double cashGiven) {
        double price = 2.50;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.economicalSold++;
            return cashGiven - price;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        double price = 4.00;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.gourmetSold++;
            return cashGiven - price;
        } else {
            return cashGiven;
        }
    }

    // ----- Paying with card -----
    public boolean payEconomical(Exercise86_LyyraCard card) {
        double price = 2.50;
        boolean success = card.pay(price);
        if (success) {
            this.economicalSold++;
        }
        return success;
    }

    public boolean payGourmet(Exercise86_LyyraCard card) {
        double price = 4.00;
        boolean success = card.pay(price);
        if (success) {
            this.gourmetSold++;
        }
        return success;
    }

    // ----- Loading money to card -----
    public void loadMoneyToCard(Exercise86_LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + this.cashInRegister +
                " economical lunches sold: " + this.economicalSold +
                " gourmet lunches sold: " + this.gourmetSold;
    }
}
