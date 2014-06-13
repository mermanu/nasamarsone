/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi;

/**
 *
 * @author manuelmerida
 */
public class Plateau implements AreaToExplore{
    
    private Position nortPosition;
    private Position southPosition;

    public Plateau(Position nortPosition, Position southPosition) {
        this.nortPosition = nortPosition;
        this.southPosition = southPosition;
    }  
         
    public Position getNorthSquare(Position position){
        Integer ypos = position.getYpos();
        position.setYpos(ypos++);
        return position;
    }   

    public boolean isPossibleMovement(Position roverMovement) {       
        if(roverMovement.getXpos()<southPosition.getXpos() || roverMovement.getYpos()<southPosition.getYpos()){
            return false;
        }
        if(roverMovement.getXpos()>nortPosition.getXpos() || roverMovement.getYpos()>nortPosition.getYpos()){
            return false;
        }            
        return true;    
    } 
}
