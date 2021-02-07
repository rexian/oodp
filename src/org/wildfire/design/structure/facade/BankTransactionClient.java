package org.wildfire.design.structure.facade;

public class BankTransactionClient {

	public static void main(String[] args) {
		BankAccountFacade facade = new BankAccountFacade(12345678, 1234);
		
		facade.withdrawCash(100.0);
		facade.withdrawCash(6000.0);
		
		facade.depositAmount(3000.0);
	}

}
