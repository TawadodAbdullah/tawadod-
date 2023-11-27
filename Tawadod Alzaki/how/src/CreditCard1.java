public class CreditCard1 {
    // Instance variables
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    // Constructor
    public CreditCard1(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    // Accessor methods
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

    // Charge method
    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    // Make payment method
    public void makePayment(double amount) {
        if (amount < 0) {
            System.out.println("Invalid payment amount. Payment amount cannot be negative.");
            return;
        }
        balance -= amount;
    }

    // Print card information
    public void printCardInfo() {
        System.out.println("Customer: " + customer);
        System.out.println("Bank: " + bank);
        System.out.println("Account: " + account);
        System.out.println("Limit: " + limit);
        System.out.println("Balance: " + balance);
    }
}