package net.cyanwool.platform.io;

import net.cyanwool.platform.world.World;
import net.cyanwool.platform.world.chunk.Chunk;

public interface IOManager {

	public Chunk readChunk(int x, int z);

	public void saveChunk(Chunk chunk);

	public World readWorld(String name);

	public void saveWorld(World world);

	public void addIORequest(IORequest request);

	public void initIOTask();

	public void shutdownIOTask();

	public boolean isRunning();

	// todo

}
