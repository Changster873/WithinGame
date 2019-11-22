package model;

public class Location {

    /**
     * x and y values of the object on the map
     */
    public int x;
    public int y;

    /**
     * To estimate the whereabouts of objects.
     * @param x on the horizontal axis
     * @param y on the vertical axis
     */
    public Location (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
