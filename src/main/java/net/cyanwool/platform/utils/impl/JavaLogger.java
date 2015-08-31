package net.cyanwool.platform.utils.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.cyanwool.platform.CyanWool;
import net.cyanwool.platform.utils.ILogger;

public class JavaLogger implements ILogger {

	private Logger logger;

	public JavaLogger() {
		this.logger = Logger.getLogger(CyanWool.class.getName());
	}

	@Override
	public void info(String string) {
		logger.info(string);
	}

	@Override
	public void warn(String string) {
		logger.warning(string);
	}

	@Override
	public void error(String string) {
		logger.severe(string);
	}

	@Override
	public void severe(String string) {
		logger.severe(string);
	}

	@Override
	public void config(String paramString) {
		logger.config(paramString);
	}

	@Override
	public void fine(String paramString) {
		logger.fine(paramString);
	}

	@Override
	public void finer(String paramString) {
		logger.finer(paramString);
	}

	@Override
	public void finest(String paramString) {
		logger.finest(paramString);
	}

	@Override
	public void error(String string, Exception ex) {
		logger.log(Level.SEVERE, string, ex);
	}

}
