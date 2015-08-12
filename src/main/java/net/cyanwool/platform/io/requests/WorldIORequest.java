package net.cyanwool.platform.io.requests;

import net.cyanwool.platform.io.IORequest;
import net.cyanwool.platform.world.World;

public interface WorldIORequest extends IORequest {

	public void readWorld(String name);

	public void saveWorld(World world);

}
