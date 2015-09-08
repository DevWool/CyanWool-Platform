package net.cyanwool.platform;

import java.io.IOException;

import net.cyanwool.platform.command.ICommandManager;
import net.cyanwool.platform.command.ConsoleCommandSender;
import net.cyanwool.platform.command.ICommandSender;
import net.cyanwool.platform.command.SimpleCommandManager;
import net.cyanwool.platform.entity.EntityManager;
import net.cyanwool.platform.io.IOManager;
import net.cyanwool.platform.lang.ILanguageManager;
import net.cyanwool.platform.lang.impl.CWLanguageManager;
import net.cyanwool.platform.management.OperatorsManager;
import net.cyanwool.platform.management.PlayerManager;
import net.cyanwool.platform.management.WhitelistManager;
import net.cyanwool.platform.network.NetworkServer;
import net.cyanwool.platform.plugins.IPluginManager;
import net.cyanwool.platform.plugins.impl.PluginManager;
import net.cyanwool.platform.scheduler.Scheduler;
import net.cyanwool.platform.scheduler.tasks.ConsoleTask;
import net.cyanwool.platform.utils.ILogger;
import net.cyanwool.platform.utils.Registry;
import net.cyanwool.platform.utils.ServerConfiguration;
import net.cyanwool.platform.utils.impl.SimpleServerConfiguration;
import net.cyanwool.platform.world.WorldManager;

public class SimpleServer implements Server {

	private String MOD_NAME = "CyanWool";
	private String MC_VERSION = "1.8";
	private ILogger logger;
	private WhitelistManager whitelist;
	private OperatorsManager operators;
	private PlayerManager playerManager;
	private NetworkServer netServer;
	private EntityManager entityManager;
	private ILanguageManager languageManager;
	private Registry registry;
	private IPluginManager pluginManager;
	private ICommandManager commandManager;
	private ICommandSender consoleSender;
	private ServerConfiguration serverConf;
	private WorldManager worldManager;
	private Scheduler scheduler;

	@Override
	public String getModName() {
		return MOD_NAME;
	}

	@Override
	public String getMCVersion() {
		return MC_VERSION;
	}

	@Override
	public void start() {
		if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
			getLogger().warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar <server_name>.jar\"");
			return;
		}

		// Init stock values
		setConsoleCommandSender(new ConsoleCommandSender());
		commandManager = new SimpleCommandManager(this);

		SimpleServerConfiguration config = new SimpleServerConfiguration("server.yml");
		config.createFile();
		this.serverConf = config;
		getServerConfiguration().loadFromFile();
		initPluginManager();

		if (!getServerConfiguration().isOnlineMode()) {
			getLogger().warn("The server is running in offline mode! Only do this if you know what you're doing.");
		}

		getLanguageManager().loadAllLanguages();
		getPluginManager().loadPlugins();

		if (!getServerConfiguration().isDeveloperMode()) {
			checkManagers();
		}
		getScheduler().runTaskRepeat(new ConsoleTask(this), 0, 1);
		getPluginManager().enablePlugins();

		getLogger().info("Done! ");
	}

	private void initPluginManager() {
		try {
			this.pluginManager = new PluginManager(this, "plugins");
			this.languageManager = new CWLanguageManager(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void checkManagers() {
		boolean shutdown = false;
		if (getPlayerManager() == null) {
			getLogger().info("PlayerManager is null!");
			shutdown = true;
		}

		if (getNetworkServer() == null) {
			getLogger().info("NetworkServer is null!");
			shutdown = true;
		}

		if (getEntityManager() == null) {
			getLogger().info("EntityManager is null!");
			shutdown = true;
		}

		if (getWorldManager() == null) {
			getLogger().info("WorldManager is null!");
			shutdown = true;
		}

		if (getScheduler() == null) {
			getLogger().info("Scheduler is null!");
			shutdown = true;
		}

		if (shutdown) {
			shutdownNow();
		}
	}

	@Override
	public void broadcastMessage(String string) {
		getConsoleCommandSender().sendMessage(string);
		getPlayerManager().sendMessageForAll(string);
	}

	@Override
	public ILogger getLogger() {
		return logger;
	}

	@Override
	public void setLogger(ILogger logger) {
		if (logger == null)
			return;
		this.logger = logger;
	}

	@Override
	public WhitelistManager getWhitelistManager() {
		return whitelist;
	}

	@Override
	public OperatorsManager getOperatorsManager() {
		return operators;
	}

	@Override
	public PlayerManager getPlayerManager() {
		return playerManager;
	}

	@Override
	public void setPlayerManager(PlayerManager manager) {
		this.playerManager = manager;
	}

	@Override
	public NetworkServer getNetworkServer() {
		return netServer;
	}

	@Override
	public void setNetworkServer(NetworkServer netserver) {
		this.netServer = netserver;
	}

	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void setEntityManager(EntityManager manager) {
		this.entityManager = manager;
	}

	@Override
	public ILanguageManager getLanguageManager() {
		return languageManager;
	}

	@Override
	public void shutdown(String message) {
		getLogger().info("Server shutdown!");
	}

	@Override
	public void shutdownNow() {
		getLogger().info("Server shutdown NOW!");
		System.exit(1);
	}

	@Override
	public Registry getRegistry() {
		return registry;
	}

	@Override
	public IPluginManager getPluginManager() {
		return pluginManager;
	}

	@Override
	public ICommandManager getCommandManager() {
		return commandManager;
	}

	@Override
	public ICommandSender getConsoleCommandSender() {
		return consoleSender;
	}

	@Override
	public void setConsoleCommandSender(ICommandSender sender) {
		this.consoleSender = sender;
	}

	@Override
	public ServerConfiguration getServerConfiguration() {
		return serverConf;
	}

	@Override
	public IOManager getIOManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorldManager getWorldManager() {
		return worldManager;
	}

	@Override
	public void setWorldManager(WorldManager manager) {
		this.worldManager = manager;
	}

	@Override
	public Scheduler getScheduler() {
		return scheduler;
	}

	@Override
	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

}
