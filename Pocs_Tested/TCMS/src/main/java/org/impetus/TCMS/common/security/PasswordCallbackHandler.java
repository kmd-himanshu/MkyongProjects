package org.impetus.TCMS.common.security;
import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ws.security.WSPasswordCallback;

public class PasswordCallbackHandler implements CallbackHandler {

protected final Log logger = LogFactory.getLog(getClass());


public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

   WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
   logger.info("Password Callback Handler: " + pc);
   logger.info("identifier: " + pc.getIdentifier());
   logger.info("password: " + pc.getPassword());

   if (pc.getIdentifier().equals("wsclient")) {
      // set the password on the callback. This will later be compared to the
      // password which was sent from the client.	   
      pc.setPassword("password123");
      logger.info("password set to : " + pc.getPassword());
   }
}

}