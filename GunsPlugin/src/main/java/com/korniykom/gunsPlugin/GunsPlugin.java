package com.korniykom.gunsPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.java.JavaPlugin;

public final class GunsPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getCommand("getHoe").setExecutor(new GetHoeCommand());
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {

        Player player = event.getPlayer();

        if(event.getHand().equals(EquipmentSlot.HAND)) {
            if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (player.getInventory().getItemInMainHand().getType().equals(Material.WOODEN_HOE)) {
                    player.launchProjectile(ThrownExpBottle.class, player.getLocation().getDirection());
                } else if (player.getInventory().getItemInMainHand().getType().equals(Material.STONE_HOE)) {
                    player.launchProjectile(WitherSkull.class, player.getLocation().getDirection());
                } else if (player.getInventory().getItemInMainHand().getType().equals(Material.IRON_HOE)) {
                    player.launchProjectile(Trident.class, player.getLocation().getDirection());
                }else if (player.getInventory().getItemInMainHand().getType().equals(Material.GOLDEN_HOE)) {
                    if(player.getInventory().getItemInMainHand().hasItemMeta() && player.getInventory().getItemInMainHand().getItemMeta().hasDisplayName()) {
                        String displayName = player.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
                        if(ChatColor.stripColor(displayName).equalsIgnoreCase("Magic Hoe")) {
                            player.launchProjectile(Fireball.class, player.getLocation().getDirection());
                        }
                    }
                } else if (player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_HOE)) {
                    player.launchProjectile(SpectralArrow.class, player.getLocation().getDirection());
                } else if (player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_HOE)) {
                    player.launchProjectile(BreezeWindCharge.class, player.getLocation().getDirection());
                }
            }
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
