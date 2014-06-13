/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers;

import com.nasa.marsapi.AreaToExplore;
import com.nasa.marsapi.Direction;
import com.nasa.marsapi.Position;
import static com.nasa.marsrovers.MarsRover.RIGHT;
import com.nasa.marsrovers.movements.MovePosition;
import com.nasa.marsrovers.movements.RoverMovement;
import com.nasa.marsrovers.movements.TurnLeft;
import com.nasa.marsrovers.movements.TurnRight;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manuelmerida
 */
public class RoverOne implements MarsRover {

    private String input;
    private String output;
    private RoverPosition roverPosition;
    private List<RoverMovement> itinerary;

    public RoverOne() {
    }

    public RoverOne(String input) {
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        this.output = roverPosition.getXpos() + " " + roverPosition.getYpos() + " " + roverPosition.getDirection().facing;
        return output;
    }

    public String executeOrders() throws Exception {
        processInput();
        executeItinerary();
        return getOutput();
    }

    /**
     *
     * @throws Exception
     */
    private void processInput() throws Exception {
        String position = input.substring(0, 5);
        String orders = input.substring(5, input.length());
        System.out.println("Position: " + position);
        System.out.println("orders: " + orders);
        setRoverPosition(position);
        setItinerary(orders);
    }

    /**
     *
     * @param position
     * @throws Exception
     */
    private void setRoverPosition(String position) throws Exception {
        Integer xpos = Integer.parseInt(position.substring(0, 1));
        Integer ypos = Integer.parseInt(position.substring(2, 3));
        char facing = position.charAt(4);
        System.out.println("x: " + xpos + ", y: " + ypos + " facing: " + facing);
        roverPosition = new RoverPosition(xpos, ypos, new Direction(facing));
    }

    /**
     *
     * @param orders
     * @throws Exception
     */
    private void setItinerary(String orders) throws Exception {

        itinerary = new ArrayList();
        for (int i = 1; i < orders.length(); i++) {
            char order = orders.charAt(i);
            switch (order) {
                case MOVE:
                    itinerary.add(new MovePosition());
                    break;
                case LEFT:
                    itinerary.add(new TurnLeft());
                    break;
                case RIGHT:
                    itinerary.add(new TurnRight());
                    break;
                default:
                    break;
            }
        }
    }

    /*+
     * 
     */
    private void executeItinerary() throws Exception {
        for (int i = 0; i < itinerary.size(); i++) {
            RoverMovement movement = itinerary.get(i);
            movement.execute(this);
        }
    }

    public void turnLeft() {
        roverPosition.getDirection().toLeft();
    }

    public void turnRight() {
        roverPosition.getDirection().toRight();
    }

    public void movePosition() {

        switch (roverPosition.getDirection().facing) {
            case Direction.NORTH:
                roverPosition.moveN();
                break;
            case Direction.SOUTH:
                roverPosition.moveS();
                break;
            case Direction.EAST:
                roverPosition.moveE();
                break;
            case Direction.WEST:
                roverPosition.moveW();
                break;
            default:
                break;
        }
    }

    public boolean isPossibleItinerary(AreaToExplore area) {
        boolean isPossible = false;
        try {
            processInput();
            
            for (int i = 0; i < itinerary.size(); i++) {
                RoverMovement movement = itinerary.get(i);
                movement.execute(this);
                Position position = new Position(roverPosition.getXpos(), roverPosition.getYpos());
                isPossible = area.isPossibleMovement(position);
                if(!isPossible){
                    return isPossible;
                }                
            }
        } catch (Exception ex) {
            Logger.getLogger(RoverOne.class.getName()).log(Level.SEVERE, null, ex);           
        }      
        return isPossible;
    }
}
