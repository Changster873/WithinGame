package model;

public class Sword implements Weapon {

    private double damage;

    public Sword() {
        this.damage = 30;
    }

    /**
     * Get the damage amount dealt by the sword.
     * @return
     */
    @Override
    public double getDamage() {
        return this.damage;
    }

    /**
     * Upgrade sword to be more effective.
     * @param d is the new damage to deal to opponents.
     */
    @Override
    public void upgrade(double d) {
        this.damage = d;
    }
}
