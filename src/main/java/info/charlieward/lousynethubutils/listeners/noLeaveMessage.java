package info.charlieward.lousynethubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class noLeaveMessage implements Listener {

    @EventHandler
    public void playerLeave(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }
}
