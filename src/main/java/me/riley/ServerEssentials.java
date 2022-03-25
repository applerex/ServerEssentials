package me.riley;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerEssentials extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[ServerEssentials] Plugin has started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[ServerEssentials] plugin has started");
    }
}
