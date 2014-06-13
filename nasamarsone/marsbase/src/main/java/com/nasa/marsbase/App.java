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
        MarsBase mrbase = BaseFactory.getBase("5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM 1 4 E LRMMRMMRMRRM 3 3 E MMRMMRMRRM 1 2 N LMLMLMLMM", BaseType.BASE_ONE);
        String output = mrbase.execute();
        System.out.println("MarsBase Output to NASA: " + output);
    }
}
