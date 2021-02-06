package org.wildfire.design.creation.proxy;

public class ATMTransactionProxyService implements TransactionService {

	public boolean depositFund(double amount) {
		ATMTransactionService service = new ATMTransactionService();
		return service.depositFund(amount);
	}

	public boolean withdrawFund(double amount) {
		ATMTransactionService service = new ATMTransactionService();
		return service.withdrawFund(amount);
	}

}
