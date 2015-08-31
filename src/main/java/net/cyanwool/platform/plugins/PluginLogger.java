package net.cyanwool.platform.plugins;

import net.cyanwool.platform.utils.ILogger;

public class PluginLogger implements ILogger {

	private IPlugin plugin;

	public PluginLogger(IPlugin plugin) {
		this.plugin = plugin;
	}

	public IPlugin getPlugin() {
		return plugin;
	}

	@Override
	public void info(String string) {
		getPlugin().getServer().getLogger().info("[" + getPlugin().getDescription().getName() + "] " + string);
	}

	@Override
	public void warn(String string) {
		getPlugin().getServer().getLogger().warn("[" + getPlugin().getDescription().getName() + "] " + string);
	}

	@Override
	public void error(String string) {
		getPlugin().getServer().getLogger().error("[" + getPlugin().getDescription().getName() + "] " + string);
	}

	@Override
	public void severe(String string) {
		getPlugin().getServer().getLogger().severe("[" + getPlugin().getDescription().getName() + "] " + string);
	}

	@Override
	public void config(String paramString) {
		getPlugin().getServer().getLogger().config("[" + getPlugin().getDescription().getName() + "] " + paramString);
	}

	@Override
	public void fine(String paramString) {
		getPlugin().getServer().getLogger().fine("[" + getPlugin().getDescription().getName() + "] " + paramString);
	}

	@Override
	public void finer(String paramString) {
		getPlugin().getServer().getLogger().finer("[" + getPlugin().getDescription().getName() + "] " + paramString);
	}

	@Override
	public void finest(String paramString) {
		getPlugin().getServer().getLogger().finest("[" + getPlugin().getDescription().getName() + "] " + paramString);
	}

	@Override
	public void error(String string, Exception ex) {
		getPlugin().getServer().getLogger().error("[" + getPlugin().getDescription().getName() + "] " + string, ex);
	}

}
