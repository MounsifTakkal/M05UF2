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
public class TaulellTest {
//    
//    public TaulellTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of adjacent method, of class Taulell.
//     */
//    @Test
//    public void testAdjacent() {
//        System.out.println("adjacent");
//        int fila = 0;
//        int col = 0;
//        Taulell instance = new Taulell();
//        int expResult = 0;
//        int result = instance.adjacent(fila, col);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of suma method, of class Taulell.
//     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int filaIni = 2;
        int filaFi = 3;
        int colIni = 4;
        int colFi = 6;
        Taulell instance = new Taulell();
        int expResult = 0;
        int result = instance.suma(filaIni, filaFi, colIni, colFi);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of ocupat method, of class Taulell.
//     */
//    @Test
//    public void testOcupat() {
//        System.out.println("ocupat");
//        int fila = 0;
//        int col = 0;
//        Taulell instance = new Taulell();
//        boolean expResult = false;
//        boolean result = instance.ocupat(fila, col);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of setCasella method, of class Taulell.
//     */
//    @Test
//    public void testSetCasella() {
//        System.out.println("setCasella");
//        int fila = 0;
//        int col = 0;
//        int v = 0;
//        Taulell instance = new Taulell();
//        boolean expResult = false;
//        boolean result = instance.setCasella(fila, col, v);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of imprimir method, of class Taulell.
//     */
//    @Test
//    public void testImprimir() {
//        System.out.println("imprimir");
//        Taulell instance = new Taulell();
//        instance.imprimir();
//    }
    
}
