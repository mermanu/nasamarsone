/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsbase;

import com.nasa.marsapi.comunicator.ComunicatorOne;
import com.nasa.marsapi.comunicator.MarsComunicator;
import com.nasa.marsapi.comunicator.Transmisor;
import static com.nasa.marsbase.App.ACTIVE;
import com.nasa.marsbase.factory.BaseFactory;
import com.nasa.marsbase.factory.BaseType;

/**
 * Transmisor implementation of the base
 *
 * @author manuelmerida
 */
public class BaseTransmisor implements Transmisor {

    private MarsComunicator comunicator = new ComunicatorOne();

    /**
     * Starts the comunicator and begin to look for some input, if receive one
     * this is processed and the message for each rover is send
     *
     * @param path
     * @throws Exception
     */
    public void start(String path) throws Exception {
        while (ACTIVE) {
            String input = comunicator.messageFromNasa(path);
            if (input != null && !input.equals("")) {
                System.out.println("Input to BaseOne: " + input);
                MarsBase mrbase = BaseFactory.getBase(input, BaseType.BASE_ONE);
                String output = mrbase.execute();
                comunicator.messageToNasa(output);
                System.out.println("MarsBase Output to NASA: " + output);
                comunicator.messageToBase("");
            }
            Thread.sleep(4 * 1000);
        }
    }
}
