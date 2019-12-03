package me.kyrobi.noleftclick;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

	   @Override 
	   public void onEnable(){
		   System.out.println("[Plugin] NoLeftClick is enabled!");
		   new Events(this);
	   }
}