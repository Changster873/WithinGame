package model;

import java.util.ArrayList;
import java.util.List;

public class Map {

    /**
     * Player to move around on this map.
     */
    private Player player;

    /**
     * 2 Dimensional map that stores object encodings.
     */
    private int[][] map;

    /**
     * Stores all locations of this map.
     */
    private List<Location> locations;

    /**
     * New map created needs to have its width and height specified.
     * Once the map is loaded in, have all locations set to their object encodings.
     * @param m 2d array of the object encodings in the map
     * @param p player to move around on this map
     */
    public Map(int[][] m, Player p) {

        // store player
        this.player = p;

        // initialise locations array
        this.locations = new ArrayList<Location>();

        // load the map in
        this.map = m;

        // set all locations to have their object encodings
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++) {
                Location c = new Location(i,j);
                c.setContent(m[i][j]);
                this.locations.add(c);
            }
        }
    }

    /**
     * Retrieve the locations of this map.
     * @return
     */
    public List<Location> getLocations() {
        return this.locations;
    }

    public int[][] getMap() {
        return this.map;
    }
}
