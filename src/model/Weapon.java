package model;

public interface Weapon {

    /**
     * Damage this weapon can deal to opponents.
     * @return
     */
    double getDamage();

    /**
     * Upgrade this weapon to become better.
     * @param d is the new damage to deal to opponents.
     */
    void upgrade(double d);
}
