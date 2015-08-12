package net.cyanwool.platform.entity.component.generic;

import net.cyanwool.platform.entity.BaseEntity;
import net.cyanwool.platform.entity.component.Component;

public interface Transport extends Component {

	public void setPassenger(BaseEntity baseEntity);

	public BaseEntity getPassenger();

	public BaseEntity getVehicle();

}
