package info.charlieward.lousynethubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class noJoinMessage implements Listener {

    @EventHandler
    public void playerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
    }
}
