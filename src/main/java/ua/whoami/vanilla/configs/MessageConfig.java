package ua.whoami.vanilla.configs;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import ua.whoami.vanilla.core.CorePlugin;

import java.io.File;

public class MessageConfig {
    private static FileConfiguration messageConfiguration;

    public static void loadMessageConfig() {
        final File messageFile = new File(CorePlugin.getInstance().getDataFolder(), "messages.yml");

        if (!messageFile.exists()) {
            CorePlugin.getInstance().saveResource("messages.yml", false);
        }

        messageConfiguration = YamlConfiguration.loadConfiguration(messageFile);
    }

    public static FileConfiguration getMessageConfiguration() {
        return messageConfiguration;
    }
}
