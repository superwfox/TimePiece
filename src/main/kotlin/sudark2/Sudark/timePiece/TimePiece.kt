package sudark2.Sudark.timePiece

import org.bukkit.plugin.java.JavaPlugin

class TimePiece : JavaPlugin() {

    override fun onEnable() {
        TimeStop();
        TimeFlow(this);
    }
}
