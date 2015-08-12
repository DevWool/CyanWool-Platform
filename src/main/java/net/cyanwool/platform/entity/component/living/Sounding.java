package net.cyanwool.platform.entity.component.living;

import net.cyanwool.platform.entity.component.Component;
import net.cyanwool.platform.world.sounds.Sound;

public interface Sounding extends Component {

	public Sound getDamageSound();

	public Sound getTalkSound();

	public Sound getDeathSound();

	public void setDeathSound(Sound sound);

	public void setDamageSound(Sound sound);

	public void setTalkSound(Sound sound);

	public boolean playDamageSound();

	public boolean playTalkSound();

	public boolean playDeathSound();

}
