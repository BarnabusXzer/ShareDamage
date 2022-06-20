package dev.wvandyk.sharedamage.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import dev.wvandyk.sharedamage.Main;
import dev.wvandyk.sharedamage.utils.Variables;
import net.md_5.bungee.api.ChatColor;

public class ShareDamage implements CommandExecutor {

    private Main plugin;

    public ShareDamage(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginCommand("sharedamage").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Variables variables = plugin.getVariables();

        if (args.length == 0 || args.length > 3) {
            sender.sendMessage(plugin.getCommand("sharedamage").getUsage());
        }

        if (args.length >= 2) {
            String mode = args[1].toLowerCase();
            if (!(mode.equals("equal")) && !(mode.equals("split")) && !(mode.equals("inverse"))) {
                sender.sendMessage(plugin.getCommand("sharedamage").getUsage());
                variables.setMode("equal");
            } else {
                if (mode.equals("equal")) {
                    variables.setMode("equal");
                }
                if (mode.equals("split")) {
                    variables.setMode("split");
                }
                if (mode.equals("inverse")) {
                    variables.setMode("inverse");
                }
            }
        }

        if (args.length == 3) {
            String difficulty = args[2].toLowerCase();
            if (!(difficulty.equals("easy")) && !(difficulty.equals("medium")) && !(difficulty.equals("intermediate")) && !(difficulty.equals("normal"))
                    && !(difficulty.equals("hard")) && !(difficulty.equals("insane"))) {
                sender.sendMessage(plugin.getCommand("sharedamage").getUsage());
                variables.setDifficulty("normal");
            } else {
                if (difficulty.equals("easy")) {
                    variables.setDifficulty("easy");
                }
                if (difficulty.equals("medium")) {
                    variables.setDifficulty("medium");
                }
                if (difficulty.equals("intermediate")) {
                    variables.setDifficulty("intermediate");
                }
                if (difficulty.equals("normal")) {
                    variables.setDifficulty("normal");
                }
                if (difficulty.equals("hard")) {
                    variables.setDifficulty("hard");
                }
                if (difficulty.equals("insane")) {
                    variables.setDifficulty("insane");
                }
            }
        }

        if (args.length >= 1) {
            String status = args[0].toLowerCase();
            if (!(status.equals("on")) && !(status.equals("off"))) {
                sender.sendMessage(plugin.getCommand("sharedamage").getUsage());
            } else {
                if (status.equals("on")) {

                    variables.setStatus(true);

                    if (args.length == 1) {
                        variables.setMode("equal");
                        variables.setDifficulty("normal");
                    }
                    if (args.length == 2) {
                        variables.setDifficulty("normal");
                    }

                    Bukkit.getServer().broadcastMessage(
                            ChatColor.LIGHT_PURPLE + "Shared-Damage Has Been Enabled" + ChatColor.RESET);
                    Bukkit.getServer().broadcastMessage(
                            ChatColor.BOLD + (ChatColor.LIGHT_PURPLE + "Good Luck!") + ChatColor.RESET);
                    Bukkit.getServer().broadcastMessage("        ");
                    Bukkit.getServer()
                            .broadcastMessage(
                                    ChatColor.LIGHT_PURPLE + "Mode: " + variables.getMode() + ChatColor.RESET);
                    Bukkit.getServer().broadcastMessage(
                            ChatColor.LIGHT_PURPLE + "Difficulty: " + variables.getDifficulty() + ChatColor.RESET);

                } else {
                    variables.clearAll();
                    Bukkit.getServer().broadcastMessage(
                            ChatColor.LIGHT_PURPLE + "Shared-Damage Has Been Disabled" + ChatColor.RESET);
                }
            }
        }
        return true;
    }
}