package net.cyanwool.platform.entityOld.controllers;

import net.cyanwool.platform.entityOld.Entity;
import net.cyanwool.platform.world.Position;

public interface EntityLookController extends EntityController {

	public void lookAt(double x, double y, double z);

	public void lookAt(Position pos);

	public void lookAtEntity(Entity entity);

}
