package me.zackpollard.mobpay;

import java.util.logging.Logger;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class MobPay extends JavaPlugin{
	
	private static final Logger log = Logger.getLogger("Minecraft");
	public static Economy econ = null;
	
	public void onEnable(){
		new EntityDeathListener(this);
		
		if (!setupEconomy() ) {
            log.info(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
		
		final FileConfiguration config = this.getConfig();
        config.options().header("Here you can change the amount of money that players will recieve per mob.");
        config.addDefault("MobPay.Blaze", Integer.valueOf(20));
        config.addDefault("MobPay.CaveSpider", Integer.valueOf(20));
        config.addDefault("MobPay.Creeper", Integer.valueOf(20));
        config.addDefault("MobPay.Enderman", Integer.valueOf(20));
        config.addDefault("MobPay.EnderDragon", Integer.valueOf(200));
        config.addDefault("MobPay.Ghast", Integer.valueOf(20));
        config.addDefault("MobPay.MagmaCube", Integer.valueOf(20));
        config.addDefault("MobPay.Silverfish", Integer.valueOf(20));
        config.addDefault("MobPay.Skeleton", Integer.valueOf(20));
        config.addDefault("MobPay.Slime", Integer.valueOf(20));
        config.addDefault("MobPay.Spider", Integer.valueOf(20));
        config.addDefault("MobPay.Villager", Integer.valueOf(20));
        config.addDefault("MobPay.Wolf", Integer.valueOf(20));
        config.addDefault("MobPay.Zombie", Integer.valueOf(20));
        config.addDefault("MobPay.ZombiePigman", Integer.valueOf(20));
		log.info("MobPay Version 0.1 Enabled");
        config.options().copyDefaults(true);
        saveConfig();
	}
	public void onDisable(){
		log.info("MobPay Version 0.1 Disabled");
	}
	private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
}