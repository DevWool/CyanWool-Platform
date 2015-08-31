package net.cyanwool.platform.network;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.entity.alive.player.Player;

public interface PlayerNetwork {

	public Player getPlayer();

	public void sendPacket(Packet packet);

	// public void addListener(SessionListener listener);

	// public void removeListener(SessionListener listener);

	public void disconnect(String reason);

	public String getHost();

	public Server getServer();
}
