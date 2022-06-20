package dev.wvandyk.sharedamage.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import dev.wvandyk.sharedamage.Main;
import dev.wvandyk.sharedamage.utils.Variables;
import net.md_5.bungee.api.ChatColor;

public class Cause implements Listener {

    private Main plugin;

    public Cause(Main plugin) {
        this.plugin = plugin;
        Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerDamageEvent(EntityDamageEvent event) {

        Variables variables = plugin.getVariables();

        if (event.getEntity() instanceof Player && variables.getShowCause() == true) {

            Bukkit.getServer().broadcastMessage(ChatColor.RED + String.valueOf(event.getCause()));

        }
    }
}
