package net.cyanwool.platform.network;

import net.cyanwool.platform.entity.BaseEntity;
import net.cyanwool.platform.world.Position;

public interface NetworkServer {

	public net.cyanwool.platform.Server getServer();

	public Object getProtocolServer();

	public int getPort();

	public String getHostAddress();

	public void sendPacketForAll(Packet packet);

	public void sendPacketDistance(Position pos, Packet packet, int radius);

	public void sendPacketForAllExpect(Packet packet, BaseEntity expect);

	public void sendPacketDistanceExpect(Position pos, Packet packet, int radius, BaseEntity expect);

}
