package com.mycompany.junit.boletin.boletin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubscripcionTest {
    
    
    public SubscripcionTest() {
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of precioPorMes method, of class Subscripcion.
     */
    @Test
    public void testPrecioPorMes() {
        System.out.println("precioPorMes");
        Subscripcion instance = null;
        double expResult = 0.0;
        double result = instance.precioPorMes();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class Subscripcion.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        Subscripcion instance = null;
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
