/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsbase;

import com.nasa.marsapi.AreaToExplore;
import com.nasa.marsapi.Plateau;
import com.nasa.marsapi.Position;
import com.nasa.marsrovers.MarsRover;
import com.nasa.marsrovers.RoverOne;
import java.util.ArrayList;

/**
 *
 * @author manuelmerida
 */
public class Base implements MarsBase {

    private String input;
    private String output = "";
    private Position northSquare;
    private Position southSquare = new Position(0, 0);
    private ArrayList ordersToRovers = new ArrayList();
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    public static final char MOVE = 'M';

    /**
     *
     * @param input
     */
    public Base(String input) {
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String execute() throws Exception {
        String position = input.substring(0, 3);
        String orders = input.substring(3, input.length());

        setNorthSquare(position);
        setOrdersToRovers(orders);

        System.out.println("Position: " + position);
        System.out.println("Orders: " + orders);

        for (int i = 0; i < ordersToRovers.size(); i++) {
            String order = (String) ordersToRovers.get(i);
            if (isPossibleItinerary(order)) {
                MarsRover mrover = new RoverOne(order);
                output += mrover.executeOrders();
                output += " ";
            }
        }
        return output;
    }

    /**
     *
     * @param position
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
        MarsRover mrover = new RoverOne(inputOrders);
        AreaToExplore plateau = new Plateau(northSquare, southSquare);
        return mrover.isPossibleItinerary(plateau);
    }
    
    /**
     * Parse the entry input to set the orders to the rovers
     *
     * @param orders
     */
    private void setOrdersToRovers(String orders) throws Exception{

        String[] tmp = orders.split("\\s+");
        String order = "";
        ArrayList otr = new ArrayList();
        int cnt = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (cnt < 4) {
                order += " ";
                order += tmp[i];
            } else {
                char val = tmp[i].charAt(0);
                if (val == LEFT || val == RIGHT || val == MOVE) {
                    otr.add(tmp[i].trim());
                    cnt = 0;
                }
            }
            if (cnt == 3) {
                otr.add(order.trim());
                order = "";
            }
            cnt++;

        }
        cnt = 0;
        order = "";
        for (int i = 0; i < otr.size(); i++) {
            if (cnt < 2) {
                order += " ";
                order += otr.get(i);
                cnt++;
            }
            if (cnt == 2) {
                ordersToRovers.add(order.trim());
                order = "";
                cnt = 0;
            }

        }
        for (int i = 0; i < ordersToRovers.size(); i++) {
            System.out.println("AnOrder: " + ordersToRovers.get(i));
        }
    }

}
