package net.cyanwool.platform.entity.component.living;

import net.cyanwool.platform.entity.BaseEntity;
import net.cyanwool.platform.entity.component.Component;

public interface Target extends Component {

	public void setTarget(BaseEntity entity);

	public BaseEntity getTarget();

}
