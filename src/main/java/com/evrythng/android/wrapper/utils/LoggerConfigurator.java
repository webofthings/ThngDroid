/*
 * (c) Copyright 2012 EVRYTHNG Ltd London / Zurich
 * www.evrythng.com
 * 
 */
package com.evrythng.android.wrapper.utils;

import de.mindpipe.android.logging.log4j.LogConfigurator;
import org.apache.log4j.Level;

/**
 *
 * TODO Comment this class
 *
 * @author Dominique Guinard (domguinard)
 * @copyright 2012 Evrythng Ltd London / Zurich
 *
 */
public class LoggerConfigurator {

	/**
	 * Call {@link #configure()}} from your application's activity.
	 */
	public static void configure() {
		final LogConfigurator logConfigurator = new LogConfigurator();
		logConfigurator.setRootLevel(Level.DEBUG);
		logConfigurator.setUseLogCatAppender(true);
		logConfigurator.configure();
	}
}
