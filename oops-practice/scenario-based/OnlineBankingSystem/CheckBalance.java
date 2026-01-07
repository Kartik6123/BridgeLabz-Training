package OnlineBankingSystem;

public class CheckBalance extends CreateAccount{
    CheckBalance(String userName, String accountNumber, double initialDeposit){
        super(userName, accountNumber, initialDeposit);
    }
    void displayBalance(){
        System.out.println("Account Holder: " + userName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + initialDeposit);
    }
    
}
