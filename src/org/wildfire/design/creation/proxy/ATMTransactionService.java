package org.wildfire.design.creation.proxy;

public class ATMTransactionService implements TransactionService{

	double accountBalance = 1000.00;
	
	public boolean depositFund(double amount) {
		accountBalance += amount;
		System.out.println("Account balance after deposit: " + accountBalance);
		return true;
	}

	public boolean withdrawFund(double amount) {
		if(accountBalance >= amount) {
			accountBalance -= amount;
			System.out.println("Account balance after withdrawal: " + accountBalance);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double checkBalance() {
		System.out.println("Current balance: " + accountBalance);
		return accountBalance;
	}
}
