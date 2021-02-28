package com.company.Events;

import com.company.Main;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import java.util.Random;

public class CreatureSpawn implements Listener {
    private Main plugin;

    public CreatureSpawn(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onCreatureSpawn(EntitySpawnEvent e) {
        Entity mob = e.getEntity();
        Random r = new Random();
        int y = r.nextInt(7) + 1;
        String type = "";
        if(y==1) {
            type = " "; //Explode
        }
        else if (y==2){
            type = "  "; //Lift
        }
        else if (y==3){
            type = "   "; //Jump
        }
        else if (y==4){
            type = "    "; //Health
        }
        else if (y==5){
            type = "     "; // Fast
        }
        else if (y==6){
            type = "      "; // Leech
        }
        else if (y==7){
            type = "       "; // Clone
        }

        checkMob(mob, type);
    }

    public void checkMob(Entity e, String zombieType) {
        boolean visible = false;
        if(e instanceof Creeper) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();

            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof CaveSpider) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Drowned) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Piglin) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Husk) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof PiglinBrute) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof WitherSkeleton) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Stray) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Skeleton) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Spider) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Ghast) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Witch) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof ZombieVillager) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Strider) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Hoglin) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof MagmaCube) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Phantom) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Slime) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof PigZombie) {
            Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
            e.remove();
            Zombie.setCustomName(zombieType);
            Zombie.setCustomNameVisible(visible);
            ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 1));
            if(zombieType.equals("     ")) {
                ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }
        else if(e instanceof Zombie) {
            e.setCustomName(zombieType);
            e.setCustomNameVisible(visible);
            if(zombieType.equals("     ")) {
                ((LivingEntity) e).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
            }
            else if(zombieType.equals("    ")) {
                AttributeInstance attribute = ((LivingEntity) e).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                attribute.setBaseValue(50.0D);
            }
        }

        if(e instanceof Enderman && e.getWorld().getEnvironment().equals(World.Environment.THE_END)) {
            Random r = new Random();
            int y = r.nextInt(2) + 1;
            if(y == 1) {
                Entity Zombie = e.getWorld().spawnEntity(e.getLocation(), EntityType.ZOMBIE);
                e.remove();
                Zombie.setCustomName(zombieType);
                Zombie.setCustomNameVisible(visible);
                if(zombieType.equals("     ")) {
                    ((LivingEntity) Zombie).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
                }
                else if(zombieType.equals("    ")) {
                    AttributeInstance attribute = ((LivingEntity) Zombie).getAttribute(Attribute.GENERIC_MAX_HEALTH);
                    attribute.setBaseValue(50.0D);
                }
            }
        }
    }
}
