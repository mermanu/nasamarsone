/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers.movements;

import com.nasa.marsrovers.MarsRover;

/**
 *
 * @author manuelmerida
 */
public interface RoverMovement {
    /**
     *
     * @param rover
     */
    public void execute(MarsRover rover);
}
