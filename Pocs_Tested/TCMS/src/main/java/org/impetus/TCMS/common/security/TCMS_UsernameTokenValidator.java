package org.impetus.TCMS.common.security;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.handler.RequestData;
import org.apache.ws.security.message.token.UsernameToken;
import org.apache.ws.security.validate.UsernameTokenValidator;
public class TCMS_UsernameTokenValidator extends UsernameTokenValidator {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Override
	protected void verifyPlaintextPassword(UsernameToken usernameToken,
			RequestData data) throws WSSecurityException {
		// usernameToken.getName(), usernameToken.getPassword(), authenticate against
		// directory store or database. Do nothing if successful. Throw
		// throw new WSSecurityException(WSSecurityException.FAILED_AUTHENTICATION); on failure.
		 logger.info("username: " +usernameToken.getName());
		 logger.info("password Type: " + usernameToken.getPasswordType());
		 logger.info("password: " + usernameToken.getPassword());
		 
		if((usernameToken.getPassword().trim().equals("password123")) )
		{
			 logger.info("Web Service Authentication Success : " + usernameToken.getPassword());			 
		}
		else{
		 logger.error("Authentication Error with Password : " + usernameToken.getPassword());
		 throw new WSSecurityException(WSSecurityException.FAILED_AUTHENTICATION);
		}
		
	}
}