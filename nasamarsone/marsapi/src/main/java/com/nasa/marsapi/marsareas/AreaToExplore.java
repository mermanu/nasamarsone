/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi.marsareas;

import com.nasa.marsapi.positioning.Position;

/**
 * Area to be explored by the rovers  
 * 
 * @author manuelmerida
 */
public interface AreaToExplore {

    /**
     * Position of the right north square
     *
     * @param position
     * @return
     */
    public Position getNorthSquare(Position position);

    /**
     * Verify if is possible the movement to be taken by the rover, avoiding
     * that this leave the area specified
     *
     * @param roverMovement
     * @return
     */
    public boolean isPossibleMovement(Position roverMovement);
}
