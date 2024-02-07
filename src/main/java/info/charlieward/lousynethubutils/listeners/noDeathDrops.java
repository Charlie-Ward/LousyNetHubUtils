package info.charlieward.lousynethubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class noDeathDrops implements Listener {

    @EventHandler
    public void playerDeath(PlayerDeathEvent event) {
        event.getDrops().clear();
    }
}
