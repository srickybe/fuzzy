/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fl;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author srick
 */
public class TrapezoidIT {
    
    public TrapezoidIT() {
    }

    /**
     * Test of value method, of class Trapezoid.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        double x = 0.0;
        Trapezoid instance = null;
        double expResult = 0.0;
        double result = instance.value(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
