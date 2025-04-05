package ua.whoami.vanilla.configs;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import ua.whoami.vanilla.core.CorePlugin;

import java.io.File;

public class CommandConfig {
    private static FileConfiguration commandConfig;

    public static void loadCommandConfig() {
        File commandFile = new File(CorePlugin.getInstance().getDataFolder(), "commands.yml");

        if (!commandFile.exists()) {
            CorePlugin.getInstance().saveResource("commands.yml", false);
        }

        commandConfig = YamlConfiguration.loadConfiguration(commandFile);
    }

    public static FileConfiguration getCommandConfig() {
        return commandConfig;
    }
}
