package net.cyanwool.platform.material.items;

import net.cyanwool.platform.block.Block;
import net.cyanwool.platform.entity.Entity;
import net.cyanwool.platform.entity.alive.player.Player;
import net.cyanwool.platform.inventory.item.ItemStack;
import net.cyanwool.platform.material.Material;
import net.cyanwool.platform.utils.BlockSide;
import net.cyanwool.platform.world.Position;
import net.cyanwool.platform.world.World;

public class ItemMaterial extends Material {

	private int maxStackSize;
	private int maxAttackDamage;

	public ItemMaterial(Material material) {
		super(material);
	}

	public ItemMaterial(String StringId, int Id) {
		super(StringId, Id, 0);
	}

	public ItemMaterial(String StringId, int Id, int metadata) {
		super(StringId, Id, metadata, 0);
	}

	public ItemMaterial(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
	}

	public void setMaxStackSize(int max) {
		maxStackSize = max;
	}

	public int getMaxStackSize() {
		return maxStackSize;
	}

	public int getMaxAttackDamage() {
		return maxAttackDamage;
	}

	public void setMaxAttackDamage(int max) {
		maxAttackDamage = max;
	}

	public boolean onItemUse(ItemStack stack, Player player, World world, Position pos, BlockSide side) {
		return true;
	}

	public boolean onItemRightClick(ItemStack itemStackIn, World worldIn, Player playerIn) {
		return true;
	}

	public boolean onItemLeftClick(ItemStack itemStackIn, World worldIn, Player playerIn) {
		return true;
	}

	public boolean onItemUseFinish(ItemStack stack, World worldIn, Player playerIn) {
		return true;
	}

	public boolean onHitEntity(ItemStack stack, Entity target, Player attacker) {
		return true;
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, Position pos, Player playerIn) {
		return true;
	}

	public void onCreatedItem(ItemStack stack, World worldIn, Player playerIn) {
	}

	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, Player playerIn, int timeLeft) {
	}
}
