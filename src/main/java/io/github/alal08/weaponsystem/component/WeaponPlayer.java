package io.github.alal08.weaponsystem.component;

import io.github.alal08.weaponsystem.fleks.Entity;
import io.github.alal08.weaponsystem.fleks.World;
import org.bukkit.entity.Player;

public class WeaponPlayer {

    private final Player player;
    private final World world = createPlayerWorld();


    public WeaponPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    private static World createPlayerWorld() {
        return new World();
    }

    public void addWeapon(Entity entity) {
        world.addEntity(entity);
    }

}
