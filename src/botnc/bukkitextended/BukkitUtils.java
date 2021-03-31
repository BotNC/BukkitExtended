package botnc.bukkitextended;

import java.util.ArrayList;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

/**
 * The BukkitUtils class.<br>
 * This class serves as a general-purpose utility class.
 * 
 * @author BotNC
 */
public class BukkitUtils {

    /**
     * Finds all the living entities in a specified range.<br>
     * This function finds entities around this current <code>Location</code>
     * 
     * @param mainEntity  The main entity to search around from.
     * @param range       The range (in blocks).
     * @return            An <code>ArrayList</code> of LivingEntities.
     */
    public ArrayList<LivingEntity> findLivingEntitiesInRange(Entity mainEntity, float range) {
        ArrayList<LivingEntity> livingEntitiesInRange = new ArrayList<LivingEntity>();

        for (Entity entity : mainEntity.getWorld().getEntities()) {
            if (entity instanceof LivingEntity) {
                if (entity.getLocation().distance(mainEntity.getLocation()) <= range) {
                    LivingEntity le = (LivingEntity)entity;
                    livingEntitiesInRange.add(le);
                }
            }
        }

        return livingEntitiesInRange;
    }
    
}