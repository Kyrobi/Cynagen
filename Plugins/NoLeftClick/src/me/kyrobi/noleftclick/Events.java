package me.kyrobi.noleftclick;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;


public class Events implements Listener{
	
	private Player sender;
	final Player p = (Player)sender;
  
	public Events(Main plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler //Uh... does nothing
	public void leftClickPlayer(PlayerInteractEntityEvent ev) {
	    
		ev.setCancelled(true);
		
	 }
	
	
	@EventHandler //Detects if player is attacking entity
	public void onEntityDamage(EntityDamageByEntityEvent event)
	{
	    //if (event.getDamager() instanceof Player){
	    //	event.setCancelled(true);
	   // }
	    
	    if (p.hasPermission("leftclick.bypass") || p.hasPermission("leftclick.*")){
	    	
	    }
	    
	    else {
	    	event.setCancelled(true);
	    }
	}
	
	@EventHandler //Detects if player is breaking blocks
	public void onBlockBreak(BlockBreakEvent ev1) {
		
       if (p.hasPermission("leftclick.bypass") || p.hasPermission("leftclick.*")){
	    	
	    }
       
       
       else {
		ev1.setCancelled(true);
       }
    }
	
}



