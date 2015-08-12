package net.cyanwool.platform.entity;

import java.util.Collection;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.entity.types.EntityType;
import net.cyanwool.platform.world.Position;

public interface EntityManager {

	public Collection<BaseEntity> getEntityAll();

	public BaseEntity getEntity(int id);

	public void trackEntity(BaseEntity baseEntity);

	public void untrackEntity(BaseEntity baseEntity);

	public void moveToOtherPosition(BaseEntity baseEntity, Position pos);
	
	public BaseEntity spawnEntity(EntityType type, Position pos);

	public BaseEntity spawnUnknownEntity(BaseEntity baseEntity, Position pos);
	
	public Server getServer();
}
