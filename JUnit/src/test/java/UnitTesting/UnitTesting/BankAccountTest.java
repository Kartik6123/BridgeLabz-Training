package UnitTesting.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.deposit(500);
        account.withdraw(200);
        assertEquals(300, account.getBalance());
    }

    @Test
    void testMultipleTransactions() {
        account.deposit(1000);
        account.withdraw(300);
        account.deposit(200);
        assertEquals(900, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        account.deposit(100);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200);
        });
    }
}
