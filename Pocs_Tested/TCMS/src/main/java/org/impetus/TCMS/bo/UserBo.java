package org.impetus.TCMS.bo;

import org.impetus.TCMS.model.Userdetails;

public interface UserBo {

	Userdetails findUserbyName(String username,String password) throws Exception;
	Userdetails getUserfromId(Integer Id) throws Exception;
}
