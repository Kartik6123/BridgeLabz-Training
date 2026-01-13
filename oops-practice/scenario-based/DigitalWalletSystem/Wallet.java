package DigitalWalletSystem;
import java.util.*;

public class Wallet {
    private User user;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Wallet(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("CREDIT", amount));
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (balance < amount)
            throw new InsufficientBalanceException("Insufficient balance");

        balance -= amount;
        transactions.add(new Transaction("DEBIT", amount));
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

