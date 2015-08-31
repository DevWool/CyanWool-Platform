package net.cyanwool.platform;

import net.cyanwool.platform.utils.impl.Log4jLogger;

public class Starter {

	public static void main(String[] args) {
		Server server = new SimpleServer();
		server.setLogger(new Log4jLogger());
		CyanWool.initServer(server);
	}
}
