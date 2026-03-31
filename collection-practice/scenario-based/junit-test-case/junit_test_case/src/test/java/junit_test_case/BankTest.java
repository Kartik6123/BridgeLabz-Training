package junit_test_case;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankTest {
	
	@Test
	public void Test_Deposit_ValidAmount() {
		Bank account=new Bank(15000);
		account.deposit(3399);
		assertEquals(18399,account.getBalance());
	}
	@Test
	public void Test_Deposit_NegativeAmount() {
		Bank account=new Bank(10000);
		account.deposit(-1000);
		assertEquals(9000,account.getBalance());
	}
	
	@Test
	public void Test_Withdraw_ValidAmount() {
		Bank account=new Bank(5000);
		account.withdraw(4999);
		assertEquals(1,account.getBalance());
	}
	
	@Test
	public void Test_Withdraw_InsufficientFunds() {
		Bank account=new Bank(5000);
		account.withdraw(6000);
		assertEquals(-1000,account.getBalance());
	}
	

}
