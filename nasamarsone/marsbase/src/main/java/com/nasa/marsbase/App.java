package com.nasa.marsbase;

import com.nasa.marsapi.comunicator.Transmisor;
import java.io.File;

/**
 * Hello BASE!
 *
 */
public class App 
{
    public static final boolean ACTIVE = true;
    public static void main(String[] args) throws Exception {
        String path = new File(".").getAbsolutePath();
        path = path.substring(0, path.length() - 1);
        //test in local
        //String path = "/Users/manuelmerida/nasamarsone/nasamarsone/tags/"+Constants.BASE_INPUT;      

        if (args.length > 0) {
            System.out.println("MarsBase ON!");               
            Transmisor transmisor = new BaseTransmisor();
            transmisor.start(path);
            System.out.println("Base transmisor started");
            
        } else {
            System.out.println("Oppss!!");
            System.out.println("Put a input to be executed by the base.");
        }

    }
    
    
}
