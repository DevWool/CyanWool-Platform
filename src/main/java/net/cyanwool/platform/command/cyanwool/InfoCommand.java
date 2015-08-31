package net.cyanwool.platform.command.cyanwool;

import java.util.ArrayList;
import java.util.List;

import net.cyanwool.platform.CyanWool;
import net.cyanwool.platform.command.Command;
import net.cyanwool.platform.command.ICommandSender;
import net.cyanwool.platform.utils.ChatColor;

public class InfoCommand extends Command {

	public InfoCommand() {
		super("version", "About server", true);
	}

	@Override
	public void execute(ICommandSender sender, String[] args) {
		// ???
		List<String> list = new ArrayList<String>();
		list.add(ChatColor.GREEN + "#=====#_" + ChatColor.AQUA + "CyanWool" + ChatColor.GREEN + "#=====#");
		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.modname") + ": " + ChatColor.WHITE + CyanWool.getModName());
		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.mcversion") + ": " + ChatColor.WHITE + CyanWool.getMCVersion());

		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.maintainer") + ": " + ChatColor.WHITE + "BeYkeRYkt");

		for (String message : list) {
			sender.sendMessage(message);
		}
	}

}
