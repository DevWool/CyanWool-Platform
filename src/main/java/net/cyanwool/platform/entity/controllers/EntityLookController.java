package net.cyanwool.platform.entity.controllers;

import net.cyanwool.platform.entity.Entity;
import net.cyanwool.platform.world.Position;

public interface EntityLookController extends EntityController {

	public void lookAt(double x, double y, double z);

	public void lookAt(Position pos);

	public void lookAtEntity(Entity entity);

}
