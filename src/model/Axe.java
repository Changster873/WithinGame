package model;

public class Axe implements Weapon {

    private double damage;

    public Axe() {
        this.damage = 20;
    }

    /**
     * Get the damage amount dealt by the axe.
     * @return
     */
    @Override
    public double getDamage() {
        return this.damage;
    }

    /**
     * Upgrade axe to be more effective.
     * @param d is the new damage to deal to opponents.
     */
    @Override
    public void upgrade(double d) {
        this.damage = d;
    }
}
