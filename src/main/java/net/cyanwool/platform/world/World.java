package net.cyanwool.platform.world;

import java.util.List;

import net.cyanwool.platform.Server;
import net.cyanwool.platform.block.Block;
import net.cyanwool.platform.entity.BaseEntity;
import net.cyanwool.platform.material.blocks.BlockMaterial;
import net.cyanwool.platform.world.chunk.ChunkManager;
import net.cyanwool.platform.world.effect.Effect;
import net.cyanwool.platform.world.sounds.Sound;

public interface World {

	public Block getBlock(Position position);

	public Block getBlock(int x, int y, int z);

	public ChunkManager getChunkManager();

	public String getPath();

	public void setBlock(Position pos, int id, int data);

	public void setBlock(int x, int y, int z, int id, int data);

	public void setBlock(Position pos, BlockMaterial type);

	public void setBlock(int x, int y, int z, BlockMaterial type);

	public Position getSpawnPosition();

	public void setSpawnPosition(Position pos);

	public void playSoundAtEntity(BaseEntity baseEntity, String sound, float volume, float pitch);

	public void playSound(Position pos, String sound, float volume, float pitch);

	public void playSoundExpect(Position pos, String sound, float volume, float pitch, BaseEntity player);

	public void playSoundAtEntity(BaseEntity baseEntity, Sound sound, float volume, float pitch);

	public void playSound(Position pos, Sound sound, float volume, float pitch);

	public void playEffect(Position pos, Effect effect, int data);

	public void playSoundExpect(Position pos, Sound sound, float volume, float pitch, BaseEntity player);

	public void playEffectExpect(Position pos, Effect effect, int data, BaseEntity player);

	public void playParticle(Position pos, Particle particle, int amount, int data);

	public void playParticleExpect(Position pos, Particle particle, int amount, int data, BaseEntity player);

	public long getSeed();

	public long getTotalWorldTime();

	public long getWorldTime();

	public void setWorldTime(long time);

	public boolean isThundering();

	public void setThundering(boolean flag);

	public int getThunderTime();

	public void setThunderTime(int time);

	public boolean isRaining();

	public void setRaining(boolean rain);

	public int getRainTime();

	public void setRainTime(int time);

	public int getActualHeight();

	public List<BaseEntity> getEntities();

	public List<BaseEntity> getLivingEntities();

	public List<BaseEntity> getPlayers();

	public void onTick();

	public Difficulty getDifficulty();

	public void setDifficulty(Difficulty diff);

	public GameMode getDefaultGamemode();

	public void setDefaultGamemode(GameMode mode);

	public boolean isAutoSave();

	public void setAutoSave(boolean value);

	public Server getServer();

	public boolean isLoadedSpawnChunks();

	public void loadSpawnChunks();

	public boolean isHardcore();

	public void setHardcore(boolean flag);

	public String getName();
}
