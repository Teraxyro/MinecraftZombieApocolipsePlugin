package com.company.Events;

import com.company.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Objects;
import java.util.Random;

public class EntityDeath implements Listener {

    private Main plugin;

    public EntityDeath(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void OnEntityDeath(EntityDeathEvent event){

        Entity damageTaker = event.getEntity();
        Random r = new Random();
        if(damageTaker instanceof Zombie){
            if(Objects.equals(damageTaker.getCustomName(), "       ")) {
                int y = r.nextInt(7) + 1;
                Entity Zombie = damageTaker.getWorld().spawnEntity(damageTaker.getLocation(), EntityType.ZOMBIE);
                Entity Zombie2 = damageTaker.getWorld().spawnEntity(damageTaker.getLocation(), EntityType.ZOMBIE);
                damageTaker.remove();
                String type = "";
                if(y==1) {
                    type = " ";
                }
                else if (y==2){
                    type = "  ";
                }
                else if (y==3){
                    type = "   ";
                }
                else if (y==4){
                    type = "    ";
                }
                else if (y==5){
                    type = "     ";
                }
                else if (y==6){
                    type = "      ";
                }
                else if (y==7){
                    type = "       ";
                }
                Zombie.setCustomName(type);
                Zombie.setCustomNameVisible(false);

                Zombie2.setCustomName(type);
                Zombie2.setCustomNameVisible(false);
            }
        }
    }
}
