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
public class FuzzyIT {
    
    public FuzzyIT() {
    }

    /**
     * Test of value method, of class Fuzzy.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        double x = 0.0;
        Fuzzy instance = new FuzzyImpl();
        double expResult = 0.0;
        double result = instance.value(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of and method, of class Fuzzy.
     */
    @Test
    public void testAnd() {
        System.out.println("and");
        double lhs = 0.0;
        double rhs = 0.0;
        double expResult = 0.0;
        double result = Fuzzy.and(lhs, rhs);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of or method, of class Fuzzy.
     */
    @Test
    public void testOr() {
        System.out.println("or");
        double lhs = 0.0;
        double rhs = 0.0;
        double expResult = 0.0;
        double result = Fuzzy.or(lhs, rhs);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of not method, of class Fuzzy.
     */
    @Test
    public void testNot() {
        System.out.println("not");
        double lhs = 0.0;
        double expResult = 0.0;
        double result = Fuzzy.not(lhs);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FuzzyImpl extends Fuzzy {

        public double value(double x) {
            return 0.0;
        }
    }
    
}
