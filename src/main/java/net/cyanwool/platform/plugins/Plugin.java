package net.cyanwool.platform.plugins;

import java.io.File;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.utils.ILogger;

public interface Plugin {

	public String getName();

	public PluginDescription getDescription();

	public void onEnable();

	public void onLoad();

	public void onDisable();

	public boolean isEnabled();

	public void setEnabled(boolean flag);

	public Object getConfig();

	public void saveConfig();

	public void reloadConfig();

	public File getDataFolder();

	public Server getServer();

	public ILogger getLogger();
}
