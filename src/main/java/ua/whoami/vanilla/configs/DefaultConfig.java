package ua.whoami.vanilla.configs;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import ua.whoami.vanilla.core.CorePlugin;

import java.io.File;

public class DefaultConfig {
    private static FileConfiguration configuration;

    public static void loadDefaultConfig() {
        final File configFile = new File(CorePlugin.getInstance().getDataFolder(), "config.yml");

        if (!configFile.exists()) {
            CorePlugin.getInstance().saveResource("config.yml", false);
        }

        configuration = YamlConfiguration.loadConfiguration(configFile);
    }

    public static FileConfiguration getConfiguration() {
        return configuration;
    }
}
