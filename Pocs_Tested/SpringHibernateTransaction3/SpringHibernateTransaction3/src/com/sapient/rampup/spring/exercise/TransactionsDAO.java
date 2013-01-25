package com.sapient.rampup.spring.exercise;

public interface TransactionsDAO {

	public void withdraw(int accNo, int amt);
	
	public void deposit(int accNo, int amt);
	
}
