package bogdan.com.pluginBogdan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage(Color.MAGENTA + "You have been healed");
            if(player.getHealth() < 15) {
                player.setHealth(player.getHealth() + 5);
            } else {
                player.setHealth(20);
            }

        }


        return false;
    }
}
