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
public class PartitTest {
    
    public PartitTest() {
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
     * Test of Guanyador method, of class Partit.
     */
    @Test
    public void testGuanyador() {
        System.out.println("Guanyador");
        Partit instance = new Partit("Barça","Madrid");
        String expResult = "";
        String result = instance.Guanyador();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of setJugat method, of class Partit.
//     */
//    @Test
//    public void testSetJugat() {
//        System.out.println("setJugat");
//        boolean jugat = false;
//        Partit instance = null;
//        instance.setJugat(jugat);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getJugat method, of class Partit.
//     */
//    @Test
//    public void testGetJugat() {
//        System.out.println("getJugat");
//        Partit instance = null;
//        boolean expResult = false;
//        boolean result = instance.getJugat();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEquipLocal method, of class Partit.
//     */
//    @Test
//    public void testGetEquipLocal() {
//        System.out.println("getEquipLocal");
//        Partit instance = null;
//        String expResult = "";
//        String result = instance.getEquipLocal();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEquipVisitant method, of class Partit.
//     */
//    @Test
//    public void testGetEquipVisitant() {
//        System.out.println("getEquipVisitant");
//        Partit instance = null;
//        String expResult = "";
//        String result = instance.getEquipVisitant();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setResultat method, of class Partit.
//     */
//    @Test
//    public void testSetResultat() {
//        System.out.println("setResultat");
//        int puntsLocal = 0;
//        int puntsVisitant = 0;
//        Partit instance = null;
//        instance.setResultat(puntsLocal, puntsVisitant);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getGolsLocal method, of class Partit.
//     */
//    @Test
//    public void testGetGolsLocal() {
//        System.out.println("getGolsLocal");
//        Partit instance = null;
//        int expResult = 0;
//        int result = instance.getGolsLocal();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getGolsVisitant method, of class Partit.
//     */
//    @Test
//    public void testGetGolsVisitant() {
//        System.out.println("getGolsVisitant");
//        Partit instance = null;
//        int expResult = 0;
//        int result = instance.getGolsVisitant();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
