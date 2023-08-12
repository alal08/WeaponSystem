package io.github.alal08.weaponsystem.api;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.PluginClassLoader;

public class EventListener implements Listener {
    public static void initListener(Listener listener) {
        PluginClassLoader classLoader = (PluginClassLoader) listener.getClass().getClassLoader();
        JavaPlugin plugin = classLoader.getPlugin();
        Bukkit.getPluginManager().registerEvents(listener, plugin);
    }
}
