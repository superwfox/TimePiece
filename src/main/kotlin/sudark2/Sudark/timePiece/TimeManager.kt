package sudark2.Sudark.timePiece

import org.bukkit.Bukkit
import org.bukkit.GameRule
import org.bukkit.World
import org.bukkit.plugin.Plugin
import org.bukkit.scheduler.BukkitRunnable

val Worlds: MutableList<World> = mutableListOf()

fun TimeStop() {
    for (world in Bukkit.getWorlds()) {
        if (world.environment == World.Environment.NORMAL) {
            world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false)
            Worlds.add(world)
        }
    }
}

fun TimeFlow(plugin: Plugin) {
    object : BukkitRunnable() {
        override fun run() {
            for (world in Worlds)
                if (world.time < 12000) world.time++ else world.time + 2
        }
    }.runTaskTimer(plugin, 0L, 2L);
}