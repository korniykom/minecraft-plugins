package max.com.entitiesKotlinPlugin

import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.entity.EntityType
import org.bukkit.entity.Warden
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.CreatureSpawnEvent
import org.bukkit.event.entity.EntitySpawnEvent
import org.bukkit.plugin.java.JavaPlugin

class EntitiesKotlinPlugin : JavaPlugin(), Listener {

    override fun onEnable() {

        Bukkit.getPluginManager().registerEvents(this, this)

        val world = Bukkit.getWorld("world");
        if ( world != null) {
            val location = Location (world, -70.0, 71.0, -32.0)
            val warden : Warden? = world.spawnEntity(location, EntityType.WARDEN) as Warden?
        }


    }

    @EventHandler
    fun onEntitySpawn(event: EntitySpawnEvent) : Unit {

        event.isCancelled = true
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
