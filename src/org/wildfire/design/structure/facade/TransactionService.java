package org.wildfire.design.structure.facade;

public class TransactionService {
	
	private static double cashInAccount = 10000.00;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void depositFund(double amount) {
		cashInAccount += amount;
	}
	
	public void withdrawFund(double amount) {
		cashInAccount -= amount;
	}
	
	public boolean haveEnoughMoney(double withdrawalAmount) {
		
		if(getCashInAccount() > withdrawalAmount) {
			withdrawFund(withdrawalAmount);
			System.out.println("Amount is withdrawn successfully. \nCurrent account balance: " + getCashInAccount());
			return true;
		}
		else {
			System.out.println("You don't have enough money. \nCurrent account balance: " + getCashInAccount());
			return false;
		}
	}
	
	public void makeDeposit(double amount) {
		depositFund(amount);
		System.out.println("Amount is deposited successfully. \nCurrent account balance: " + getCashInAccount());
	}

}
