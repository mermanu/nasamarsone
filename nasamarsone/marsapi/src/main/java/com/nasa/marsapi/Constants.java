/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi;

import com.nasa.marsapi.positioning.Position;

/**
 *
 * @author manuelmerida
 */
public class Constants {
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    public static final char MOVE = 'M';
    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final char EAST = 'E';
    public static final char WEST = 'W';
    public static final Position SOUTH_SQUARE = new Position(0, 0);
    public static final String BASE_INPUT = "comunications/BASE_INPUT.co";
    public static final String BASE_OUTPUT = "comunications/BASE_OUTPUT.co";
    public static final String ROVER_INPUT = "comunications/ROVER_INPUT.co";
    public static final String ROVER_OUTPUT = "comunications/ROVER_OUTPUT.co";
    public static final String NASA_INPUT = "comunications/NASA_INPUT.co";
    public static final String NASA_OUTPUT = "comunications/NASA_OUTPUT.co";
}
