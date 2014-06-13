/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers.movements;

import com.nasa.marsrovers.MarsRover;

/**
 * Turn the rover to the right 90 degrees
 *
 * @author manuelmerida
 */
public class TurnRight implements RoverMovement {

    public void execute(MarsRover rover) {
        rover.getRoverPosition().getDirection().toRight();
    }
}
