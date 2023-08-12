package io.github.alal08.weaponsystem.command;

import io.github.alal08.weaponsystem.WeaponSystem;
import io.github.alal08.weaponsystem.Weapons;
import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WeaponCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player player) {
            WeaponSystem.getPlayer(player).addWeapon(Weapons.getWeaponStone());
            return true;
        }
        else if(sender instanceof ConsoleCommandSender) {
            sender.sendMessage(Component.text("콘솔에서는 이 명령어를 실행할 수 없습니다."));
            return false;
        }
        return false;
    }
}