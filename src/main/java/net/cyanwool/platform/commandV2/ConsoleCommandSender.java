package net.cyanwool.platform.commandV2;

import net.cyanwool.platform.CyanWool;
import net.cyanwool.platform.Server;
import net.cyanwool.platform.utils.ChatColor;

public class ConsoleCommandSender implements ICommandSender {

	@Override
	public void sendMessage(String message) {
		String mess = ChatColor.stripColor(message);
		getServer().getLogger().info(mess);
	}

	@Override
	public Server getServer() {
		return CyanWool.getServer();
	}

	@Override
	public String getName() {
		return "Console";
	}

	@Override
	public boolean isPlayer() {
		return false;
	}

	@Override
	public String getLangCode() {
		return "en_US";
	}

	@Override
	public void executeCommand(String commandName) {
		getServer().getCommandManager().dispatchCommand(this, commandName);
	}
}
