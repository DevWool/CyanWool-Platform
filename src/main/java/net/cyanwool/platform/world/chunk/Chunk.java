package net.cyanwool.platform.world.chunk;

import java.util.List;

import net.cyanwool.platform.block.Block;
import net.cyanwool.platform.entity.Entity;
import net.cyanwool.platform.material.blocks.BlockMaterial;
import net.cyanwool.platform.world.LightType;
import net.cyanwool.platform.world.Position;
import net.cyanwool.platform.world.World;

public interface Chunk {

	public int getX();

	public int getZ();

	public int getMaxHeight(int x, int z);

	public int getMaxHeight(Position pos);

	public void generateSkylightMap();

	public void relightBlock(int x, int y, int z);

	public void relightBlock(Position pos);

	// public void getBlockLight(int x, int y, int z);

	// public void getBlockLight(Position pos);

	public Block getBlock(int x, int y, int z);

	public Block getBlock(Position pos);

	public void setBlock(int x, int y, int z, BlockMaterial type);

	public void setBlock(Position pos, BlockMaterial type);

	public int getLightLevel(int x, int y, int z);

	public int getLightLevel(Position pos);

	public void setLightLevel(LightType type, int x, int y, int z, int level);

	public void setLightLevel(LightType type, Position pos, int level);

	public List<Entity> getEntities();

	public boolean canSeeSky(Position pos);

	public void onChunkLoad();

	public void onChunkUnload();

	public void setNeedUpdate();

	public boolean isNeedUpdate();

	public boolean isLoaded();

	public World getWorld();
}
