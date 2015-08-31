package net.cyanwool.platform.entity.controllers;

import net.cyanwool.platform.entity.Entity;
import net.cyanwool.platform.world.Position;

public interface EntityMoveController extends EntityController {

	public void moveEntity(double x, double y, double z);

	public void moveEntity(Position pos);

	public void moveEntity(Entity entity);
}
