package dev.wvandyk.sharedamage.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import dev.wvandyk.sharedamage.Main;
import dev.wvandyk.sharedamage.utils.Variables;
import net.md_5.bungee.api.ChatColor;

public class ShowCause implements CommandExecutor {

    private Main plugin;

    public ShowCause(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginCommand("showcause").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Variables variables = plugin.getVariables();

        if (args.length == 0) {
            sender.sendMessage(plugin.getCommand("showcause").getUsage());
        } else {
            if (args[0].equalsIgnoreCase("on")) {
                variables.setShowCause(true);
                Bukkit.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "Damage Causes Will Be Shown");
            } else {
                variables.setShowCause(false);
                Bukkit.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "Damage Causes Will Not Be Shown");
            }
        }
        return true;
    }
}