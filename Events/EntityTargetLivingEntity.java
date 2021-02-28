package com.company.Events;

import com.company.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.Objects;

public class EntityTargetLivingEntity implements Listener {

    private Main plugin;

    public EntityTargetLivingEntity(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void OnEntityTargetEntity(EntityTargetLivingEntityEvent event){
        Entity zombie = event.getEntity();
        new BukkitRunnable() {
            public void run() {
                if(Objects.equals(zombie.getCustomName(), "   ")) {
                    if(event.getTarget() != null) {
                        Vector dir = zombie.getLocation().getDirection();
                        dir.setY(0.6);
                        zombie.setVelocity(dir);
                    }
                    else {
                        this.cancel();
                    }
                }
            }
        }.runTaskTimer(plugin, 0, 60);

    }
}
