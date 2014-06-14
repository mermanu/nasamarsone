/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers;

import com.nasa.marsapi.Constants;
import com.nasa.marsapi.comunicator.ComunicatorOne;
import com.nasa.marsapi.comunicator.MarsComunicator;
import com.nasa.marsapi.comunicator.Transmisor;
import static com.nasa.marsrovers.App.ACTIVE;
import com.nasa.marsrovers.factory.RoverFactory;
import com.nasa.marsrovers.factory.RoverType;

/**
 *
 * @author manuelmerida
 */
public class RoverTransmisor implements Transmisor{

    public void start(String path) throws Exception{
        MarsComunicator comunicator = new ComunicatorOne();
        while (ACTIVE) {            
            String input = comunicator.messageFromBase(path);
            if (input != null && !input.equals("")) {
                System.out.println("Input to RoverOne: " + input);
                MarsRover rover = RoverFactory.getRover(input, RoverType.ROVER_ONE);
                String output = rover.executeOrders();
                comunicator.writeOutput(output, Constants.ROVER_OUTPUT);
                System.out.println("RoverOne Output to BASE: " + output);
                comunicator.messageToRover("");
            }
            Thread.sleep(4 * 1000);
        }
    }
    
}
