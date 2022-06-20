package dev.wvandyk.sharedamage.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import dev.wvandyk.sharedamage.Main;
import dev.wvandyk.sharedamage.utils.Variables;

public class SplitDamage implements Listener {

    private Main plugin;

    public SplitDamage(Main plugin) {
        this.plugin = plugin;
        Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerDamageEvent(EntityDamageEvent event) {

        if (event.getEntity() instanceof Player && event.getCause() != DamageCause.CUSTOM) {

            Variables variables = plugin.getVariables();

            boolean status = variables.getStatus();
            String mode = variables.getMode();

            Player eventPlayer = Bukkit.getPlayer(event.getEntity().getName());

            if (status == true && mode.equals("split")) {

                double damage = event.getFinalDamage();

                List<Player> onlinePlayers = new ArrayList<>(Bukkit.getOnlinePlayers());

                damage = damage / onlinePlayers.size();

                for (int i = 0; i < onlinePlayers.size(); i++) {

                    Player player = onlinePlayers.get(i);

                    if (player == eventPlayer) {
                        event.setDamage(damage);
                    } else {
                        player.damage(damage);
                    }

                }

            }

        }

    }

}
