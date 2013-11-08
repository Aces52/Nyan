package co.jdallas.Nyan.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Msg {
    
    public static void player(Player p,String s){
        p.sendMessage(ChatColor.YELLOW + "[Nyan] " + ChatColor.AQUA + s);
        
    }

    public static void all(String s){
        Bukkit.broadcastMessage(ChatColor.YELLOW + "[Nyan] " + ChatColor.AQUA + s);
    }



}
