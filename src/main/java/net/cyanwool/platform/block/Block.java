package net.cyanwool.platform.block;

import net.cyanwool.platform.material.blocks.BlockMaterial;
import net.cyanwool.platform.world.Position;
import net.cyanwool.platform.world.chunk.Chunk;

public interface Block {

	public Position getPosition();

	public Chunk getChunk();

	public void destroyBlock();

	public int getBlockLight();

	public void transformToFallingBlock();

	public void dropBlock();

	public void setBlock(BlockMaterial type);

	public BlockMaterial getBlockType();
}
