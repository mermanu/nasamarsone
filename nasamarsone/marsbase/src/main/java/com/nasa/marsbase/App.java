package com.nasa.marsbase;

import com.nasa.marsbase.factory.BaseFactory;
import com.nasa.marsbase.factory.BaseType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {   
        if (args.length > 0) {
            System.out.println("MarsBase ON!");
            MarsBase mrbase = BaseFactory.getBase(args[0], BaseType.BASE_ONE);
            String output = mrbase.execute();
            System.out.println("MarsBase Output to NASA: " + output);
        } else {
            System.out.println("Oppss!!");
            System.out.println("Put a input to be executed by the base.");
        }
    }
}
