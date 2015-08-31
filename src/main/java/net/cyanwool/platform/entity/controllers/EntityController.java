package net.cyanwool.platform.entity.controllers;

import net.cyanwool.platform.entity.Entity;

public interface EntityController {

	public String getName();

	public boolean isEnabled();

	public void setEnabled(boolean flag);

	public boolean needUpdate();

	public void setUpdate();

	public void onUpdate();

	public Entity getEntity();

}
