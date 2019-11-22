package model;

public class Stick implements Weapon {

    private double damage;

    public Stick() {
        this.damage = 10;
    }

    /**
     * Get the damage amount dealt by the stick.
     * @return
     */
    @Override
    public double getDamage() {
        return this.damage;
    }

    /**
     * Upgrade stick to be more effective.
     * @param d is the new damage to deal to opponents.
     */
    @Override
    public void upgrade(double d) {
        this.damage = d;
    }
}
