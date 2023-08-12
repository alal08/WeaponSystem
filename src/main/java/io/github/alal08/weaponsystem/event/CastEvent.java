package io.github.alal08.weaponsystem.event;

import io.github.alal08.weaponsystem.fleks.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class CastEvent extends Event {

    public Entity castable;

    public CastEvent(Entity castable) {
        this.castable = castable;
    }

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    @Override
    public @NotNull HandlerList getHandlers() { return HANDLERS_LIST; }
}
