package io.github.alal08.weaponsystem.fleks;

public interface System<T> {

    World getWorld();

    void addToWorld(World world);

    default void onComponentAdded(Entity entity, T component) {}

    default void onComponentRemoved(Entity entity, T component) {}
}