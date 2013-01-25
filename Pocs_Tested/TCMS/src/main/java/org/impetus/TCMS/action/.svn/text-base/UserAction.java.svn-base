/*
 * 
 */

package org.impetus.TCMS.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.impetus.TCMS.bo.UserBo;
import org.impetus.TCMS.common.logging.ExceptionHandler;
import org.impetus.TCMS.model.Userdetails;

public class UserAction extends TCMSBaseAction {

	private UserBo userBo;
	private String username;
	private String password;

	/*public String execute() throws Exception {
		return SUCCESS;
	}*/

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public boolean isInvalid(String value) {
		return (value == null || value.length() == 0);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (isInvalid(getUsername()))
			return INPUT;

		if (isInvalid(getPassword()))
			return INPUT;

		try {
			System.out.println("Logged user : "+username);
			Userdetails loginuser = userBo.findUserbyName(username, password);			
			if (null != loginuser) {
				String userName = loginuser.getName();
				int userid = loginuser.getUserid();
				int clientid = loginuser.getClientdetails().getClientId();
				HttpSession session = ServletActionContext.getRequest()
						.getSession();
				session.setAttribute("loggedin", "true");
				session.setAttribute("currentuser", userName);
				session.setAttribute("currentuserid", userid);
				session.setAttribute("clientId", clientid);
				return SUCCESS;
			} else {
				return INPUT;
			}
		} catch (Exception ex) {
			String errMsg = ExceptionHandler.handleException(ex);
			addActionError(errMsg);
			ExceptionHandler.handleException(ex);
			return INPUT;
		}

	}

}