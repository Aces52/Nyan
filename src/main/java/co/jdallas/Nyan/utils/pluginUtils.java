package co.jdallas.Nyan.utils;

import co.jdallas.Nyan.Nyan;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;


public class pluginUtils {
    
    private static Nyan plugin;
 
   public static void setPlugin(Nyan plugin){
      pluginUtils.plugin = plugin;
   }
 public static Nyan getPlugin(){
      return plugin;
   }
   public static Server getServer(){
      return plugin.getServer();
   }
 
   public static FileConfiguration getConfig(){
      return plugin.getConfig();
   }
 
   public static void saveConfig(){
      plugin.saveConfig();
   }
    
   public static boolean isInt(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    
    
    
}
