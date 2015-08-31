package net.cyanwool.platform.plugins;

public interface IPluginLoader {

	public IPluginDescription loadPlugin(String pluginPath) throws InvalidPluginException;

	public Class<?> loadClass(String name) throws ClassNotFoundException;
}
