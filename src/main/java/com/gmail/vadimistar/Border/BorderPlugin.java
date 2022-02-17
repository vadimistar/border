package com.gmail.vadimistar.Border;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class BorderPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getLogger().info("Enable Border Plugin");
        Objects.requireNonNull(this.getCommand("border")).setExecutor(new BorderCommandExecutor());
    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("Disable Border Plugin");
    }
}
