package net.cyanwool.platform.entity.component.generic;

import net.cyanwool.platform.entity.component.Component;

public interface FireTicks extends Component {

	public boolean isBurned();

	public int getFireTicks();

	public void setFireTicks(int ticks);
}
