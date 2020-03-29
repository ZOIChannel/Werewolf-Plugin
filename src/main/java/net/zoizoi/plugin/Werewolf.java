package net.zoizoi.plugin;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

import static org.bukkit.GameMode.ADVENTURE;

public final class Werewolf extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Werewolf-Plugin が有効になりました。");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        if(cmd.getName().equalsIgnoreCase("wolf-ready")){
            getLogger().info("Ready.");
            for(Player player : Bukkit.getOnlinePlayers()){
                player.sendTitle("Ready.","ゲームがあと少しで開始されます。",10,70,20);
                player.setGameMode(ADVENTURE);
            }
            return true;
            // コマンドが実行された場合は、trueを返して当メソッドを抜ける。
        }
        if(cmd.getName().equalsIgnoreCase("wolf-start")){
            getLogger().info("Game Start!!!");
            World world = Bukkit.getWorld("werewolf");
            for(Player player : Bukkit.getOnlinePlayers()){
                player.sendTitle("開始","ゲームが開始されました",10,70,20);
                world.setGameRuleValue("ANNOUNCE_ADVANCEMENTS", "false");
                world.setGameRuleValue("COMMAND_BLOCK_OUTPUT", "true");
                world.setGameRuleValue("DO_DAYLIGHT_CYCLE", "false");
                world.setGameRuleValue("DO_ENTITY_DROPS", "true");
                world.setGameRuleValue("DO_MOB_SPAWNING", "false");
                world.setGameRuleValue("DO_WEATHER_CYCLE", "false");
                world.setGameRuleValue("MOB_GRIEFING", "true");
                world.setGameRuleValue("NATURAL_REGENERATION", "true");
            }
            return true;
            // コマンドが実行された場合は、trueを返して当メソッドを抜ける。
        }

        return false;
        // コマンドが実行されなかった場合は、falseを返して当メソッドを抜ける。
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Werewolf-Plugin が無効になりました。");
    }

}
