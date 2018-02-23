package me.zackpollard.mobpay;

import java.util.logging.Logger;

import net.milkbowl.vault.economy.EconomyResponse;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeathListener implements Listener{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	MobPay plugin;
	
	public EntityDeathListener(MobPay plugin) {
		this.plugin = plugin;
		Bukkit.getServer().getPluginManager().registerEvents(this,plugin);
	}
	@EventHandler
	public void onEntityDeath(EntityDeathEvent event){
		Player killer = event.getEntity().getKiller();
		String entity = (event.getEntityType().getName().toLowerCase());
		if(killer == null)return;
		//if(!killer.hasPermission("mobpay.pay"))return;
		if(event.getEntityType() == EntityType.BLAZE){                                                                   
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Blaze"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " + plugin.getConfig().getLong("MobPay.Blaze") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.CAVE_SPIDER){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.CaveSpider"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.CaveSpider") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.CREEPER){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Creeper"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Creeper") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.ENDERMAN){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Enderman"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Enderman") + " for killing an " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.ENDER_DRAGON){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.EnderDragon"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.EnderDragon") + " for killing an " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.GHAST){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Ghast"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Ghast") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.MAGMA_CUBE){
			if(event.getEntity() instanceof Slime){
				Slime slime = (Slime) event.getEntity();
				if(slime.getSize() == 1){
					EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.MagmaCube"));
					if(r.transactionSuccess()){
						killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.MagmaCube") + " for killing a " + entity);
		            } else {
		                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
		            }
				}
			}
		}
		if(event.getEntityType() == EntityType.SILVERFISH){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Silverfish"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Silverfish") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.SKELETON){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Skeleton"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Skeleton") + " for killing an " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.SLIME){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Slime"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Slime") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.SPIDER){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Spider"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Spider") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.VILLAGER){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Villager"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Villager") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.WOLF && ((Wolf) event.getEntity()).isTamed() == false){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Wolf"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Wolf") + " for killing an " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.ZOMBIE){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.Zombie"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.Zombie") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
		if(event.getEntityType() == EntityType.PIG_ZOMBIE){
			EconomyResponse r = MobPay.econ.depositPlayer(killer.getName(), plugin.getConfig().getLong("MobPay.ZombiePigman"));
			if(r.transactionSuccess()){
				killer.sendMessage(ChatColor.RED + "[MobPay] " + ChatColor.YELLOW + "You have recieved " +  plugin.getConfig().getLong("MobPay.ZombiePigman") + " for killing a " + entity);
            } else {
                killer.sendMessage(String.format("An error occured: %s", r.errorMessage));
            }
		}
	}
}