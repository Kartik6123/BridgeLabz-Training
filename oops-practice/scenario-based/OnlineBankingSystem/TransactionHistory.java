package OnlineBankingSystem;
public class TransactionHistory extends TransferMoney{
    TransactionHistory(String userName, String accountNumber, double initialDeposit){
        super(userName, accountNumber, initialDeposit);
    }
    void showTransactions(){
        System.out.println("Transaction History for " + userName + ":");
        for(String transaction : transactions){
            System.out.println(transaction);
        }
    }
    
}
