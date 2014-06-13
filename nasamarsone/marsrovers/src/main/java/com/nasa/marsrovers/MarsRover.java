/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers;

import com.nasa.marsapi.AreaToExplore;

/**
 *
 * @author manuelmerida
 */
public interface MarsRover {

    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    public static final char MOVE = 'M';

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
     * @param input 
     */
    public void setInput(String input);

    /**
     * Get the output string of rover, the rover order need to be executed previously
     * @return String with position
     */
    public String getOutput();

    /**
     * Turn the rover to the left 90 degrees
     */
    public void turnLeft();

    /**
     * Turn the rover to the right 90 degrees
     */
    public void turnRight();

    /**
     * The rover moves a point in the current direction
     */
    public void movePosition();
    
    /**
     * Test if is possible the input orders and itinerary for the area to explore, 
     * looking for some collision in the itinerary
     * @param AreaToExplore object to be scanned
     * @return boolean
     */
    public boolean isPossibleItinerary(AreaToExplore area);
}
