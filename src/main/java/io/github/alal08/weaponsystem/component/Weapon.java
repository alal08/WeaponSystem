package io.github.alal08.weaponsystem.component;

import io.github.alal08.weaponsystem.WeaponType;

public class Weapon {
    public String name;
    public WeaponType type;

    public Weapon(String name, WeaponType type) {
        this.name = name;
        this.type = type;
    }
}
