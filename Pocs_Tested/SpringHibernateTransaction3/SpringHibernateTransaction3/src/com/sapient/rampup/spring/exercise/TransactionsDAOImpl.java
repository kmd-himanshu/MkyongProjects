package com.sapient.rampup.spring.exercise;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class TransactionsDAOImpl extends HibernateDaoSupport implements TransactionsDAO {
	
	public void withdraw(int accNo, int amt)
	{
		HibernateTemplate ht = getHibernateTemplate();
		Account a = ht.get(Account.class, accNo);
		a.setBalance(a.getBalance() - amt);
		ht.update(a);
	}
	
	public void deposit(int accNo, int amt)
	{
		HibernateTemplate ht = getHibernateTemplate();
		Account a = ht.get(Account.class, accNo);
		a.setBalance(a.getBalance() + amt);
		ht.update(a);
	}
	
	
}
