package pillarsofoops;
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount {
    // Abstract Class
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        // Constructor
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        // Getter
        return balance;
    }

    public void deposit(double amount) {
        // Deposit Method
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
            // Withdraw Method
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    abstract double calculateInterest();

    void displayDetails() {
        // Display Method
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable { 
    // Concrete Class

    SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    double calculateInterest() {
        // Interest Calculation
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    // Concrete Class

    CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: " + amount);
    }

    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA101", "Alice", 50000);
        CurrentAccount ca = new CurrentAccount("CA201", "Bob", 80000);

        sa.deposit(5000);
        sa.displayDetails();
        System.out.println("Interest: " + sa.calculateInterest());
        sa.applyForLoan(20000);
        System.out.println("Loan Eligibility: " + sa.calculateLoanEligibility());

        System.out.println();

        ca.withdraw(10000);
        ca.displayDetails();
        System.out.println("Interest: " + ca.calculateInterest());
        ca.applyForLoan(40000);
        System.out.println("Loan Eligibility: " + ca.calculateLoanEligibility());
    }
}
