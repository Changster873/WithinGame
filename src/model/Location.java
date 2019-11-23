package model;

public class Location {

    /**
     * x and y values of the object on the map
     */
    public int x;
    public int y;
    private int content; // what object is at this location

    /**
     * To estimate the whereabouts of objects.
     * @param x on the horizontal axis
     * @param y on the vertical axis
     */
    public Location (int x, int y) {
        this.x = x;
        this.y = y;
        this.content = 0; // initialise to store this to prevent unexpected behaviour
    }

    /**
     * Get whatever is stored in this location
     * @return
     */
    public int getContent() {
        return this.content;
    }

    /**
     * Set this location to hold something
     * @param content being the new object
     */
    public void setContent(int content) {
        this.content = content;
    }

    /**
     * With the state of the location, determine whether player can move here.
     * @return decision of whether player can move here
     */
    public boolean canMoveTo() {
        // if the location is not grass or pathway, then cannot move here
        if (this.content != WorldObject.PATH.ordinal() || this.content != WorldObject.GRASS.ordinal()) {
            return false;
        }
        else {
            return true;
        }
    }
}
