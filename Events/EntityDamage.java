package com.company.Events;

import com.company.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Objects;

public class EntityDamage implements Listener {

    private Main plugin;

    public EntityDamage(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void OnEntityDamageByEntity(EntityDamageEvent event){

        Entity damageTaker = event.getEntity();

        if(damageTaker instanceof Zombie){
            if(Objects.equals(damageTaker.getCustomName(), " "))
                damageTaker.getWorld().createExplosion(damageTaker.getLocation(), 3F, false, true);
        }
    }
}
