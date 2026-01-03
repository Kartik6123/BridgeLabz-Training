package inheritance;

public class BankAccount {
    //parent class
    String accountNumber;
    double balance;
     BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
     void displayDetails(){;
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
     }
}
class SavingsAccount extends BankAccount{
    //subclass
    double instrestRate;
    SavingsAccount(String accountNumber,double balance,double instrestRate){
        super(accountNumber,balance);
        this.instrestRate=instrestRate;
    }
    void display(){
        System.out.println("Account Type : Savings Account");
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
        System.out.println("Interest Rate :"+instrestRate);
    }
}
class CheckingAccount extends BankAccount{
    //subclass
    int withdrawalLimit;
    CheckingAccount(String accountNumber,double balance,int withdrawalLimit){
        super(accountNumber,balance);
        this.withdrawalLimit=withdrawalLimit;
    }
    void display(){
        System.out.println("Account Type : Checking Account");
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
        System.out.println("Withdrawal Limit :"+withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount{
    //subclass
    FixedDepositAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
    void display(){
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
    }
}
class Main{
    public static void main(String[] args) {
        BankAccount ba=new BankAccount("BA1001",5000.0);
        ba.displayDetails();
        System.out.println("--------------");
        SavingsAccount sa=new SavingsAccount("SA2001",10000.0,3.5);
        sa.display();
        System.out.println("--------------");
        CheckingAccount ca=new CheckingAccount("CA3001",15000.0,2000);
        ca.display();
        System.out.println("--------------");
        FixedDepositAccount fda=new FixedDepositAccount("FDA4001",20000.0);
        fda.display();
    }
}