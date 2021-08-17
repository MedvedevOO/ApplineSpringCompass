package ru.appline.logic;

public class Compass {

    /*
    {
    "North": [337,23],
    "North-East": [23,68],
    "East":  [68,113],
    "South-East: [113,158],
    "South": [158,203],
    "South-West": [203,248],
    "West": [248,293],
    "North-West": [293,337]
    }
     */

    private int[] north;
    private int[] northEast;
    private int[] east;
    private int[] southEast;
    private int[] south;
    private int[] southWest;
    private int[] west;
    private int[] northWest;

    public Compass() {
        super();
    }

    public Compass(int[] north, int[] northEast, int[] east, int[] southEast, int[] south, int[] southWest, int[] west, int[] northWest) {
        this.north = north;
        this.northEast = northEast;
        this.east = east;
        this.southEast = southEast;
        this.south = south;
        this.southWest = southWest;
        this.west = west;
        this.northWest = northWest;
    }

    public int[] getNorth() {
        return north;
    }

    public void setNorth(int[] north) {
        this.north = north;
    }

    public int[] getNorthEast() {
        return northEast;
    }

    public void setNorthEast(int[] northEast) {
        this.northEast = northEast;
    }

    public int[] getEast() {
        return east;
    }

    public void setEast(int[] east) {
        this.east = east;
    }

    public int[] getSouthEast() {
        return southEast;
    }

    public void setSouthEast(int[] southEast) {
        this.southEast = southEast;
    }

    public int[] getSouth() {
        return south;
    }

    public void setSouth(int[] south) {
        this.south = south;
    }

    public int[] getSouthWest() {
        return southWest;
    }

    public void setSouthWest(int[] southWest) {
        this.southWest = southWest;
    }

    public int[] getWest() {
        return west;
    }

    public void setWest(int[] west) {
        this.west = west;
    }

    public int[] getNorthWest() {
        return northWest;
    }

    public void setNorthWest(int[] northWest) {
        this.northWest = northWest;
    }
}
