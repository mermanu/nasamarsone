/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers.movements;

import com.nasa.marsrovers.MarsRover;

/**
 * RoverMovement interface
 *
 * @author manuelmerida
 */
public interface RoverMovement {

    /**
     * Execute the movement of rover
     *
     * @param rover
     */
    public void execute(MarsRover rover);
}
