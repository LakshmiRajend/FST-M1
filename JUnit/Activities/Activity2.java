package tests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Activity2 {

	@Test
	public void notEnoughFunds() {
		BankAccount acc=new BankAccount(5000);
	    // Assertion for exception
	    assertThrows(NotEnoughFundsException.class, () -> acc.withdraw(10000));
	    System.out.println("Exception thrown:"+NotEnoughFundsException.class);
	}
	@Test
	void enoughFunds() {
	    // Create an object for BankAccount class
	    BankAccount account = new BankAccount(1000);

	    // Assertion for no exceptions
	    assertDoesNotThrow(() -> account.withdraw(1000));
	}
}
