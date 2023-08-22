package fr.yudza.tuto.tuto;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Tuto extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getLogger().log(Level.INFO, "Plugin Tuto démarré avec succès !");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getLogger().log(Level.INFO, "Plugin Tuto disable");
    }
}
