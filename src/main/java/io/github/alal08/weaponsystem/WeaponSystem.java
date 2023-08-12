package io.github.alal08.weaponsystem;

import io.github.alal08.weaponsystem.command.WeaponCommand;
import io.github.alal08.weaponsystem.component.WeaponPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class WeaponSystem extends JavaPlugin implements Listener {
    private static final HashMap<Player, WeaponPlayer> players = new HashMap<>();

    public static WeaponPlayer getPlayer(Player player) {
        return players.get(player);
    }

    @Override
    public void onEnable() {
        getCommand("weapon").setExecutor(new WeaponCommand());
        PluginManager pluginManager = this.getServer().getPluginManager();
        pluginManager.registerEvents(new SkillCast(), this);
        pluginManager.registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @SuppressWarnings("unused")
    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        players.put(player, new WeaponPlayer(player));
    }

    @SuppressWarnings("unused")
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onLeaveEvent(PlayerQuitEvent event) {
        players.remove(event.getPlayer());
    }


}
