package io.github.alal08.weaponsystem.weaponmodule;

import io.github.alal08.weaponsystem.weaponmodule.skill.SkillCast;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Weapon extends SkillCast {

    public String name = "null";
    public String[] lore = null;
    public Material itemType = Material.STONE;

    public ItemStack getItemStack() {
        ItemStack itemStack = new ItemStack(itemType);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        itemMeta.setLore(List.of(lore));
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
