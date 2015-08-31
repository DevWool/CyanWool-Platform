package net.cyanwool.platform.plugins.impl;

import net.cyanwool.platform.CyanWool;
import net.cyanwool.platform.Server;
import net.cyanwool.platform.plugins.IPlugin;
import net.cyanwool.platform.plugins.IPluginDescription;
import net.cyanwool.platform.plugins.PluginLogger;
import net.cyanwool.platform.utils.ILogger;

public class Plugin implements IPlugin {

	private IPluginDescription description;
	private boolean enabled;
	private ILogger logger;

	public void onEnable() {
	}

	public void onLoad() {
	}

	public void onDisable() {
	}

	public Server getServer() {
		return CyanWool.getServer();
	}

	public ILogger getLogger() {
		return logger;
	}

	public IPluginDescription getDescription() {
		return description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	public void init(IPluginDescription description) {
		this.description = description;
		this.logger = new PluginLogger(this);
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public void setEnabled(boolean flag) {
		if (flag) {
			if (!isEnabled()) {
				getLogger().info("Enabling " + getDescription().getName() + " " + getDescription().getVersion() + " by " + getDescription().getDevelopers());
				for (String sDepend : getDescription().getDependPlugins()) {
					IPlugin depend = getServer().getPluginManager().getPlugin(sDepend);
					if (depend == null) {
						getLogger().info("Revert load plugin: Invalid depend " + sDepend);
						return;
					}
					depend.setEnabled(true);
				}
				onEnable();
				this.enabled = flag;
			}
		} else {
			if (isEnabled()) {
				getLogger().info("Disabling " + getDescription().getName() + " " + getDescription().getVersion() + " by " + getDescription().getDevelopers());
				onDisable();
				this.enabled = flag;
			}
		}
	}

}
