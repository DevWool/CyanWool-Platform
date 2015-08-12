package net.cyanwool.platform.entity.component.generic;

import net.cyanwool.platform.entity.component.Component;

public interface Combust extends Component {

	public boolean canCombust();

	public void setCombust(boolean flag);

}
