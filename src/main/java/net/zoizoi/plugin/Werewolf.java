package net.zoizoi.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Werewolf extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Werewolf-Plugin が有効になりました。");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Werewolf-Plugin が無効になりました。");
    }
}
