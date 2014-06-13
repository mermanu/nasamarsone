/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers.movements;

import com.nasa.marsapi.Constants;
import com.nasa.marsrovers.MarsRover;
import com.nasa.marsrovers.RoverPosition;

/**
 * The rover moves a point in the current direction
 *
 * @author manuelmerida
 */
public class MovePosition implements RoverMovement {

    public void execute(MarsRover rover) {
        RoverPosition roverPosition = rover.getRoverPosition();
        switch (roverPosition.getDirection().facing) {
            case Constants.NORTH:
                roverPosition.moveN();
                break;
            case Constants.SOUTH:
                roverPosition.moveS();
                break;
            case Constants.EAST:
                roverPosition.moveE();
                break;
            case Constants.WEST:
                roverPosition.moveW();
                break;
            default:
                break;
        }
    }
}