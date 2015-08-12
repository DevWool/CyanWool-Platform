package net.cyanwool.platform.entity;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.command.ICommandSender;
import net.cyanwool.platform.entity.component.ComponentManager;
import net.cyanwool.platform.entity.types.EntityType;
import net.cyanwool.platform.world.Position;
import net.cyanwool.platform.world.World;
import net.cyanwool.platform.world.chunk.Chunk;

public interface BaseEntity extends ICommandSender {

	public Position getPosition();

	public void teleport(Position pos);

	public int getEntityID();

	public void setEntityID(int id);

	public World getWorld();

	public boolean isAlive();

	public boolean isInvisible();

	public boolean onGround();

	public void destroy();

	public void onTick();

	public void setInvisible(boolean flag);

	public EntityType getEntityType();
	
	public void setEntityType(EntityType type);

	public Chunk getChunk();

	public boolean canSeeEntity(BaseEntity baseEntity);

	public boolean canSeePosition(Position pos);

	public boolean canSeeChunk(Chunk chunk);

	@Override
	public Server getServer();

	public ComponentManager getComponentManager();
}
