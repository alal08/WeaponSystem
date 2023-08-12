package io.github.alal08.weaponsystem.weaponmodule.weapon;

import io.github.alal08.weaponsystem.weaponmodule.Weapon;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class WeaponStone extends Weapon {

    public WeaponStone() {
        name = "단단한 짱돌";
        itemType = Material.OAK_LOG;
        lore = new String[]{"사실은 나무다.", "히힛", "헤헿.."};
        cast = (e) -> {
            e.getPlayer().sendMessage("ㅎㅎ");
        };
    }

    public ItemStack getWand() {
        return getItemStack();
    }
}
