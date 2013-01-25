/**
 * 
 */
package org.impetus.TCMS.dao.impl;

import org.hibernate.Session;
import org.impetus.TCMS.common.db.GenericDAOImpl;
import org.impetus.TCMS.dao.UserDAO;
import org.impetus.TCMS.model.Producttestsuite;
import org.impetus.TCMS.model.Userdetails;
import org.springframework.dao.DataAccessException;

/**
 * @author kratika.gupta
 *
 */
public class UserDAOImpl extends GenericDAOImpl implements UserDAO{
	
	public Userdetails findUserbyName(String username,String password) throws Exception
	{
		try
		{
		Userdetails userdetails=null;
		
		Session session = getSession();		 
		String hqlQuery = "from Userdetails where name =:name and password =:password";
		userdetails = (Userdetails)session.createQuery(hqlQuery)
								.setParameter("name", username)
								.setParameter("password", password)								
								.uniqueResult();

		return userdetails;
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see org.impetus.TCMS.dao.UserDAO#getUserfromId(java.lang.Integer)
	 */
	@Override
	public Userdetails getUserfromId(Integer Id) throws Exception {
		// TODO Auto-generated method stub
		return (Userdetails)get(Userdetails.class,Id.shortValue());
	}

}
