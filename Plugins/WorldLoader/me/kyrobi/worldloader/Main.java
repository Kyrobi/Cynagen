package me.kyrobi.worldloader;

import org.bukkit.plugin.java.*;
import org.bukkit.*;

public class Main extends JavaPlugin
{
    public void onEnable() {
        System.out.println("[Plugin] WorldLoader is enabled!");
        new WorldCreator("Testworld").createWorld();
    }
}
