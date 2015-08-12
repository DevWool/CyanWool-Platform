package net.cyanwool.platform.io.requests;

import net.cyanwool.platform.io.IORequest;
import net.cyanwool.platform.world.chunk.Chunk;

public interface ChunkIORequest extends IORequest {

	public void readChunk(int x, int z);

	public void saveChunk(Chunk chunk);

}
