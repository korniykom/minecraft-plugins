package com.korniykom.moderationPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ModerationPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("punish").setExecutor(new Punish());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
