package co.jdallas.Nyan;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;


public class Leave implements Listener{

    @EventHandler
    public void Leave (PlayerQuitEvent evt){
        if(Nyan.Nyans.contains(evt.getPlayer().getName())){
            Nyan.Nyans.remove(evt.getPlayer().getName());
        }
    }
}