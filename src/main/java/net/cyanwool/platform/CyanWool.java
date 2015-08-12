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

public class CyanWool {

	private static Server server;

	/**
	 * 
	 * Инициализация сервера
	 * 
	 * @param init
	 *            - Сервер
	 */
	public static void initServer(Server init) {
		if (getServer() != null) {
			server.getLogger().warn("Cannot redefine singleton Server");
			return;
		}
		server = init;
		getServer().getLogger().info("#====#_CyanWool_#====#");
		getServer().getLogger().info("Mod Name: " + getServer().getModName());
		getServer().getLogger().info("Host Address: " + getServer().getNetworkServer().getHostAddress());
		getServer().getLogger().info("Port: " + getServer().getNetworkServer().getPort());
		getServer().getLogger().info("Minecraft Version: " + getServer().getMCVersion());
		getServer().start();
	}

	/**
	 * Возвращает сервер
	 * 
	 * @return Сервер
	 */
	public static Server getServer() {
		return server;
	}

	/**
	 * 
	 * Название реализационого сервера
	 * 
	 * @return Название
	 */
	public static String getModName() {
		return getServer().getModName();
	}

	/**
	 * Версия Minecraft
	 * 
	 * @return Версия
	 */
	public static String getMCVersion() {
		return getServer().getMCVersion();
	}

	/**
	 * Возвращает логгер
	 * 
	 * @return Логгер
	 */
	public static ILogger getLogger() {
		return getServer().getLogger();
	}

	/**
	 * Менеджер белого списка
	 * 
	 * @return
	 */
	public static WhitelistManager getWhitelistManager() {
		return getServer().getWhitelistManager();
	}

	/**
	 * Менеджер операторов
	 * 
	 * @return
	 */
	public static OperatorsManager getOperatorsManager() {
		return getServer().getOperatorsManager();
	}

	/**
	 * Менеджер для создания класса игрока и его взаимнодействия. Например заход игрока на сервер.
	 * 
	 * @return
	 */
	public static PlayerManager getPlayerManager() {
		return getServer().getPlayerManager();
	}

	/**
	 * Сервер для обработки с пакетами.
	 * 
	 * @return
	 */
	public static NetworkServer getNetworkServer() {
		return getServer().getNetworkServer();
	}

	/**
	 * Менеджер для регистрации/удаления сущностей.
	 * 
	 * @return
	 */
	public static EntityManager getEntityManager() {
		return getServer().getEntityManager();
	}

	/**
	 * Отправить сообщение в глобальный чат (В том числе сервер).
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public static void broadcastMessage(String message) {
		getServer().broadcastMessage(message);
	}

	/**
	 * Выключить сервер с сообщением
	 * 
	 * @param message
	 *            - Сообщение
	 */
	public static void shutdown(String message) {
		getServer().shutdown(message);
	}

	/**
	 * Менеджер языковых пакетов
	 */
	public static LanguageManager getLanguageManager() {
		return getServer().getLanguageManager();
	}
	
	/**
	 * Регистратор блоков и предметов
	 */
	public static Registry getRegistry() {
		return getServer().getRegistry();
	}

	/**
	 * Менеджер для регистрации плагинов
	 */
	public static PluginManager getPluginManager() {
		return getServer().getPluginManager();
	}

	/**
	 * Менеджер для регистрации/удаления команд
	 * 
	 * @return
	 */
	public CommandManager getCommandManager() {
		return getServer().getCommandManager();
	}

	/**
	 * Консоль
	 * 
	 * @return
	 */
	public ICommandSender getConsoleCommandSender() {
		return getServer().getConsoleCommandSender();
	}

	/**
	 * Настройки сервера
	 */
	public ServerConfiguration getServerConfiguration() {
		return getServer().getServerConfiguration();
	}

	/**
	 * Менеджер для чтения/записи (Input/Output)
	 */
	public IOManager getIOManager() {
		return getServer().getIOManager();
	}

	/**
     * 
     */
	public Scheduler getScheduler() {
		return getServer().getScheduler();
	}
}
