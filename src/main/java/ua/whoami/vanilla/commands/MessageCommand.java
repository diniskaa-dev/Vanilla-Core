package ua.whoami.vanilla.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class MessageCommand implements TabExecutor {
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (args.length == 0) {
            if (sender.hasPermission("core.command.message")) {
                // TODO: Реализовать команду /message [без аргументов]
                sender.sendMessage("  ");
            } else {
                // TODO: Отправить сообщение когда у игрока нет прав на использование команды /message
                sender.sendMessage(" ");
            }
            return true;
        }

        if (args.length == 1) {
            if (sender.hasPermission("core.command.message")) {
                final String playerName = args[0];
                Player targetPlayer = Bukkit.getPlayer(playerName);

                if (targetPlayer == null) {
                    sender.sendMessage("   ");
                    return true;
                }

                sender.sendMessage("   ");
            } else {
                // TODO: Отправить сообщение когда у игрока нет прав на использование команды /message
                sender.sendMessage(" ");
            }
            return true;
        }
        return true;
    }

    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        return List.of();
    }
}
