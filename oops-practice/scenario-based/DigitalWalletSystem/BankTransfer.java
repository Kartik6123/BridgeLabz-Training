package DigitalWalletSystem;

public class BankTransfer implements TransferService {

    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException {

        from.withdrawMoney(amount);
        to.addMoney(amount);

        from.addTransaction(new Transaction("BANK_TRANSFER_OUT", amount));
        to.addTransaction(new Transaction("BANK_TRANSFER_IN", amount));
    }
}

