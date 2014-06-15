/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsapi.comunicator;

import com.nasa.marsapi.Constants;
import java.io.File;

/**
 * ComunicatorOne implementation
 *
 * @author manuelmerida
 */
public class ComunicatorOne implements MarsComunicator {

    private String path = null;

    public ComunicatorOne() {
        path = new File(".").getAbsolutePath();
        path = path.substring(0, path.length() - 1);
    }

    public void messageToRover(String message) throws Exception {
        FileReader.setFileContent(message, path + Constants.ROVER_INPUT);
    }

    public void messageToBase(String message) throws Exception {
        FileReader.setFileContent(message, path + Constants.BASE_INPUT);
    }

    public void messageToNasa(String message) throws Exception {
        FileReader.setFileContent(message, path + Constants.NASA_INPUT);
    }

    public String messageFromRover() throws Exception {
        return FileReader.getFileContent(path + Constants.ROVER_OUTPUT);
    }

    public String messageFromBase(String path) throws Exception {
        return FileReader.getFileContent(path + Constants.ROVER_INPUT);
    }

    public String messageFromNasa(String path) throws Exception {
        return FileReader.getFileContent(path + Constants.BASE_INPUT);
    }

    public void writeOutput(String output, String outputFile) throws Exception {
        FileReader.setFileContent(output, path + outputFile);
    }
}
