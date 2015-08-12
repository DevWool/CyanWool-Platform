package net.cyanwool.platform.entityOld;

import java.util.Collection;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.world.Position;

public interface EntityManager {

	public Collection<Entity> getAll();

	public Entity getEntity(int id);

	public void registerEntity(Entity entity);

	public void unregisterEntity(Entity entity);

	public void moveToOtherPosition(Entity entity, Position pos);

	public Server getServer();
}
