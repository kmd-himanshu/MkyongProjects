package com.sapient.rampup.spring.exercise;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class AccountDAOImpl extends HibernateDaoSupport implements AccountDAO {

	public int createAccount(Account acc)
	{
		int accID = (Integer) getHibernateTemplate().save(acc);
		return accID;
	}

	//Method to select account based on ID
	public Account selectAccount(int id)
	{
		Account a = getHibernateTemplate().get(Account.class, id);
		return a;
	}

	//Method to update account
	public void updateAccount(Account acc)
	{
		getHibernateTemplate().update(acc);
	}

	//Method to delete account
	public void deleteAccount(int id)
	{
		Account a = selectAccount(id);
		getHibernateTemplate().delete(a);
	}
}
