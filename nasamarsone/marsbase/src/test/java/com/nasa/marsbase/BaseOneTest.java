/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsbase;

import junit.framework.TestCase;

/**
 *
 * @author manuelmerida
 */
public class BaseOneTest extends TestCase {
    
    public BaseOneTest(String testName) {
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
     * Test of execute method, of class BaseOne.
     */
    public void testExecute() throws Exception {
        System.out.println("execute");
        BaseOne instance = new BaseOne("5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM 1 4 E LRMMRMMRMRRM 3 3 E MMRMMRMRRM 1 2 N LMLMLMLMM");
        String expResult = "1 3 N 5 1 E 3 2 E 5 1 E 1 3 N";
        String result = instance.execute();
        assertEquals(expResult, result);
        System.out.println("Result:"+result);
    }
}
