package io.github.alal08.weaponsystem.system;

import io.github.alal08.weaponsystem.fleks.Entity;
import io.github.alal08.weaponsystem.fleks.System;
import io.github.alal08.weaponsystem.fleks.World;
import org.bukkit.entity.Player;

public class PlayerUtil {
    public static Entity toEntity(System<?> system, Player player) {
        for (Entity entity : system.getWorld().getEntities()) {
            if (isPlayer(entity, player)) {
                return entity;
            }
        }
        throw new AssertionError("Player not exists");
    }

    private static boolean isPlayer(Entity entity, Player player) {
        try {
            return entity.get(Player.class).getPlayer() == player;
        } catch (Throwable throwable) {
            return false;
        }
    }
}
