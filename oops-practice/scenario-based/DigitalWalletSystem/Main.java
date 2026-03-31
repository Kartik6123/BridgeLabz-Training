package DigitalWalletSystem;

public class Main {
    public static void main(String[] args) {

        User u1 = new User(1, "Kartik");
        User u2 = new User(2, "Rahul");

        Wallet w1 = new Wallet(u1);
        Wallet w2 = new Wallet(u2);

        w1.addMoney(5000);

        TransferService walletTransfer =
                new WalletToWalletTransfer();

        try {
            walletTransfer.transfer(w1, w2, 2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        for (Transaction t : w1.getTransactions())
            System.out.println(t);
    }
}

