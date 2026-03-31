public abstract class BankAccount {

    private final String accountNumber;
    private final double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateFee();
}
