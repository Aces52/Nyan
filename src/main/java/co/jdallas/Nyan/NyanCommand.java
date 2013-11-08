package co.jdallas.Nyan;

import co.jdallas.Nyan.utils.Msg;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class NyanCommand implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(cmd.getLabel().equalsIgnoreCase("Nyan")){
            if(args.length < 1 || args.length > 1){
                Msg.player(p, "Nyan by _Dallas");
                Msg.player(p, "Use /Nyan me to use nyan on yourself");
                Msg.player(p, "Use /Nyan <Player> to use nyan on someone else");
            }else if(args[0].equalsIgnoreCase("me")){
                if(p.hasPermission("Nyan.Self")){
                    if(!Nyan.Nyans.contains(p.getName())){
                        Nyan.Nyans.add(p.getName());
                        Msg.player(p, "Added to Nyan");
                    }else{
                        Nyan.Nyans.remove(p.getName());
                        Msg.player(p, "Removed from Nyan");
                    }
                }else{
                    Msg.player(p, "You are missing the premission Nyan.Self");
                }
            }else{
             if(p.hasPermission("Nyan.Other")){
                if(Bukkit.getOfflinePlayer(args[0]).isOnline()){
                    if(!Nyan.Nyans.contains(args[0])){
                        Nyan.Nyans.add(args[0]);
                        Msg.player(p, args[0] + " Added to Nyan");
                    }else{
                        Nyan.Nyans.remove(args[0]);
                        Msg.player(p, args[0] + " Removed from Nyan");
                    }
                }else{
                    Msg.player(p, "That player is not online!");
                }   
            }
          }
            
        }
    return false; 
    }

}