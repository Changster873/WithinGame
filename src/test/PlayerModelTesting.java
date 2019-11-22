package test;

import model.Location;
import model.Player;
import model.Stick;
import model.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerModelTesting {

    /**
     * To be used in this whole test suite.
     */
    Player p;

    /**
     * Creates new instance of player.
     */
    public void resetPlayer() {
        this.p = new Player("Sam", new Location(0,0), new Stick());
    }

    @Test
    public void playerCreation() {
        // testing initiation
        this.resetPlayer();
        // creation of player is successful
        assert p != null;
        // appropriate location set
        assert p.getLocation().x == 0 && p.getLocation().y == 0;
        // right name
        assertEquals("Sam", p.getName());
        // level starts off at 1
        assertEquals(1, p.getLevel());
        // health at right amount
        assert p.getHealth() == 100;
        // should have weapon
        assert p.getWeapon() instanceof Weapon;
    }

    @Test
    public void weaponUsage() {
        // testing initiation
        this.resetPlayer();
        // upgrade weapon
        p.getWeapon().upgrade(20);
        // check if weapon now deals 20 damage
        assert p.getWeapon().getDamage() == 20;
    }

    @Test
    public void levelingUp() {
        // testing initiation
        this.resetPlayer();
        // level up character
        p.levelUp();
        // now check its functionality
        assert p.getLevel() == 2;
    }

    @Test
    public void healthReset() {
        // testing initiation
        this.resetPlayer();
        // change health of player
        p.setHealth(50);
        // check it
        assert p.getHealth() == 50;
    }

    @Test
    public void nameChange() {
        // testing initiation
        this.resetPlayer();
        // change name
        p.setName("Daniel");
        // did it work?
        assertEquals("Daniel", p.getName());
    }

    @Test
    public void moveAround() {
        // testing initiation
        this.resetPlayer();
        // set new location
        p.setLocation(new Location(1,2));
        // check both x and y
        assert p.getLocation().x == 1;
        assert p.getLocation().y == 2;
    }
}
