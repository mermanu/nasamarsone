/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsbase;

import com.nasa.marsapi.marsareas.AreaToExplore;
import com.nasa.marsapi.Constants;
import com.nasa.marsapi.marsareas.Plateau;
import com.nasa.marsapi.positioning.Position;
import com.nasa.marsbase.exceptions.BaseException;
import com.nasa.marsbase.utils.InputParser;
import com.nasa.marsrovers.MarsRover;
import com.nasa.marsrovers.factory.RoverFactory;
import com.nasa.marsrovers.factory.RoverType;
import java.util.ArrayList;

/**
 * BaseOne implementation
 *
 * @author manuelmerida
 */
public class BaseOne implements MarsBase {

    private String input;
    private String output = "";
    private Position northSquare;
    private ArrayList ordersToRovers = new ArrayList();
    private InputParser inputParser = new InputParser();

    /**
     *
     * @param input
     */
    public BaseOne(String input) {
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    /**
     * 1) Parse the input string and set the position and orders variables
     * 2) Set the north right corner position of the plateau
     * 3) Set the orders to be processed by the rovers
     * 4) Iterate this orders and call the rovers to execute the orders one by one
     * 5) Return the rovers position
     */
    public String execute() throws BaseException {

        try {
            String position = input.substring(0, 3);
            String orders = input.substring(3, input.length());

            this.setNorthSquare(position);
            ordersToRovers = inputParser.getOrdersToRovers(orders);

            for (int i = 0; i < ordersToRovers.size(); i++) {
                String order = (String) ordersToRovers.get(i);
                
                if (isPossibleItinerary(order)) {
                    MarsRover mrover = RoverFactory.getRover(order, RoverType.ROVER_ONE);
                    output += mrover.executeOrders();
                    output += " ";
                }
            }
        } catch (Exception e) {
            throw new BaseException();
        }
        return output;
    }

    /**
     * Set the north right border coordinates of the area to explore by the
     * rovers
     *
     * @param position (X, Y) coordinates
     */
    private void setNorthSquare(String position) {
        Integer xpos = Integer.parseInt(position.substring(0, 1));
        Integer ypos = Integer.parseInt(position.substring(2, 3));
        northSquare = new Position(xpos, ypos);
    }

    /**
     * Calculate the rover trajectory and prevent collision with the borders of
     * the plateau
     *
     * @return boolean
     */
    private boolean isPossibleItinerary(String inputOrders) {
        MarsRover mrover = RoverFactory.getRover(inputOrders, RoverType.ROVER_ONE);
        AreaToExplore plateau = new Plateau(northSquare, Constants.SOUTH_SQUARE);
        return mrover.isPossibleItinerary(plateau);
    }
}
