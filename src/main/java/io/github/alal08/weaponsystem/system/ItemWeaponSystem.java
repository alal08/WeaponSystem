package io.github.alal08.weaponsystem.system;

import io.github.alal08.weaponsystem.fleks.Entity;
import io.github.alal08.weaponsystem.fleks.System;
import io.github.alal08.weaponsystem.component.Weapon;
import io.github.alal08.weaponsystem.component.ItemWeapon;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemWeaponSystem extends SystemImpl<ItemWeapon> {

    public ItemStack getItemStack(Entity entity) {
        Weapon weapon = entity.get(Weapon.class);
        ItemWeapon itemWeapon = entity.get(ItemWeapon.class);
        ItemStack itemStack = new ItemStack(itemWeapon.itemType);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.displayName(Component.text(weapon.name));
        itemMeta.lore(itemWeapon.itemLore.stream().map(Component::text).toList());
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }


    @Override
    public void onComponentAdded(Entity entity, ItemWeapon component) {

    }

    @Override
    public void onComponentRemoved(Entity entity, ItemWeapon component) {

    }
}
