package com.korniykom.leatherMetaPlugin;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class LeatherMetaPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        helmetMeta.setColor(org.bukkit.Color.fromRGB(219, 153, 255));
        helmet.setItemMeta(helmetMeta);


        ItemStack chestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestPlateMeta= (LeatherArmorMeta) chestPlate.getItemMeta();
        chestPlateMeta.setColor(org.bukkit.Color.fromRGB(219, 153, 255));
        chestPlate.setItemMeta(chestPlateMeta);

        ItemStack leggins = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta legginsMeta= (LeatherArmorMeta) leggins.getItemMeta();
        legginsMeta.setColor(org.bukkit.Color.fromRGB(219, 153, 255));
        leggins.setItemMeta(legginsMeta);

        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();
        bootsMeta.setColor(org.bukkit.Color.fromRGB(219, 153, 255));
        boots.setItemMeta(bootsMeta);

        e.getPlayer().getInventory().addItem(helmet);
        e.getPlayer().getInventory().addItem(chestPlate);
        e.getPlayer().getInventory().addItem(leggins);
        e.getPlayer().getInventory().addItem(boots);

        e.getPlayer().getWorld().setTime(18000);

    }


}
