package co.jdallas.Nyan;

import co.jdallas.Nyan.utils.ParticleEffect;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;


public class Move implements Listener{
    public static boolean go = false;
    @EventHandler
    public void onMove(PlayerMoveEvent evt){
       if(Nyan.Nyans.isEmpty()){}else{NyanPlayer();}
    }
    
    public void NyanPlayer(){
          for(String s : Nyan.Nyans){
             Player p = Bukkit.getPlayer(s);
            try {
                 Location l = p.getLocation();
                 Vector direction = l.getDirection().normalize();
                 direction.multiply(2); 
                 l.subtract(direction);
                 l.setY(l.getY() +1 );
                 
                 Location l2 = p.getLocation();
                 Vector direction2 = l2.getDirection().normalize();
                 direction2.multiply(2);
                 l2.subtract(direction2);
                 l2.setY(l2.getY() +0.5);
                 
                 Location l3 = p.getLocation();
                 Vector direction3 = l3.getDirection().normalize();
                 direction3.multiply(2);
                 l3.subtract(direction3);
                 l3.setY(l3.getY() + 1.5);
                 
                 ParticleEffect.sendToLocation(ParticleEffect.MOB_SPELL, l, 0, 0, 0, 2, 5);
                 ParticleEffect.sendToLocation(ParticleEffect.MOB_SPELL, l2, 0, 0, 0, 2, 5);
                 ParticleEffect.sendToLocation(ParticleEffect.MOB_SPELL, l3, 0, 0, 0, 2, 5);
                 
             } catch (Exception ex) {
                 Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
}