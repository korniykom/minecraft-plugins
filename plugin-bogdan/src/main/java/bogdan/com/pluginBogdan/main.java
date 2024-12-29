package bogdan.com.pluginBogdan;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("damage").setExecutor(new DamageCommand());
        getCommand("creative").setExecutor(new CreativeGamemodeCommand());
        getCommand("survival").setExecutor(new SurvivalGamemodeCommand());

    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
//        e.getPlayer().sendMessage("Stop moving");
//        e.setCancelled(true);
    }


    @EventHandler
    public void onPlayerEggThrown(PlayerEggThrowEvent e) {
//        e.getPlayer().sendMessage("You have thrown an egg");
    }


}
