/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi.marsareas;

import com.nasa.marsapi.positioning.Position;

/**
 *
 * @author manuelmerida
 */
public interface AreaToExplore {
    
    /**
     *
     * @param position
     * @return
     */
    public Position getNorthSquare(Position position);
    public boolean isPossibleMovement(Position roverMovement);
    
}
