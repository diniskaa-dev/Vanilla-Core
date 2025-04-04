package ua.whoami.vanilla.core;

import org.bukkit.plugin.java.JavaPlugin;
import ua.whoami.vanilla.configs.DefaultConfig;
import ua.whoami.vanilla.configs.MessageConfig;
import ua.whoami.vanilla.utils.CommandRegistry;
import ua.whoami.vanilla.utils.EventRegistry;

public final class CorePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        MessageConfig.loadMessageConfig();
        DefaultConfig.loadDefaultConfig();

        // CommandRegistry.register();
        // EventRegistry.register();
    }
}
