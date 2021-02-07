package org.wildfire.design.structure.facade;

public class AccountNumberChecker {
	
	private int accountNumber = 12345678;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public boolean isActiveAccountNumber(int account) {
		if(account == getAccountNumber()) {
			return true;
		}
		else {
			return false;
		}
	}
}
