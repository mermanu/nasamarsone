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
public class TurnLeft implements RoverMovement{

    public void execute(MarsRover rover) {
        rover.turnLeft();
    }
}
