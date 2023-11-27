public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;


    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }



    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }


    public void updateCreditLimit(int newLimit) {
        limit = newLimit;
    }


    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }


    public void makePayment(double amount) {
        balance -= amount;
    }


    public void printCardInfo() {
        System.out.println("Customer: " + customer);
        System.out.println("Bank: " + bank);
        System.out.println("Account: " + account);
        System.out.println("Limit: " + limit);
        System.out.println("Balance: " + balance);
    }
}
