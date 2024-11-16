package com.korniykom.gunsPlugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GetHoeCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;

            ItemStack goldenHoe = new ItemStack(Material.GOLDEN_HOE);
            ItemMeta goldenHoeMeta = goldenHoe.getItemMeta();

            goldenHoeMeta.setDisplayName(ChatColor.MAGIC + "Magic Hoe");
            goldenHoeMeta.addEnchant(Enchantment.FORTUNE, 100, true);
            goldenHoe.setItemMeta(goldenHoeMeta);

            player.getInventory().addItem(goldenHoe);
            return true;
        }

        return false;
    }
}
