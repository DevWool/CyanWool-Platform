package net.cyanwool.platform.entityOld.alive.player;

import net.cyanwool.platform.entityOld.EntityLivingBase;
import net.cyanwool.platform.world.GameMode;
import net.cyanwool.platform.world.Position;

public interface Human extends EntityLivingBase {

	public String getName();

	public boolean isSleeping();

	public boolean isBlocking();

	public void sleepInBedAt(int x, int y, int z);

	public void sleepInBedAt(Position pos);

	public void wakeUp();

	public void closeInventory();

	public boolean isDisableDamage();

	public void setDisableDamage(boolean flag);

	public boolean isFlying();

	public void setFlying(boolean flag);

	public boolean isAllowFlying();

	public void setAllowFlying(boolean flag);

	public float getFlySpeed();

	public void setFlySpeed(float speed);

	public float getWalkSpeed();

	public void setWalkSpeed(float speed);

	public boolean canBuild();

	public void setBuild(boolean flag);

	public int getSleepingTicks();

	public void setSleepingTicks(int ticks);

	public GameMode getGameMode();

	public void setGameMode(GameMode gamemode);
}
