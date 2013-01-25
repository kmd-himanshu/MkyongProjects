/**
 * 
 */
package org.impetus.TCMS.common.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * @author kratika.gupta
 *
 */
@Component( "wsAuthenticationEntryPoint" )
public final class WSAuthenticationEntryPoint implements AuthenticationEntryPoint{
   
   @Override
   public final void commence
    ( HttpServletRequest request, HttpServletResponse response, AuthenticationException authException )   
    throws IOException{
	   
      response.sendError( HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized" );
   }
}




