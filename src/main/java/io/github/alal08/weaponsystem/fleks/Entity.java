package io.github.alal08.weaponsystem.fleks;

import java.util.HashMap;

public class Entity {
    private final HashMap<String, Object> components = new HashMap<>();

    public void addComponent(Object component) {
        components.put(component.getClass().getName(), component);
    }

    private <T> Object getOrNull(Class<T> clazz) {
        return components.getOrDefault(clazz.getName(), null);
    }
    public <T> boolean has(Class<T> clazz) {
        return getOrNull(clazz) == null;
    }

    public <T> T get(Class<T> clazz) {
        Object component = getOrNull(clazz);
        if (component == null) {
            throw new AssertionError("component " + clazz.getSimpleName() + " not found");
        }
        return (T) component;
    }
}
