package OnlineBankingSystem;

public class Main {
    public static void main(String[] args) {
        // Creating an account
        CreateAccount account = new CreateAccount("John Doe", "123456789", 1000.0);
        CheckBalance balanceChecker = new CheckBalance("John Doe", "123456789", 1000.0);
        TransferMoney transferService = new TransferMoney("John Doe", "123456789", 1000.0);
        TransactionHistory transactionHistory = new TransactionHistory("John Doe", "123456789", 1000.0);
        balanceChecker.displayBalance();
        transferService.deposit(500);
        transferService.transfer(300, "987654321");
        balanceChecker.displayBalance();
        transactionHistory.showTransactions();
    }
}
