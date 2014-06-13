/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsbase.utils;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author manuelmerida
 */
public class InputParserTest extends TestCase {
    
    public InputParserTest(String testName) {
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
     * Test of getOrdersToRovers method, of class InputParser.
     */
    public void testGetOrdersToRovers() throws Exception {
        System.out.println("getOrdersToRovers");
        String orders = " 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM 1 4 E LRMMRMMRMRRM 3 3 E MMRMMRMRRM 1 2 N LMLMLMLMM";
        InputParser instance = new InputParser();
        ArrayList expResult = new ArrayList();
        expResult.add("1 2 N LMLMLMLMM");
        expResult.add("3 3 E MMRMMRMRRM");
        expResult.add("1 4 E LRMMRMMRMRRM");
        expResult.add("3 3 E MMRMMRMRRM");
        expResult.add("1 2 N LMLMLMLMM");
        ArrayList result = instance.getOrdersToRovers(orders);
        assertEquals(expResult, result);
    }
}
