package yando0.finesoftware.fallguys.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import retamrovec.finesoftware.fallguys.FallGuys;
import retamrovec.finesoftware.fallguys.Managers.ConfigManager;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent e) {


        new ConfigManager(FallGuys.instance().getDataFolder(), "messages.yml");
        ConfigManager.getConfiguration().getString("player.join");
        e.getPlayer().sendMessage(ConfigManager.getConfiguration().getString("player.join"));
        e.setJoinMessage("");


    }

}
