/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi.comunicator;

/**
 * Comunication system in mars planet with NASA and inside the planet
 *
 * @author manuelmerida
 */
public interface MarsComunicator {

    /**
     * Send a message to the rover and receive output
     */
    public void messageToRover(String message) throws Exception;
    
    /**
     * Get a message from rover
     */
    public String messageFromRover() throws Exception;

    /**
     * Send a message to the base and receive output
     */
    public void messageToBase(String message) throws Exception;
    
    /**
     * Get a message from base
     */
    public String messageFromBase(String path) throws Exception;
    
    /**
     * Send a message to the nasa and receive output
     */
    public void messageToNasa(String message) throws Exception;
    
    /**
     * Get a message from nasa
     */
    public String messageFromNasa(String path) throws Exception;
    
    /**
     * Write the message content into the defined receiver
     * @param output
     * @param path
     * @throws Exception
     */
    public void writeOutput(String output, String path) throws Exception;
}
