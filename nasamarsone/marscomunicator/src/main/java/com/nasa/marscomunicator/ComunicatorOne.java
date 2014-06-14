/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marscomunicator;

import com.nasa.marsbase.MarsBase;
import com.nasa.marsrovers.MarsRover;

/**
 *
 * @author manuelmerida
 */
public class ComunicatorOne implements MarsComunicator{

    public String messageToRover(String input, MarsRover rover) throws Exception {
        rover.setInput(input);
        return rover.executeOrders();
    }

    public String messageToBase(String input, MarsBase base) throws Exception {
        base.setInput(input);
        return base.execute();
    }
    
    
}
