package classandobject;
public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    BankAccount(String accountHolder, String accountNumber, double balance){
        //constructor to initialize bank account details
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void depositMoney(double amount){
        //method to deposit money
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdrawMoney(double amount){
        //method to withdraw money
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }    
    void displayAccountDetails(double withdrawnAmount){
        //method to display account details
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Withdrawn Balance: "+ withdrawnAmount);
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Kartik", "1234567890", 5000.0);
        account.displayAccountDetails(0.0);
        account.depositMoney(1500.0);
        account.withdrawMoney(2000.0);
        account.displayAccountDetails(2000.0);
    }
}


