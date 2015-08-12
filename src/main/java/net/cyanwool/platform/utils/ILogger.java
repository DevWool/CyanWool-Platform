package net.cyanwool.platform.utils;

public interface ILogger {
	
	//Basic.
	public void info(String string);
	
	public void warn(String string);
	
	public void error(String string);
	
	public void severe(String string);
	
	public void config(String paramString);

	public void fine(String paramString);

	public void finer(String paramString);

	public void finest(String paramString);

	public void error(String string, Exception ex);
}