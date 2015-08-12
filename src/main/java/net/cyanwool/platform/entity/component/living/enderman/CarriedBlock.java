package net.cyanwool.platform.entity.component.living.enderman;

import net.cyanwool.platform.entity.component.Component;
import net.cyanwool.platform.material.Material;

public interface CarriedBlock extends Component {

	public Material getMaterial();

	public void setMaterial(Material material);

}
