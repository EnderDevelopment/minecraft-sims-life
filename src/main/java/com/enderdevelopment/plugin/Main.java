package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("LifeSimulator plugin enabled!");
        // Register commands and event listeners here
    }

    @Override
    public void onDisable() {
        getLogger().info("LifeSimulator plugin disabled!");
    }
}