/**
 * 
 */
package org.impetus.TCMS.bo.impl;

import org.impetus.TCMS.bo.ClientBo;
import org.impetus.TCMS.dao.ClientDAO;

/**
 * @author kratika.gupta
 *
 */
public class ClientBoImpl implements ClientBo {

	ClientDAO clientDAO;
	
	/**
	 * @param clientDAO the clientDAO to set
	 */
	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}
	

}
