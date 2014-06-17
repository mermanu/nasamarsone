/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers;

import com.nasa.marsapi.positioning.Direction;
import com.nasa.marsapi.positioning.Position;

/**
 * Represents the position (x, y) in the AreaToExplore and the direction of
 * rover
 *
 * @author manuelmerida
 */
public class RoverPosition extends Position {

    private Direction direction;

    /**
     * Initialize the rover position and direction in the AreaToExplore
     *
     * @param xpos
     * @param ypos
     * @param direction
     */
    public RoverPosition(Integer xpos, Integer ypos, Direction direction) {
        super(xpos, ypos);
        this.direction = direction;
    }

    /**
     * Get the direction of the rover, North/South/East/West
     *
     * @return Direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Set the direction of the rover
     *
     * @param direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Move one estep with North direction
     */
    public void moveN() {
        setYpos(getYpos() + 1);
    }

    /**
     * Move one estep with South direction
     */
    public void moveS() {
        setYpos(getYpos() - 1);
    }

    /**
     * Move one estep with West direction
     */
    public void moveW() {
        setXpos(getXpos() - 1);
    }

    /**
     * Move one estep with East direction
     */
    public void moveE() {
        setXpos(getXpos() + 1);
    }
}
