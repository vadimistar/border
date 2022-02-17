package com.gmail.vadimistar.Border;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;

public class BorderCommandExecutor implements org.bukkit.command.CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Entity) {
            //Border border = new Border(((Entity) sender).getWorld());
            //border.run();
            return true;
        }
        System.err.println("Can not execute /border from console.");
        return false;
    }
}
