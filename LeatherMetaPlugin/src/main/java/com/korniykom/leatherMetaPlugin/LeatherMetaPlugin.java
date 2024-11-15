package com.korniykom.leatherMetaPlugin;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.EquipmentSlot;
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

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e) {

        if (e.isSneaking()) {
           e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_BANJO,1.0f,1.0f);
        }

    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {

        Player player = e.getPlayer();

        if ( e.getHand().equals(EquipmentSlot.HAND)) {
            if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if(player.getInventory().getItemInMainHand() != null && player.getInventory().getItemInMainHand().getType().equals(Material.STICK)) {
                   Snowball snowball = (Snowball) player.launchProjectile(Snowball.class, player.getLocation().getDirection());
                    snowball.setGlowing(true);
                    snowball.set
                }
            }
        }
    }

}
