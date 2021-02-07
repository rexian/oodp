package org.wildfire.design.structure.facade;

public class BankAccountFacade {
	
	private int accountNumber;
	private int securityCode;
	
	AccountNumberChecker accountChecker;
	SecurityCodeChecker securityCodeChecker;
	TransactionService transactionService;
	
	public BankAccountFacade(int account, int securityCode) {
		this.accountNumber = account;
		this.securityCode = securityCode;
		
		accountChecker = new AccountNumberChecker();
		securityCodeChecker = new SecurityCodeChecker();
		transactionService = new TransactionService();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getSecurityCode() {
		return securityCode;
	}
	
	public void withdrawCash(double withdrawalAmount) {
		
		if(accountChecker.isActiveAccountNumber(accountNumber) 
				&& securityCodeChecker.isValidSecurityCode(securityCode) 
				&& transactionService.haveEnoughMoney(withdrawalAmount)) {
			
			transactionService.withdrawFund(withdrawalAmount);
			System.out.println("Withdrawal transaction completed successfully.");
		}
		else {
			System.out.println("Withdrawal transaction failed.");
		}
	}
	
	public void depositAmount(double depositAmount) {
		
		if(accountChecker.isActiveAccountNumber(accountNumber) 
				&& securityCodeChecker.isValidSecurityCode(securityCode)) {
			
			transactionService.makeDeposit(depositAmount);
			System.out.println("Deposit transaction completed successfully.");
		}
		else {
			System.out.println("Deposit transaction failed.");
		}
	}
}
