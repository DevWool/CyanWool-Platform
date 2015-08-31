package net.cyanwool.platform.commandV2;

import java.util.List;

public interface ICommand {

	public enum CommandAccess {

		NONE(0), PLAYER(1), CONSOLE(2), COMMAND_BLOCK(3), ALL(4);

		int id;

		CommandAccess(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}

		public void getById(int id) {
			// TODO:
		}
	}

	public void execute(ICommandSender sender, String[] args);

	public String getName();

	public String getDescription();

	public CommandAccess getCommandAccess();

	public List<String> getAliases();
}
