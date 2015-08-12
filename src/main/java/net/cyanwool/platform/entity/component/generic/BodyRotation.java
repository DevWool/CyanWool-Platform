package net.cyanwool.platform.entity.component.generic;

import net.cyanwool.platform.entity.component.Component;
import net.cyanwool.platform.utils.Rotation;

public interface BodyRotation extends Component {

	public Rotation getBodyRotation();

	public void setBodyRotation(Rotation rotation);
}
