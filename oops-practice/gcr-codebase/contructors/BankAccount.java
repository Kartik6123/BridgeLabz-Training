package contructors;

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    BankAccount() {
        // default constructor
        this.accountNumber = "";
        this.accountHolder = "";
        this.balance = 0.0;
    }
    BankAccount(String accountNumber, String accountHolder, double balance) {
        // parameterized constructor
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    double getBalance() {
        // getter method
        return this.balance;
    }
    void setBalance(double newBalance) {
        //  setter method
        if(newBalance < 0.0) {
            System.out.println("Invalid balance value. It cannot be negative. Old balance retained.");
            return;
        }
        this.balance = newBalance;
        
    }
}
class SavingAccount extends BankAccount{
    SavingAccount(){
        super();
        // default constructor pointing to parent class
    }
    SavingAccount(String accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
        // parameterized constructor pointing to parent class
    }
    void display(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.getBalance());
    }
}
class Main{
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("123456789", "Jan Do", 1500.0);
        sa.display();
    }
}
