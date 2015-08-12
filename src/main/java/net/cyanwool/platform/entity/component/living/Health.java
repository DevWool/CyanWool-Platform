package net.cyanwool.platform.entity.component.living;

import net.cyanwool.platform.entity.BaseEntity;
import net.cyanwool.platform.entity.component.Component;
import net.cyanwool.platform.utils.DamageSource;

public interface Health extends Component {

	public double getHealth();

	public void setHealth(double health);

	public double getMaxHealth();

	public void setMaxHealth(double maxHealth);

	public void damage(float amount, DamageSource source);

	public void damage(float amount, DamageSource source, BaseEntity damager);

	public void kill();

	public void kill(DamageSource source);

	public void kill(BaseEntity baseEntity);
}
