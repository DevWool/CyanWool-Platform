package net.cyanwool.platform.material.texture;

import net.cyanwool.platform.material.Material;

public interface ITextured {

	public Material setTextureIndex(int index);

	public int getTextureIndex();

	public Material setTexture(IMaterialTextures textures);
}
