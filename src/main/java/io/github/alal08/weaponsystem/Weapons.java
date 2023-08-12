package io.github.alal08.weaponsystem;

import io.github.alal08.weaponsystem.fleks.Entity;
import io.github.alal08.weaponsystem.component.ItemWeapon;
import io.github.alal08.weaponsystem.component.Weapon;
import io.github.alal08.weaponsystem.WeaponType;
import org.bukkit.Material;

import java.util.List;

public class Weapons {

    public static Entity getWeaponStone() {
        return new Entity() {{
            addComponent(new Weapon("단단한 짱돌", WeaponType.PASSIVE));
            addComponent(new ItemWeapon(Material.STONE, List.of("사실은 나무다.", "히힛", "헤헿..")));
        }};
    }

}
