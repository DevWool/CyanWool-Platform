package net.cyanwool.platform.entity.component.living;

import net.cyanwool.platform.entity.component.Component;
import net.cyanwool.platform.inventory.Inventory;

public interface Inventorying extends Component {

	public Inventory getInventory();
}
