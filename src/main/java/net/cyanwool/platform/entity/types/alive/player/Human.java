package net.cyanwool.platform.entity.types.alive.player;

import net.cyanwool.platform.entity.types.EntityType;
import net.cyanwool.platform.world.GameMode;

public interface Human extends EntityType {
	
	public String getPlayerName();

	public GameMode getGameMode();

	public void setGameMode(GameMode gamemode);

	public boolean isOnline();

	public boolean isOp();

	public void setOp(boolean flag);

	public boolean isBanned();

	public void setBanned(boolean banned);

	public boolean isWhitelisted();

	public void setWhitelisted(boolean whitelisted);
	
}