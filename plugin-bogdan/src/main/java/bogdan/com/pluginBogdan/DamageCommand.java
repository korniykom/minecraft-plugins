package bogdan.com.pluginBogdan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class DamageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.setHealth(player.getHealth() - 5);
            player.sendMessage(Color.YELLOW + "You have been damaged");
        }

        return false;
    }
}
