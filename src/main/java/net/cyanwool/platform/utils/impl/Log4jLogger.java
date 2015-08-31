package net.cyanwool.platform.utils.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.cyanwool.platform.utils.ILogger;

public class Log4jLogger implements ILogger {

	private Logger logger;

	public Log4jLogger() {
		this.logger = LogManager.getLogger("CyanWool");
	}

	@Override
	public void info(String string) {
		logger.info(string);
	}

	@Override
	public void warn(String string) {
		logger.warn(string);
	}

	@Override
	public void error(String string) {
		logger.error(string);
	}

	@Override
	public void severe(String string) {
		logger.error(string);
	}

	@Override
	public void config(String paramString) {
		logger.info(paramString);
	}

	@Override
	public void fine(String paramString) {
		logger.info(paramString);
	}

	@Override
	public void finer(String paramString) {
		logger.info(paramString);
	}

	@Override
	public void finest(String paramString) {
		logger.info(paramString);
	}

	@Override
	public void error(String string, Exception ex) {
		logger.error(string, ex);
	}

}
