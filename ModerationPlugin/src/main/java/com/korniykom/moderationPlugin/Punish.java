package com.korniykom.moderationPlugin;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class Punish  implements CommandExecutor {

    // punish <player name> <kick/back/tempban>

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if ( commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if ( args.length == 2) {
                if (Bukkit.getPlayer(args[0]) != null) {
                    Player target = Bukkit.getPlayer(args[0]);

                    switch (args[1].toLowerCase()) {
                        case "kick":
                            target.kickPlayer(ChatColor.MAGIC + " You have been kicked!");
                            break;
                        case "ban":
                            Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), ChatColor.RED + " Reason: Being a bad player", null, null);
                            target.kickPlayer(ChatColor.MAGIC + " You have been baned!");
                            break;
                        case "tempban":
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(Calendar.HOUR, 12);
                            Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), ChatColor.RED + " Reason: Being a bad player", calendar.getTime(), null);
                            target.kickPlayer(ChatColor.MAGIC + " You have been baned!");
                            break;
                        default:
                            player.sendMessage(ChatColor.RED + "You did not specify whether to kick ban or tempban");
                            return false;
                    }
                } else {
                    player.sendMessage(ChatColor.RED + "Player is not online");
                }

            } else {
                player.sendMessage(ChatColor.MAGIC + "Magic");
                player.sendMessage(ChatColor.AQUA + "Invalid useage. Use punish <player name> <kick/back/tempban>");
            }


        }
        return false;
    }
}
