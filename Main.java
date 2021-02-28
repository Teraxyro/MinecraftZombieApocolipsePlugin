package com.company;
import com.company.Events.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import java.util.Random;

public class Main extends JavaPlugin{

    @Override
    public void onEnable() {

        new playerJoinListener(this);
        new CreatureSpawn(this);
        new EntityDamage(this);
        new EntityDamageByEntity(this);
        new EntityDeath(this);
        new EntityTargetLivingEntity(this);

        new BukkitRunnable() {
            public void run() {
                if(Bukkit.getServer().getWorld("world").getTime() >= 21500L || Bukkit.getServer().getWorld("world").getTime() < 16000L) {
                    Bukkit.getServer().getWorld("world").setTime(16000L);
                }
            }
        }.runTaskTimer(this, 600L, 600L);

        new BukkitRunnable() {
            public void run() {
                Player McDumplin = Bukkit.getPlayer("McDumplin");
                Player Legendile = Bukkit.getPlayer("Legendile");



                for(Entity e : Bukkit.getServer().getWorld("world").getEntities()) {
                    if(e instanceof Zombie) {
                        boolean distant = true;
                        if(McDumplin != null) {
                            if (e.getLocation().distance(McDumplin.getLocation()) < 100) {
                                distant = false;
                                break;
                            }
                        }
                        if(Legendile != null) {
                            if (e.getLocation().distance(Legendile.getLocation()) < 100) {
                                distant = false;
                                break;
                            }
                        }
                        if(distant) {
                            e.remove();
                        }
                    }
                }
            }
        }.runTaskTimer(this, 0, 1800);

    }

    public static void main(String[] args) {

    }


}
