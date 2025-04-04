package ua.whoami.vanilla.utils;

import org.bukkit.command.CommandExecutor;
import org.jetbrains.annotations.NotNull;
import ua.whoami.vanilla.core.CorePlugin;

import java.util.Objects;

public class CommandRegistry {
    public static void register(@NotNull String command, @NotNull CommandExecutor executor) {
        Objects.requireNonNull(CorePlugin.getInstance().getCommand(command)).setExecutor(executor);
    }
}
