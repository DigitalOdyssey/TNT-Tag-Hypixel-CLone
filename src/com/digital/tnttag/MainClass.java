package com.digital.tnttag;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class MainClass extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nTNT Tag plugin has been enabled!\n\n");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		loadConfig();
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nTNT Tag plugin has been disabled!\n\n");
	}
	
	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
}
