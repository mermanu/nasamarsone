/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsrovers;

import com.nasa.marsapi.marsareas.AreaToExplore;
import junit.framework.TestCase;
import com.nasa.marsapi.Constants;
import com.nasa.marsapi.marsareas.Plateau;
import com.nasa.marsapi.positioning.Position;

/**
 *
 * @author manuelmerida
 */
public class RoverOneTest extends TestCase {
    
    public RoverOneTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of executeOrders method, of class RoverOne.
     */
    public void testExecuteOrders() throws Exception {
        System.out.println("executeOrders");
        RoverOne instance = new RoverOne("3 3 E MMRMMRMRRM");
        String expResult = "5 1 E";
        String result = instance.executeOrders();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPossibleItinerary method, of class RoverOne.
     */
    public void testIsPossibleItineraryTrue() {
        System.out.println("isPossibleItinerary");
        AreaToExplore area = new Plateau(new Position(5, 5), Constants.SOUTH_SQUARE);
        RoverOne instance = new RoverOne("3 3 E MMRMMRMRRM");
        boolean expResult = true;
        boolean result = instance.isPossibleItinerary(area);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPossibleItinerary method, of class RoverOne.
     */
    public void testIsPossibleItineraryFalse() {
        System.out.println("isPossibleItinerary");
        AreaToExplore area = new Plateau(new Position(5, 5), Constants.SOUTH_SQUARE);
        RoverOne instance = new RoverOne("8 3 E MMRMMRMRRM");
        boolean expResult = false;
        boolean result = instance.isPossibleItinerary(area);
        assertEquals(expResult, result);
    }
}
