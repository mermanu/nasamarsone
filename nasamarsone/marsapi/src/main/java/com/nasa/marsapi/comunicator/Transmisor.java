/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi.comunicator;

/**
 * Transmisor implementation
 *
 * @author manuelmerida
 */
public interface Transmisor {

    /**
     * This starts the transmisor of the object, need to be a process that never
     * ends, waiting for entry messages
     *
     * @param path
     * @throws Exception
     */
    public void start(String path) throws Exception;
}
