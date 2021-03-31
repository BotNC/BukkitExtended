package botnc.bukkitextended;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

/**
 * The ExtendedLocation class.<br>
 * Contains functions such as <code>up</code>, <code>down</code>, etc...
 * 
 * @author BotNC
 */
public class ExtendedLocation extends Location {

    public ExtendedLocation(World world, double x, double y, double z) {
        super(world, x, y, z);
    }

    /**
     * Gets the <code>Location</code> one block above this location.
     * 
     * @return  The new <code>Location</code>.
     */
    public Location up() {
        return new Location(getWorld(), getX(), getY() + 1, getZ());
    }

    /**
     * Gets the <code>ExtendedLocation</code> one block above this location.
     * 
     * @return  The new <code>ExtendedLocation</code>.
     */
    public ExtendedLocation extendedLocationUp() {
        return new ExtendedLocation(getWorld(), getX(), getY() + 1, getZ());
    }

    /**
     * Gets the <code>Location</code> one block below this location.
     * 
     * @return  The new <code>Location</code>.
     */
    public Location down() {
        return new Location(getWorld(), getX(), getY() - 1, getZ());
    }

    /**
     * Gets the <code>ExtendedLocation</code> one block below this location.
     * 
     * @return  The new <code>ExtendedLocation</code>.
     */
    public ExtendedLocation extendedLocationDown() {
        return new ExtendedLocation(getWorld(), getX(), getY() - 1, getZ());
    }

    /**
     * Gets the <code>Location</code> one block to the left from this location.
     * 
     * @return  The new <code>Location</code>.
     */
    public Location left() {
        return new Location(getWorld(), getX() - 1, getY(), getZ());
    }

    /**
     * Gets the <code>ExtendedLocation</code> one block to the left from this location.
     * 
     * @return  The new <code>ExtendedLocation</code>.
     */
    public ExtendedLocation extendedLocationLeft() {
        return new ExtendedLocation(getWorld(), getX() - 1, getY(), getZ());
    }

    /**
     * Gets the <code>Location</code> one block to the right from this location.
     * 
     * @return  The new <code>Location</code>.
     */
    public Location right() {
        return new Location(getWorld(), getX() + 1, getY(), getZ());
    }

    /**
     * Gets the <code>ExtendedLocation</code> one block to the right from this location.
     * 
     * @return  The new <code>ExtendedLocation</code>.
     */
    public ExtendedLocation extendedLocationRight() {
        return new ExtendedLocation(getWorld(), getX(), getY() + 1, getZ());
    }

    /**
     * Finds all the living entities in a specified range.<br>
     * This function finds entities around this current <code>Location</code>
     * 
     * @param range  The range (in blocks).
     * @return       An <code>ArrayList</code> of LivingEntities.
     */
    public ArrayList<LivingEntity> findLivingEntitiesInRange(float range) {
        ArrayList<LivingEntity> livingEntitiesInRange = new ArrayList<LivingEntity>();

        for (Entity entity : getWorld().getEntities()) {
            if (entity instanceof LivingEntity) {
                if (entity.getLocation().distance(this) <= range) {
                    LivingEntity le = (LivingEntity)entity;
                    livingEntitiesInRange.add(le);
                }
            }
        }

        return livingEntitiesInRange;
    }

}