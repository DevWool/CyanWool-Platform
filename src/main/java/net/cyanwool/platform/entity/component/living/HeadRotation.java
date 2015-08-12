package net.cyanwool.platform.entity.component.living;

import net.cyanwool.platform.entity.component.Component;
import net.cyanwool.platform.utils.Rotation;
import net.cyanwool.platform.world.Position;

public interface HeadRotation extends Component {

	public Rotation getHeadRotation();

	public void setHeadRotation(Rotation rotation);

	public Position getEyePosition();

	public float getEyeHeight();
}
