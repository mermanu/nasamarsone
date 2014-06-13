/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi;

/**
 *
 * @author manuelmerida
 */
public class Direction {
    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final char EAST = 'E';
    public static final char WEST = 'W';
    public char facing;
    
    public Direction(char facing) {
        this.facing = facing;
    }
    
    public void toLeft(){
        switch (facing){
            case NORTH :
                facing = WEST;
                break;
            case SOUTH :
                facing = EAST;
                break;
            case WEST :
                facing = SOUTH;
                break;
            case EAST :                         
                facing = NORTH;
                break;
        }
    }
    
    public void toRight(){
        switch (facing){
            case NORTH :
                facing = EAST;
                break;
            case SOUTH :
                facing = WEST;
                break;
            case WEST :
                facing = NORTH;
                break;
            case EAST :                         
                facing = SOUTH;
                break;
        }
    }   
}
