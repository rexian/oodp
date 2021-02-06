package org.wildfire.design.creation.proxy;

public interface TransactionService {
	
	public boolean depositFund(double amount);
	public boolean withdrawFund(double amount);

}
