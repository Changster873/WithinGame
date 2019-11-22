package model;

public class Battle {

    /**
     * Two players of a battle.
     */
    private Player p1, p2;
    private Player victor;

    /**
     * A battle commences with two players attacking each other.
     * @param p1 player one
     * @param p2 their opponent
     */
    public Battle (Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Essence of a battle, dealing damage.
     * @param p is the player to deal damage to
     * @param w is the weapon being used
     */
    public void dealDamage(Player p, Weapon w) {
        // damage dealt by the weapon
        double damage = w.getDamage();

        // reduce the given player's health accordingly
        p.setHealth(p.getHealth()-damage);

        // if the player's health is below 0 threshold, just make it 0
        if (p.getHealth() < 0) {
            p.setHealth(0);
        }
    }

    /**
     * Set a player to be the winner of this battle.
     * @param p is the victor
     */
    public void setVictor(Player p) {
        this.victor = p;
    }

    /**
     * Get the winner of this bout.
     * @return
     */
    public Player getVictor() {
        return this.victor;
    }
}
