package com.sapient.rampup.spring.exercise;

import java.util.List;

/*
 * Interface for Account Operations 
 */
public interface AccountDAO 
{
	//LocalSessionFactoryBean
	//Method to create account
	int createAccount(Account acc);

	//Method to select account based on ID
	Account selectAccount(int id);

	//Method to update account
	void updateAccount(Account acc);

	//Method to delete account
	void deleteAccount(int id);
	

}
