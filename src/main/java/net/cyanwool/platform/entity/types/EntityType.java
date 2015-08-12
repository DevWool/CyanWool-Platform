package net.cyanwool.platform.entity.types;

import net.cyanwool.platform.entity.BaseEntity;
import net.cyanwool.platform.utils.DamageSource;

public interface EntityType {
	
	public String getName();
	
	public int getId();
	
	public BaseEntity getEntity();
	
	public boolean isPlayer();

	public void registerComponents();

	public void onTick();

	public void onDeathEntity(DamageSource source);

	public void onDeathEntityByEntity(BaseEntity killer);

	public void onDamageEntity(BaseEntity damager, float damage);

	public void onAttackEntity(BaseEntity target, float damage);

	public void onWalkingEntity();

	public void onInteractEntity(BaseEntity interacter);
	
	public void onEntitySpawn();
}
