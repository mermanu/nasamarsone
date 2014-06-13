/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsbase.utils;

import com.nasa.marsapi.Constants;
import com.nasa.marsbase.exceptions.InputParseException;
import java.util.ArrayList;

/**
 *
 * @author manuelmerida
 */
public class InputParser {
    
    private ArrayList ordersToRovers = new ArrayList();
    
    /**
     * Parse the entry input to set the orders to the rovers
     *
     * @param orders
     */
    public ArrayList getOrdersToRovers(String orders) throws InputParseException{

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
                if (val == Constants.LEFT || val == Constants.RIGHT || val == Constants.MOVE) {
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
        return ordersToRovers;
    }
    
}
