package net.cyanwool.platform.network;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.entity.BaseEntity;

public interface PlayerNetwork {

	public BaseEntity getPlayer();

	public void sendPacket(Packet packet);

	// public void addListener(SessionListener listener);

	// public void removeListener(SessionListener listener);

	public void disconnect(String reason);

	public String getHost();

	public Server getServer();
}
