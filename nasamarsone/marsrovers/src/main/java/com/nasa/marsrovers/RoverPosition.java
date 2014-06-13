/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers;

import com.nasa.marsapi.Direction;
import com.nasa.marsapi.Position;

/**
 *
 * @author manuelmerida
 */
public class RoverPosition extends Position{

    private Direction direction;
    
    /**
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
     *
     * @return
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     *
     * @param direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    /**
     *
     */
    public void moveN(){
        setYpos(getYpos()+1);
    }
    
    /**
     *
     */
    public void moveS(){
        setYpos(getYpos()-1);
    }
    
    /**
     *
     */
    public void moveW(){
        setXpos(getXpos()-1);
    }
    
    /**
     *
     */
    public void moveE(){
        setXpos(getXpos()+1);
    }
    
}
