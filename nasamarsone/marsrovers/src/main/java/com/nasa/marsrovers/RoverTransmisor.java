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
 * RoverTransmnisor is waiting for entry messages continuously
 *
 * @author manuelmerida
 */
public class RoverTransmisor implements Transmisor {

    /**
     * Starts the communicator and begin to look for any string input from the
     * base when this find any input then executed the orders contained into
     * this and returns the output
     *
     */
    public void start(String path) throws Exception {
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
