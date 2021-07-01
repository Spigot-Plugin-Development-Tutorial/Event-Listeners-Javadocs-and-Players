package me.kodysimpson.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Events extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The plugin is starting up.");

        //Register all of your listeners that exist in this class
        getServer().getPluginManager().registerEvents(this, this);
    }

    //Javadocs where you can find a list of all the events that can be listened to:
    //https://hub.spigotmc.org/javadocs/spigot/

    //Listener that is run when a PlayerJoinEvent is triggered.
    @EventHandler
    public void onJoinEvent(PlayerJoinEvent event){

        //set a custom join message
        event.setJoinMessage("Yo momma has joined the server. Ooooooo.");

    }

    //another event for when a player leaves a bed
    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){

        //Get the player associated with this event
        Player player = event.getPlayer();
        //send them a message so we know it works
        player.sendMessage("You left a bed!!! Dork.");

    }

}
