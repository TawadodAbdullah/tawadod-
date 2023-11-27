public class Main {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Doe", "ABC Bank", "123456789", 5000);
        wallet[1] = new CreditCard("Jane Smith", "DEF Bank", "987654321", 3500);
        wallet[2] = new CreditCard("Bob Johnson", "GHI Bank", "543216789", 2000);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(225);
            wallet[1].charge(150);
            wallet[2].charge(1000);
        }

        for (CreditCard card : wallet) {
            card.printCardInfo();
        }
    }
}