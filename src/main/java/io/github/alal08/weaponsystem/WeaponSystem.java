package io.github.alal08.weaponsystem;

import io.github.alal08.weaponsystem.weaponmodule.Weapon;
import io.github.alal08.weaponsystem.weaponmodule.command.WeaponCommand;
import io.github.alal08.weaponsystem.weaponmodule.skill.SkillCast;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class WeaponSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("weapon").setExecutor(new WeaponCommand());
        PluginManager pluginManager = this.getServer().getPluginManager();
        pluginManager.registerEvents(new SkillCast(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
