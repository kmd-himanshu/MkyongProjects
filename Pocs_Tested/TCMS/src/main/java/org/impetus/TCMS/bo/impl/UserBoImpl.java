package org.impetus.TCMS.bo.impl;

import org.impetus.TCMS.bo.UserBo;
import org.impetus.TCMS.dao.UserDAO;
import org.impetus.TCMS.model.Userdetails;

public class UserBoImpl implements UserBo {

	UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public Userdetails findUserbyName(String username, String password)
			throws Exception {

		return userDAO.findUserbyName(username, password);
	}

	/* (non-Javadoc)
	 * @see org.impetus.TCMS.bo.UserBo#getUserfromId(java.lang.Integer)
	 */
	@Override
	public Userdetails getUserfromId(Integer Id) throws Exception {		
		return userDAO.getUserfromId(Id);
	}

	
}
