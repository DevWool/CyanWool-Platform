package net.cyanwool.platform.entity.component.generic;

import net.cyanwool.platform.entity.component.Component;

public interface LivingTicks extends Component {

	public int getLivedTicks();

	public void setLivedTicks(int ticks);

}
