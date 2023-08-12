package io.github.alal08.weaponsystem.weaponmodule.skill;

import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class SkillCast implements Listener {

    public Consumer<PlayerInteractEvent> cast = (e) -> {};

    @EventHandler
    public void onRightClickEvent(@NotNull PlayerInteractEvent e) {
        Action a = e.getAction();
        if (!(a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK)) return;
        cast.accept(e);
        e.getPlayer().sendMessage("성!!");
    }
}
