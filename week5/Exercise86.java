package week5;

public class Exercise86 {
    public static void main(String[] args) {

        System.out.println("=== Exercise 86.1: LyyraCard ===");
        Exercise86_LyyraCard cardOfPekka = new Exercise86_LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance());
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance());

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance());
        System.out.println();

        System.out.println("=== Exercise 86.2: Cash payments ===");
        Exercise86_CashRegister unicafeExactum = new Exercise86_CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange);

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was " + theChange);

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was " + theChange);

        System.out.println(unicafeExactum);
        System.out.println();

        System.out.println("=== Exercise 86.3: Card payments ===");
        Exercise86_LyyraCard cardOfJim = new Exercise86_LyyraCard(7);

        boolean success = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + success);
        success = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + success);
        success = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + success);

        System.out.println(unicafeExactum);
        System.out.println();

        System.out.println("=== Exercise 86.4: Loading money ===");
        Exercise86_CashRegister newRegister = new Exercise86_CashRegister();
        System.out.println(newRegister);

        Exercise86_LyyraCard cardOfAnna = new Exercise86_LyyraCard(2);
        System.out.println("the card balance " + cardOfAnna.balance() + " euros");

        boolean paySuccess = newRegister.payGourmet(cardOfAnna);
        System.out.println("payment success: " + paySuccess);

        newRegister.loadMoneyToCard(cardOfAnna, 100);

        paySuccess = newRegister.payGourmet(cardOfAnna);
        System.out.println("payment success: " + paySuccess);

        System.out.println("the card balance " + cardOfAnna.balance() + " euros");
        System.out.println(newRegister);
    }
}
