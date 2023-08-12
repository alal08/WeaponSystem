package io.github.alal08.weaponsystem.fleks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class World {

    private final ArrayList<System<?>> systems = new ArrayList<>();

    public void addSystem(System<?> system) {
        systems.add(system);
    }
    private final ArrayList<Entity> entities = new ArrayList<>();

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public List<Entity> getEntities() {return new ArrayList<>(entities);}

}
