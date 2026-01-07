package OnlineBankingSystem;
import java.util.ArrayList;
public class TransferMoney extends CreateAccount{
    ArrayList<String> transactions = new ArrayList<>();
    TransferMoney(String userName, String accountNumber, double initialDeposit){
        super(userName, accountNumber, initialDeposit);
    }
    void transfer(double amount, String toAccount){
        if(amount > initialDeposit){
            System.out.println("Insufficient balance to transfer $" + amount);
            transactions.add("Failed transfer of $" + amount + " to account " + toAccount);
        } else {
            initialDeposit -= amount;
            System.out.println("Transferred $" + amount + " to account " + toAccount);
            System.out.println("New Balance: $" + initialDeposit);
            transactions.add("Transferred $" + amount + " to account " + toAccount);
        }
    }
    void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid deposit amount");
            transactions.add("Failed deposit of $" + amount);
        } else {
            initialDeposit += amount;
            System.out.println("Deposited $" + amount);
            System.out.println("New Balance: $" + initialDeposit);
            transactions.add("Deposited $" + amount);
        }
    }
    
}
