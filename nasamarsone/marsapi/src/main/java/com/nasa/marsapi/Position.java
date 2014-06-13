/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi;

/**
 *
 * @author manuelmerida
 */
public class Position {
    private Integer xpos;
    private Integer ypos;

    public Position() {
    }
    
    /**
     *
     * @param xpos
     * @param ypos
     */
    public Position(Integer xpos, Integer ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }   

    public Integer getXpos() {
        return xpos;
    }

    public void setXpos(Integer xpos) {
        this.xpos = xpos;
    }

    public Integer getYpos() {
        return ypos;
    }

    public void setYpos(Integer ypos) {
        this.ypos = ypos;
    }    
}
