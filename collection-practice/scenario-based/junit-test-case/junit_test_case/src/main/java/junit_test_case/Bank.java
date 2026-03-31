package junit_test_case;

public class Bank {

    private double balance;

    //constructor to initialize balance
    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    //method to deposit money
    public void deposit(double amount) {
        if (amount>0) {
            balance=balance + amount;
        }else {
        	throw new IllegalArgumentException("Negative ammount cannot be deposited.");
        }
    }

    //method to withdraw money
    public void withdraw(double amount) {
        if (amount>balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance=balance-amount;
    }

    //get the balance
    public double getBalance() {
        return balance;
    }
}
