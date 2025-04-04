package ua.whoami.vanilla.core;

import org.bukkit.plugin.java.JavaPlugin;
import ua.whoami.vanilla.configs.DefaultConfig;
import ua.whoami.vanilla.configs.MessageConfig;
import ua.whoami.vanilla.utils.Common;

public final class CorePlugin extends JavaPlugin {

    private static CorePlugin instance;
    
    @Override
    public void onEnable() {
        instance = this;
        MessageConfig.loadMessageConfig();
        DefaultConfig.loadDefaultConfig();
        Common.registerCommands();
    }

    public static CorePlugin getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
