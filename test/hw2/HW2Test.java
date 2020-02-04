/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HW2Test {
    
    public HW2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of high income
     */
    @Test
    public void testHighIncome() {
        double income = 45000;
        int numKids = 5;
        double expResult = 0.0; // The expected result
        double result = HW2.computeAssistance(income, numKids);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testMidIncomeManyKids() {
        double income = 35000;
        int numKids = 5;
        double expResult = 5*1000.0; // The expected result
        double result = HW2.computeAssistance(income, numKids);
        assertEquals(expResult, result, 0.0);
    }
    
}
