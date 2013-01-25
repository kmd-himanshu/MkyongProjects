/**
 *  
 */
package org.impetus.TCMS.common.logging;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.LoggingEvent;

public class TCMSLogger extends Logger {

	private Logger logger = null;

	private TCMSLogger(Class className) {
		super(className.getName());
		logger = Logger.getLogger(className);
	}

	public static TCMSLogger getLogger(Class className) {
		TCMSLogger actevaLogger = new TCMSLogger(className);
		return actevaLogger;
	}

	@Override
	/**
	 * log4j override method 
	 */
	public synchronized void addAppender(Appender arg0) {
		logger.addAppender(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void assertLog(boolean arg0, String arg1) {
		logger.assertLog(arg0, arg1);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void callAppenders(LoggingEvent arg0) {
		logger.callAppenders(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void debug(Object arg0, Throwable arg1) {
		if (logger.isDebugEnabled())
			logger.debug(arg0, arg1);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void debug(Object arg0) {
		if (logger.isDebugEnabled())
			logger.debug(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void error(Object arg0, Throwable arg1) {
		if (logger.isDebugEnabled())
			logger.error(arg0, arg1);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void error(Object arg0) {
		logger.error(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void fatal(Object arg0, Throwable arg1) {
		logger.fatal(arg0, arg1);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void fatal(Object arg0) {
		logger.fatal(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	protected void forcedLog(String arg0, Priority arg1, Object arg2,
			Throwable arg3) {
		super.forcedLog(arg0, arg1, arg2, arg3);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public boolean getAdditivity() {
		return logger.getAdditivity();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public synchronized Enumeration getAllAppenders() {
		return logger.getAllAppenders();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public synchronized Appender getAppender(String arg0) {
		return logger.getAppender(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public Priority getChainedPriority() {
		return logger.getChainedPriority();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public Level getEffectiveLevel() {
		return logger.getEffectiveLevel();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public LoggerRepository getHierarchy() {
		return logger.getHierarchy();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public LoggerRepository getLoggerRepository() {
		return logger.getLoggerRepository();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public ResourceBundle getResourceBundle() {
		return logger.getResourceBundle();
	}

	@Override
	/**
	 * log4j override method 
	 */
	protected String getResourceBundleString(String arg0) {
		return super.getResourceBundleString(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void info(Object arg0, Throwable arg1) {
		logger.info(arg0, arg1);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void info(Object arg0) {
		logger.info(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public boolean isAttached(Appender arg0) {
		return logger.isAttached(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public boolean isEnabledFor(Priority arg0) {
		return logger.isEnabledFor(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void l7dlog(Priority arg0, String arg1, Object[] arg2, Throwable arg3) {
		logger.l7dlog(arg0, arg1, arg2, arg3);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void l7dlog(Priority arg0, String arg1, Throwable arg2) {
		logger.l7dlog(arg0, arg1, arg2);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void log(Priority arg0, Object arg1, Throwable arg2) {
		logger.log(arg0, arg1, arg2);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void log(Priority arg0, Object arg1) {
		logger.log(arg0, arg1);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void log(String arg0, Priority arg1, Object arg2, Throwable arg3) {
		logger.log(arg0, arg1, arg2, arg3);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public synchronized void removeAllAppenders() {
		logger.removeAllAppenders();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public synchronized void removeAppender(Appender arg0) {
		logger.removeAppender(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public synchronized void removeAppender(String arg0) {
		logger.removeAppender(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void setAdditivity(boolean arg0) {
		logger.setAdditivity(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void setLevel(Level arg0) {
		logger.setLevel(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void setPriority(Priority arg0) {
		logger.setPriority(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void setResourceBundle(ResourceBundle arg0) {
		logger.setResourceBundle(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void warn(Object arg0, Throwable arg1) {
		logger.warn(arg0, arg1);
	}

	@Override
	/**
	 * log4j override method 
	 */
	public void warn(Object arg0) {
		logger.warn(arg0);
	}

	@Override
	/**
	 * log4j override method 
	 */
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public boolean equals(Object obj) {
		return logger.equals(obj);
	}

	@Override
	/**
	 * log4j override method 
	 */
	protected void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public int hashCode() {
		return logger.hashCode();
	}

	@Override
	/**
	 * log4j override method 
	 */
	public String toString() {
		return logger.toString();
	}
}