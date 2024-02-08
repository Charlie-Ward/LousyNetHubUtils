package info.charlieward.lousynethubutils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class noDrops implements Listener {

    @EventHandler
    public void playerDroppedItem(PlayerDropItemEvent event) {
        if(!event.getPlayer().hasPermission("LousyNet-Hub-Utils.AllowItemDrops")) {
            event.setCancelled(true);
        }
    }
}
