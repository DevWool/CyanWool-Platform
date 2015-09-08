package net.cyanwool.platform.command;

import net.cyanwool.platform.Server;

public interface ICommandManager {

	public boolean registerCommand(ICommand command);

	public boolean unregisterCommand(String Command);

	public boolean availableCommand(String command);

	public void dispatchCommand(ICommandSender sender, String rawMessage);

	public Server getServer();
}
