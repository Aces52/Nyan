package co.jdallas.Nyan;

import co.jdallas.Nyan.utils.pluginUtils;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class Nyan extends JavaPlugin{
    public static ArrayList<String> Nyans = new ArrayList<String>();
    
    @Override
    public void onEnable(){
        pluginUtils.setPlugin(this);
        Bukkit.getPluginManager().registerEvents(new Move(), this);
        Bukkit.getPluginManager().registerEvents(new Leave(), this);
        getCommand("Nyan").setExecutor(new NyanCommand());
    }
    @Override
    public void onDisable(){
        
    }
}