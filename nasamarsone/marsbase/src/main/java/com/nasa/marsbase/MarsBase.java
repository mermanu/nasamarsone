/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsbase;

/**
 * MarsBase that get the input from NASA and processed this to make move orders
 * to his rovers for explore a mars area
 *
 * @author manuelmerida
 */
public interface MarsBase {

    /**
     * Get the input and execute the orders to his rovers
     *
     * @return String output with final position of his rovers
     * @throws Exception
     */
    public String execute() throws Exception;

    /**
     * Set the input to be processed by the base
     *
     * @param input
     */
    public void setInput(String input);
}
