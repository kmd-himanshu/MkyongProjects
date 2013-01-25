package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Slf4jSample {
	public static void main(final String[] args) {
		final Logger logger = LoggerFactory.getLogger(Slf4jSample.class);

		logger.info("INFO message!");
		logger.debug("DEBUG message!");
		logger.warn("WARN message!");
		logger.trace("TRACE message!");
		logger.error("ERROR message!");

	}

	private Slf4jSample() {

	}

}
