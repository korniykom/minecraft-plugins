package com.korniykom.testPlugin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.net.http.WebSocket;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Whoohoo! The plugin has started!");
        Bukkit.getPluginManager().registerEvents(this,this);
        // Plugin startup logic

    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        e.setCancelled(true);
        e.getPlayer().sendMessage(ChatColor.AQUA + "Stop moving you are frozen");
    };

    @EventHandler
    public void onPlayerEggThrown(PlayerEggThrowEvent e) {
        e.getPlayer().sendMessage("You just threw an egg");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
