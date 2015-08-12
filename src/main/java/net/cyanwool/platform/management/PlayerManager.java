package net.cyanwool.platform.management;

import java.util.List;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.entity.BaseEntity;
import net.cyanwool.platform.world.World;

public interface PlayerManager {

	public Server getServer();

	// public void joinPlayer(GameProfile info);

	public void spawnPlayer(BaseEntity player);

	// public void refreshPlayer(Player player, PlayerListEntryAction action);

	public void leavePlayer(BaseEntity player);

	public List<BaseEntity> getPlayers();

	public void sendMessageForAll(String message);

	public void sendMessageForAll(World world, String message);

	public BaseEntity getPlayer(String name);
}
