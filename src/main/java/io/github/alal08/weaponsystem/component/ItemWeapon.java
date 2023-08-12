package io.github.alal08.weaponsystem.component;

import org.bukkit.Material;

import java.util.List;

public class ItemWeapon {
    public Material itemType;
    public List<String> itemLore;

    public ItemWeapon(Material itemType, List<String> itemLore) {
        this.itemType = itemType;
        this.itemLore = itemLore;
    }
}
