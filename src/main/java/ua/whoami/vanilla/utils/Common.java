package ua.whoami.vanilla.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.command.CommandSender;
import ua.whoami.vanilla.commands.MessageCommand;

public class Common {
    public static void registerCommands() {
        CommandRegistry.register("message", new MessageCommand());
    }

    public static void sendMessage(CommandSender sender, Component message) {
        sender.sendMessage(message);
    }
}
