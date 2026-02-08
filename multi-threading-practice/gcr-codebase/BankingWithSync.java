package multi-threading;

import java.time.LocalDateTime;

class BankAccount {
    private int balance = 10000;

    // synchronized method
    public synchronized boolean withdraw(String customer, int amount) {
        if (balance >= amount) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            balance -= amount;
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalDateTime.now());
            return true;
        } else {
            System.out.println("Transaction failed (Insufficient Balance): " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalDateTime.now());
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}

class Transaction implements Runnable {

    private BankAccount account;
    private String customerName;
    private int amount;

    public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] State: "
                           + Thread.currentThread().getState());
        System.out.println("[" + customerName + "] Attempting to withdraw " + amount);
        account.withdraw(customerName, amount);
    }
}

public class BankingWithSync {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, "Customer-1", 3000), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, "Customer-2", 4000), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, "Customer-3", 2000), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, "Customer-4", 5000), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, "Customer-5", 1500), "Customer-5");

        System.out.println("Thread states before start:");
        System.out.println("Customer-1: " + t1.getState());
        System.out.println("Customer-2: " + t2.getState());
        System.out.println("Customer-3: " + t3.getState());
        System.out.println("Customer-4: " + t4.getState());
        System.out.println("Customer-5: " + t5.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join(); t2.join(); t3.join(); t4.join(); t5.join();

        System.out.println("\nFinal Balance (correct): " + account.getBalance());
    }
}