package com.sapient.rampup.spring.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main 
{
	public static void main(String[] args) 
	{
		//create ApplicationContext
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	
			
		Account acc1 = createAccount();
        
		Account acc2 = createAccount2();
        
        
    	AccountDAO accountDAO=context.getBean("accountDAO",AccountDAO.class);
    	int accId1 = accountDAO.createAccount(acc1);
    	int accId2 = accountDAO.createAccount(acc2);
    	
    	Customer cust = new Customer();
    	cust.getAccounts().add(acc1);
    	cust.getAccounts().add(acc2);
    	
    	Account result = accountDAO.selectAccount(accId1);
        System.out.println("Balance is   "+result.getBalance());
        
        result.setBalance(8000);
        accountDAO.updateAccount(result);
        result = accountDAO.selectAccount(accId1);
        System.out.println("Updated Balance is   "+result.getBalance());
    	
        TransactionsDAO transactionsDAO=context.getBean("transactionDAO",TransactionsDAO.class);
        transactionsDAO.withdraw(accId1, 2000);
        result = accountDAO.selectAccount(accId1);
        System.out.println("Balance after Withdrawl is   "+result.getBalance());
        
        transactionsDAO.deposit(accId1, 4000);
        result = accountDAO.selectAccount(accId1);
        System.out.println("Balance after Deposit is   "+result.getBalance());
        
        
            
        //accountDAO.deleteAccount(accId1);
     
    	
    	context.destroy();
    }

	private static Account createAccount2() {
		Account acc2 = new Account();
        acc2.setType("Current");
        acc2.setBalance(500);
		return acc2;
	}

	private static Account createAccount() {
		Account acc1 = new Account();
        acc1.setType("Savings");
        acc1.setBalance(5000);
		return acc1;
	}
}