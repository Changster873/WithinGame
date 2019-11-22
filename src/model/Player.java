package model;

public class Player {

    /**
     * Properties of the player.
     */
    private String name;
    private int level;
    private double health;
    private Location location;

    /**
     * The player of the game upon creation.
     * @param name name of the player
     */
    public Player(String name, Location loc) {
        this.name = name;
        this.level = 1;
        this.health = 100;
        this.location = loc;
    }

    /**
     * Retrieves the current location of the player.
     * @return current location of player
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * Sets the player to be at a new location.
     * @param loc the new spot
     */
    public void setLocation(Location loc) {
        this.location = loc;
    }

    /**
     * Level up the player by 1 level.
     */
    public void levelUp() {
        this.level++;
    }

    /**
     * Returns health of player.
     * @return
     */
    public double getHealth() {
        return this.health;
    }

    /**
     * Returns level of player.
     * @return
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Returns name of player.
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the new health amount to the player.
     * @param h new heath bar
     */
    public void setHealth(double h) {
        this.health = h;
    }

    /**
     * Setes the name of the player.
     * @param n the name given by the user
     */
    public void setName(String n) {
        this.name = n;
    }
}
