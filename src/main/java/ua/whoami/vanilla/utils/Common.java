package ua.whoami.vanilla.utils;

import ua.whoami.vanilla.commands.MessageCommand;

public class Common {
    public static void registerCommands() {
        CommandRegistry.register("message", new MessageCommand());
    }
}
