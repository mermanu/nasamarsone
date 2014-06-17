/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers;

import com.nasa.marsapi.marsareas.AreaToExplore;

/**
 * Mars rovers interface with elemental methods to be 
 * implemented by specifics models of rovers
 * 
 * @author manuelmerida
 */
public interface MarsRover {

    /**
     * Is at charge of execute the input instructions. Return the final position
     * as string with the format (X Y DIRECTION)
     *
     * @return String
     * @throws Exception
     */
    public String executeOrders() throws Exception;

    /**
     * Is the rover input with the orders to be executed
     *
     * @param input
     */
    public void setInput(String input);

    /**
     * Get the output string of rover, the rover order need to be executed
     * previously
     *
     * @return String with position
     */
    public String getOutput();

    /**
     * Get the RoverPosition with Position, Direction attributes
     *
     * @return RoverPosition
     */
    public RoverPosition getRoverPosition();

    /**
     * Test if is possible the input orders and itinerary for the area to
     * explore, looking for some collision in the itinerary
     *
     * @param AreaToExplore object to be scanned
     * @return boolean
     */
    public boolean isPossibleItinerary(AreaToExplore area);
}
