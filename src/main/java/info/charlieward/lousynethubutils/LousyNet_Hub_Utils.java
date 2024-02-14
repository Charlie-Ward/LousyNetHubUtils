package info.charlieward.lousynethubutils;

import info.charlieward.lousynethubutils.listeners.noDeathDrops;
import info.charlieward.lousynethubutils.listeners.noJoinMessage;
import org.bukkit.plugin.java.JavaPlugin;

public final class LousyNet_Hub_Utils extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("LousyNet-Hub-Utils v." + this.getDescription().getVersion() + " has loaded.");

        getServer().getPluginManager().registerEvents(new noJoinMessage(), this);
        getServer().getPluginManager().registerEvents(new noDeathDrops(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("LousyNet-Hub-Utils v." + this.getDescription().getVersion() + " has been disabled.");
    }
}
