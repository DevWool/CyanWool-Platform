package net.cyanwool.platform.command.cyanwool;

import net.cyanwool.platform.command.Command;
import net.cyanwool.platform.command.ICommandSender;

public class ShutdownCommand extends Command {

	public ShutdownCommand() {
		super("stop", "Shutdown command server!", true);
	}

	@Override
	public void execute(ICommandSender sender, String[] args) {
		// Maybe...
		String message = "Server shutdown!";
		if (args[0] != null) {
			message = args[0];
		}
		sender.getServer().shutdown(message);
	}

}
