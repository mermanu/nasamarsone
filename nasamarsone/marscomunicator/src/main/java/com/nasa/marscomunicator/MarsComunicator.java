/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marscomunicator;

import com.nasa.marsbase.MarsBase;
import com.nasa.marsrovers.MarsRover;

/**
 * Comunication system in mars planet with NASA and inside the planet
 * @author manuelmerida
 */
public interface MarsComunicator {

    /**
     * Send a message to the rover and receive output
     * @param input
     * @param rover
     * @return
     */
    public String messageToRover(String input, MarsRover rover) throws Exception;

    /**
     * Send a message to the base and receive output
     * @param input
     * @param base
     * @return
     */
    public String messageToBase(String input, MarsBase base) throws Exception;
}
