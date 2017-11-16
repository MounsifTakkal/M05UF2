/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mounsif Takkal somsistema.com
 */
public class BinaryTest {
    
    public BinaryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Validar method, of class Binary.
     */
    @Test
    public void testValidar() {
        System.out.println("Validar");
        Binary instance = new Binary("1|0");
        boolean expResult = false;
        boolean result = instance.Validar();
        assertEquals(expResult, result);
    }
    
}
