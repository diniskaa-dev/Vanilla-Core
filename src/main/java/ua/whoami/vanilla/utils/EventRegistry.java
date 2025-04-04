package ua.whoami.vanilla.utils;

import org.bukkit.event.Listener;
import ua.whoami.vanilla.core.CorePlugin;

public class EventRegistry {
    public static void register(Listener listener) {
        CorePlugin.getInstance().getServer().getPluginManager().registerEvents(listener, CorePlugin.getInstance());
    }
}
