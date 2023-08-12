package io.github.alal08.weaponsystem.system;

import io.github.alal08.weaponsystem.component.WeaponPlayer;
import io.github.alal08.weaponsystem.event.CastEvent;
import io.github.alal08.weaponsystem.fleks.Entity;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

public class CastableSystem extends SystemImpl<Void> {

    @EventHandler
    public void onRightClickEvent(@NotNull PlayerInteractEvent e) {
        Action a = e.getAction();
        if (!(a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK)) return;
        Entity entity = PlayerUtil.toEntity(this, e.getPlayer());
        Bukkit.getPluginManager().callEvent(new CastEvent(entity));
    }

}
