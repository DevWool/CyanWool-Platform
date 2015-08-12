package net.cyanwool.platform.entity.component.generic;

import net.cyanwool.platform.entity.BaseEntity;
import net.cyanwool.platform.entity.component.Component;
import net.cyanwool.platform.world.Position;

public interface Movement extends Component {

	public float getMovementSpeed();

	public void setMovementSpeed(float speed);

	public void moveEntity(double x, double y, double z);

	public void moveEntity(Position pos);

	public void moveEntity(BaseEntity baseEntity);
}
