package com.korniykom.testPlugin;

import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;
            player.sendMessage("You have been healed");
            player.setHealth(20);
            player.getWorld().spawnParticle(Particle.HEART, player.getLocation(), 100);
        }
        return false;
    }
}
