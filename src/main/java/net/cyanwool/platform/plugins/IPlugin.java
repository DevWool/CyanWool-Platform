package net.cyanwool.platform.plugins;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.utils.ILogger;

public interface IPlugin {

	public IPluginDescription getDescription();

	public void init(IPluginDescription description);

	public void onEnable();

	public void onLoad();

	public void onDisable();

	public Server getServer();

	public boolean isEnabled();

	public void setEnabled(boolean flag);

	public ILogger getLogger();
}
