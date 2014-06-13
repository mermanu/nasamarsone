package com.nasa.marsbase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        MarsBase mrbase = new Base("5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM 1 4 E LRMMRMMRMRRM 3 3 E MMRMMRMRRM 1 2 N LMLMLMLMM");
        String output = mrbase.execute();
        System.out.println("Output: " + output);
    }
}
