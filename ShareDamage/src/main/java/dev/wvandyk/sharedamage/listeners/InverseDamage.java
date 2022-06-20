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

public class InverseDamage implements Listener {

    private Main plugin;

    public InverseDamage(Main plugin) {
        this.plugin = plugin;
        Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerDamageEvent(EntityDamageEvent event) {

        if (event.getEntity() instanceof Player && event.getCause() != DamageCause.CUSTOM) {

            Variables variables = plugin.getVariables();

            boolean status = variables.getStatus();
            String difficulty = variables.getDifficulty();
            String mode = variables.getMode();

            Player eventPlayer = Bukkit.getPlayer(event.getEntity().getName());

            if (status == true && mode.equals("inverse")) {

                double damage = event.getFinalDamage();

                if (difficulty == "easy") {
                    damage = (damage / 4);
                }
                if (difficulty == "medium") {
                    damage = (damage / 2);
                }
                if (difficulty == "intermediate") {
                    damage = (damage * 3 / 4);
                }
                if (difficulty == "normal") {
                    damage = damage * 1;
                }
                if (difficulty == "hard") {
                    damage = (damage * 3 / 2);
                }
                if (difficulty == "insane") {
                    damage = (damage * 2);
                }

                List<Player> onlinePlayers = new ArrayList<>(Bukkit.getOnlinePlayers());

                for (int i = 0; i < onlinePlayers.size(); i++) {

                    Player player = onlinePlayers.get(i);

                    if (player == eventPlayer) {
                        event.setDamage(0);
                    } else {
                        player.damage(damage);
                    }

                }

            }

        }

    }

}
