package net.cyanwool.platform.commandV2;

import net.cyanwool.platform.Server;

public interface ICommandSender {

	public void sendMessage(String message);

	public Server getServer();

	public String getName();

	public boolean isPlayer();

	public String getLangCode();

	public void executeCommand(String commandName);
}