/*
 * 
 */
package org.impetus.TCMS.common.logging;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class LogInterceptor implements MethodInterceptor {
  private static Logger logger = Logger.getLogger(LogInterceptor.class);

  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
	  if (logger.isDebugEnabled()) {
		  logger.debug("Beginning method: " + methodInvocation.getMethod().getDeclaringClass() 
				  + "::" + methodInvocation.getMethod().getName());  
	  }
	  long startTime = System.currentTimeMillis();
	  try {
		  Object retVal = methodInvocation.proceed();
		  return retVal;
	  } finally {
		  if (logger.isDebugEnabled()) {
			  logger.debug("Ending method: "  + methodInvocation.getMethod().getDeclaringClass() 
					  + "::" + methodInvocation.getMethod().getName());
			  logger.debug("Method invocation time: " + (System.currentTimeMillis() - startTime) + " msecs.");
		  }
	  }
  }
}