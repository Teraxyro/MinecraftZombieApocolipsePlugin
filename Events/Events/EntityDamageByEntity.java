package com.company.Events;

import com.company.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.Objects;

public class EntityDamageByEntity implements Listener {

    private Main plugin;

    public EntityDamageByEntity(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void OnEntityDamageByEntity(EntityDamageByEntityEvent event){

        Entity damageTaker = event.getEntity();
        Entity zombie = event.getDamager();

        if(damageTaker instanceof Player && zombie instanceof Zombie){
            if(Objects.equals(zombie.getCustomName(), "      "))
                damageTaker.addPassenger(zombie);
            else if(Objects.equals(zombie.getCustomName(), "  ")) {
                final int[] g = {0};
                int playerIndex = 0;
                for(int i = 0; i < playerJoinListener.pInfoList.size(); i++) {
                    if(playerJoinListener.pInfoList.get(i).getName().equals(damageTaker.getName())) {
                        playerIndex = i;
                    }
                }
                if(!playerJoinListener.pInfoList.get(playerIndex).isThrown()) {
                    playerJoinListener.pInfoList.get(playerIndex).setThrown(true);
                    int finalPlayerIndex = playerIndex;
                    new BukkitRunnable() {
                        public void run() {
                            if (g[0] == 0) {
                                zombie.addPassenger(damageTaker);
                                g[0]++;
                            } else if (g[0] == 1) {
                                System.out.println("--------------------------------I am being launched-----------------------------------------");
                                Vector dir = zombie.getLocation().getDirection();
                                zombie.removePassenger(damageTaker);
                                dir.setY(0.5);
                                damageTaker.setVelocity(dir.multiply(2));
                                playerJoinListener.pInfoList.get(finalPlayerIndex).setThrown(false);
                                this.cancel();
                            }
                        }
                    }.runTaskTimer(plugin, 0, 20);
                }
            }
        }
    }
}
