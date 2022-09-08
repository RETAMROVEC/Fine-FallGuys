package retamrovec.finesoftware.fallguys.Configs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import retamrovec.finesoftware.fallguys.FallGuys;
import retamrovec.finesoftware.fallguys.Instance.Arena;
import retamrovec.finesoftware.fallguys.Managers.ConfigManager;

public class Config {

    public static void newConfiguration() {
        ConfigManager.getConfiguration().addDefault("required_players", 2);
        ConfigManager.getConfiguration().addDefault("countdown-seconds", 15);
        ConfigManager.getConfiguration().addDefault("spawn.world", "world");
        ConfigManager.getConfiguration().addDefault("spawn.x", "0");
        ConfigManager.getConfiguration().addDefault("spawn.y", "64");
        ConfigManager.getConfiguration().addDefault("spawn.z", "0");
        ConfigManager.getConfiguration().addDefault("spawn.yaw", "0");
        ConfigManager.getConfiguration().addDefault("spawn.pitch", "90");
        ConfigManager.getConfiguration().addDefault("arenas.1.world", "world");
        ConfigManager.getConfiguration().addDefault("arenas.1.x", "16");
        ConfigManager.getConfiguration().addDefault("arenas.1.y", "69");
        ConfigManager.getConfiguration().addDefault("arenas.1.z", "32");
        ConfigManager.getConfiguration().addDefault("arenas.1.yaw", "0");
        ConfigManager.getConfiguration().addDefault("arenas.1.pitch", "90");
        ConfigManager.getConfiguration().options().copyDefaults(true);
    }

    public int getNeededPlayers() {
        new ConfigManager(FallGuys.instance().getDataFolder(), "config.yml");
        return ConfigManager.getConfiguration().getInt("required_players");
    }

    public static int getCountdownSeconds() {
        new ConfigManager(FallGuys.instance().getDataFolder(), "config.yml");
        return ConfigManager.getConfiguration().getInt("countdown-seconds");
    }

    public static Location getLobbySpawn() {
        new ConfigManager(FallGuys.instance().getDataFolder(), "config.yml");
        return new Location(
                Bukkit.getWorld(ConfigManager.getConfiguration().getString("spawn.world")),
                ConfigManager.getConfiguration().getDouble("spawn.x"),
                ConfigManager.getConfiguration().getDouble("spawn.y"),
                ConfigManager.getConfiguration().getDouble("spawn.z"),
                (float) ConfigManager.getConfiguration().getDouble("spawn.yaw"),
                (float) ConfigManager.getConfiguration().getDouble("spawn.pitch"));
    }

    public static @NotNull Location getArenaSpawn(int id) {
        new ConfigManager(FallGuys.instance().getDataFolder(), "config.yml");
        return new Location(
                Bukkit.getWorld(ConfigManager.getConfiguration().getString("arenas." + id + ".world")),
                ConfigManager.getConfiguration().getDouble("arenas." + id + ".x"),
                ConfigManager.getConfiguration().getDouble("arenas." + id + ".y"),
                ConfigManager.getConfiguration().getDouble("arenas." + id + ".z"),
                (float) ConfigManager.getConfiguration().getDouble("arenas." + id + ".yaw"),
                (float) ConfigManager.getConfiguration().getDouble("arenas." + id + ".pitch"));
    }

}
