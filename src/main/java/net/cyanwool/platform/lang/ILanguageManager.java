package net.cyanwool.platform.lang;

import java.util.Collection;

import net.cyanwool.platform.Server;

public interface ILanguageManager {

	public void registerLanguageFile(ILanguageFile file);

	public void removeLanguageFile(String localeCode);

	public boolean hasAvailableLanguage(String localeCode);

	public void loadAllLanguages();

	public void refreshLanguages();

	public Collection<ILanguageFile> getLanguages();

	public ILanguageFile getLanguageFile(String localeCode);

	public Server getServer();
}
