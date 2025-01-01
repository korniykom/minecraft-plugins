package max.com.blocksMaterialsItemStackKotlin

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta
import org.bukkit.plugin.java.JavaPlugin

class BlocksMaterialsItemStackKotlin : JavaPlugin() {

    override fun onEnable() {

        val world = Bukkit.getWorld("world")
        val block = world?.getBlockAt(9,9,9)


        val woodenAxe = ItemStack(Material.WOODEN_AXE, 2)
        val woodenAxeMeta = woodenAxe.itemMeta
        woodenAxeMeta?.addEnchant(Enchantment.EFFICIENCY, 199, true)


        woodenAxe.setItemMeta(woodenAxeMeta)


    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
