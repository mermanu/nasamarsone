/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi.positioning;

import com.nasa.marsapi.Constants;

/**
 * Direction handler implementation
 *
 * @author manuelmerida
 */
public class Direction {

    public char facing;

    public Direction(char facing) {
        this.facing = facing;
    }

    /**
     * Turn the rover to his actual left side
     */
    public void toLeft() {
        switch (facing) {
            case Constants.NORTH:
                facing = Constants.WEST;
                break;
            case Constants.SOUTH:
                facing = Constants.EAST;
                break;
            case Constants.WEST:
                facing = Constants.SOUTH;
                break;
            case Constants.EAST:
                facing = Constants.NORTH;
                break;
        }
    }

    /**
     * Turn the rover to his actual right side
     */
    public void toRight() {
        switch (facing) {
            case Constants.NORTH:
                facing = Constants.EAST;
                break;
            case Constants.SOUTH:
                facing = Constants.WEST;
                break;
            case Constants.WEST:
                facing = Constants.NORTH;
                break;
            case Constants.EAST:
                facing = Constants.SOUTH;
                break;
        }
    }
}
