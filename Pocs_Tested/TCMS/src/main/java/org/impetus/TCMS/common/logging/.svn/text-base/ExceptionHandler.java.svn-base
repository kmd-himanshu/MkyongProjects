/*
 * 
 */
package org.impetus.TCMS.common.logging;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;

public class ExceptionHandler {

	private static Logger logger = Logger.getLogger(ExceptionHandler.class);
	// private static ApplicationContext appContext;

	// message codes
	private static final String DB_ERROR = "DB_ERROR";
	private static final String GENERIC_ERROR = "GENERIC_ERROR";

	public static String handleException(Exception e) {
		String errorMessage = "";
		if (e instanceof DataAccessException) {
			// handle Db related runtime exception
			// we can further check what type of error has occurred
			// get the actual message String from resource bundle
			// errorMessage = get the message from resource bundle
			if (e instanceof DataAccessResourceFailureException) {
				// perform appropriate handling as desired
				// similarly other DAO exceptions can be handled
			}
			logger.error("Got a DB exception :" + e.getMessage(), e);
			errorMessage = geti18nMessage(DB_ERROR) + e.getMessage();
		} else {

			logger.error("Got an unexpected error :" + e.getMessage(), e);
			errorMessage = geti18nMessage(GENERIC_ERROR);
			if (StringUtils.isNotBlank(e.getMessage())) {
				errorMessage += e.getMessage();
			}
		}
		return errorMessage;
	}

	private static String geti18nMessage(String code) {
		// ToDO: Use Locale to get the Localized message
		return code;
	}
}