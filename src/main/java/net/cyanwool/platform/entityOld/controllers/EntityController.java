package net.cyanwool.platform.entityOld.controllers;

import net.cyanwool.platform.entityOld.Entity;

public interface EntityController {

	public String getName();

	public boolean isEnabled();

	public void setEnabled(boolean flag);

	public boolean needUpdate();

	public void setUpdate();

	public void onUpdate();

	public Entity getEntity();

}
