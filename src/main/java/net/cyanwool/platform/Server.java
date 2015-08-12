//#ProjectQuadrant
package net.cyanwool.platform;

import net.cyanwool.platform.command.CommandManager;
import net.cyanwool.platform.command.ICommandSender;
import net.cyanwool.platform.entity.EntityManager;
import net.cyanwool.platform.io.IOManager;
import net.cyanwool.platform.lang.LanguageManager;
import net.cyanwool.platform.management.OperatorsManager;
import net.cyanwool.platform.management.PlayerManager;
import net.cyanwool.platform.management.WhitelistManager;
import net.cyanwool.platform.network.NetworkServer;
import net.cyanwool.platform.plugins.PluginManager;
import net.cyanwool.platform.scheduler.Scheduler;
import net.cyanwool.platform.utils.ILogger;
import net.cyanwool.platform.utils.Registry;
import net.cyanwool.platform.utils.ServerConfiguration;
import net.cyanwool.platform.world.WorldManager;

public interface Server {

	/**
	 * Название реализационого сервера
	 * 
	 * @return Название
	 */
	public String getModName();

	/**
	 * Версия Minecraft
	 * 
	 * @return Версия
	 */
	public String getMCVersion();

	/**
	 * Запуск сервера
	 */
	public void start();

	/**
	 * Отправить сообщение в глобальный чат (В том числе сервер).
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public void broadcastMessage(String string);

	/**
	 * Возвращает логгер
	 * 
	 * @return Логгер 
	 */
	public ILogger getLogger();
	
	/**
	 * 
	 * @param logger
	 */
	public void setLogger(ILogger logger);

	/**
	 * Менеджер белого списка
	 * 
	 * @return
	 */
	public WhitelistManager getWhitelistManager();

	/**
	 * Менеджер операторов
	 * 
	 * @return
	 */
	public OperatorsManager getOperatorsManager();

	/**
	 * Менеджер для создания класса игрока и его взаимнодействия. Например вход игрока на сервер.
	 * 
	 * @return
	 */
	public PlayerManager getPlayerManager();
	
	/**
	 * 
	 * @param manager
	 */
	public void setPlayerManager(PlayerManager manager);

	/**
	 * Сервер для обработки с пакетами.
	 * 
	 * @return
	 */
	public NetworkServer getNetworkServer();
	
	/**
	 * 
	 * @param netserver
	 */
	public void setNetworkServer(NetworkServer netserver);

	/**
	 * Менеджер для регистрации/удаления сущностей.
	 * 
	 * @return
	 */
	public EntityManager getEntityManager();
	
	/**
	 * 
	 * @param manager
	 */
	public void setEntityManager(EntityManager manager);

	/**
	 * Менеджер языковых пакетов
	 */
	public LanguageManager getLanguageManager();

	/**
	 * Выключить сервер с сообщением
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public void shutdown(String message);
	
	/**
	 * Экстренное выключение сервера
	 */
	public void shutdownNow();

	/**
	 * Регистратор блоков и предметов
	 */
	public Registry getRegistry();

	/**
	 * Менеджер для регистрации плагинов
	 */
	public PluginManager getPluginManager();

	/**
	 * Менеджер для регистрации/удаления команд
	 * 
	 * @return
	 */
	public CommandManager getCommandManager();

	/**
	 * Консоль
	 * 
	 * @return
	 */
	public ICommandSender getConsoleCommandSender();
	
	/**
	 * 
	 * @param sender
	 */
	public void setConsoleCommandSender(ICommandSender sender);

	/**
	 * Настройки сервера
	 */
	public ServerConfiguration getServerConfiguration();

	/**
	 * Менеджер для чтения/записи (Input/Output)
	 */
	public IOManager getIOManager();

	/**
	 * Менеджер для работ с мирами
	 */
	public WorldManager getWorldManager();
	
	/**
	 * 
	 * @param manager
	 */
	public void setWorldManager(WorldManager manager);

	/**
     * 
     */
	public Scheduler getScheduler();
	
	/**
	 * 
	 */
	public void setScheduler(Scheduler scheduler);
}
