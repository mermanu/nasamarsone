/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nasa.marsbase.factory;

import com.nasa.marsbase.BaseOne;
import com.nasa.marsbase.MarsBase;

/**
 * Base factory, make a base instance
 *
 * @author manuelmerida
 */
public class BaseFactory {

    /**
     * Get a base Instance by type
     * @param input Input string with the coordinates of the right north border
     * of area to explore, and all orders to do by the rovers
     * @param base Type of base to be created
     * @return MarsBase
     */
    public static MarsBase getBase(String input, BaseType base) {
        MarsBase marsBase = null;
        switch (base) {
            case BASE_ONE:
                marsBase = new BaseOne(input);
                break;
            default:
                break;
        }
        return marsBase;
    }
}
