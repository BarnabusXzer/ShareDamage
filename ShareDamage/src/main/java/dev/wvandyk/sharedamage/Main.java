package dev.wvandyk.sharedamage;

import org.bukkit.plugin.java.JavaPlugin;

import dev.wvandyk.sharedamage.commands.ShareDamage;
import dev.wvandyk.sharedamage.commands.ShowCause;
import dev.wvandyk.sharedamage.listeners.Cause;
import dev.wvandyk.sharedamage.listeners.EqualDamage;
import dev.wvandyk.sharedamage.listeners.InverseDamage;
import dev.wvandyk.sharedamage.listeners.SplitDamage;
import dev.wvandyk.sharedamage.utils.Variables;

public class Main extends JavaPlugin {

    Variables variables = new Variables();

    @Override
    public void onEnable() {

        new ShareDamage(this);
        new ShowCause(this);

        new Cause(this);
        new EqualDamage(this);
        new InverseDamage(this);
        new SplitDamage(this);
    }

    @Override
    public void onDisable() {
    }

    public Variables getVariables() {
        return this.variables;
    }

}
