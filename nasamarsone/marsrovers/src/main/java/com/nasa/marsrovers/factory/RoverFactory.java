/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers.factory;

import com.nasa.marsrovers.MarsRover;
import com.nasa.marsrovers.RoverOne;

/**
 * Rover factory, make a rover instance
 *
 * @author manuelmerida
 */
public class RoverFactory {

    /**
     * Get a rover Instance by type
     *
     * @param input Input string with the position and orders to the rover
     * movements to do
     * @param rover Type of rover to be created
     * @return MarsRover
     */
    public static MarsRover getRover(String input, RoverType rover) {
        MarsRover marsRover = null;
        switch (rover) {
            case ROVER_ONE:
                marsRover = new RoverOne(input);
                break;
            default:
                break;
        }
        return marsRover;
    }
}
