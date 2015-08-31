package net.cyanwool.platform.commandV2;

public interface ICommandManager {

	public boolean registerCommand(ICommand command);

	public boolean unregisterCommand(String Command);

	public void dispatchCommand(ICommandSender sender, String rawMessage);
}
