package net.zoizoi.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Werewolf extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Werewolf-Plugin が有効になりました。");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
        // プレイヤーが「/basic」コマンドを投入した際の処理...
        if(cmd.getName().equalsIgnoreCase("wolf-start")){
            // 何かの処理
            plg.getLogger().info("Game Start!!!");
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
