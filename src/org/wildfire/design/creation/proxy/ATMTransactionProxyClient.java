package org.wildfire.design.creation.proxy;

public class ATMTransactionProxyClient {

	public static void main(String[] args) {
		ATMTransactionProxyService service = new ATMTransactionProxyService();
		service.depositFund(25.00);
		service.withdrawFund(20.00);
	}

}
