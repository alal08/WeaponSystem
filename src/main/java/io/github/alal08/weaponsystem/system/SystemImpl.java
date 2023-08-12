package io.github.alal08.weaponsystem.system;

import io.github.alal08.weaponsystem.fleks.System;
import io.github.alal08.weaponsystem.fleks.World;

public class SystemImpl<T> implements System<T> {

    private World world;

    @Override
    public void addToWorld(World world) {
        this.world = world;
    }

    @Override
    public World getWorld() {
        return world;
    }
}
