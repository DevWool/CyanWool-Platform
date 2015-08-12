package net.cyanwool.platform.entity.component;

import net.cyanwool.platform.entity.BaseEntity;

public interface Component {

	public void initialization();

	public void update();

	public boolean autoUpdate();

	public BaseEntity getEntity();

	public String getID();
}
