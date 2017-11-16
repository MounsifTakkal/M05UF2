/*
 * Mounsif Takkal,
 * somsistema.com
 * 2017
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
 * Per a la elaboració de les proves unitaries 
 * he tingut en compte els valors FRONTERA, 
 * en aquest cas -1, 0, 1, 100 i 101
 */
public class PilaTest {
    
    public PilaTest() {
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
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir0() {
        System.out.println("afegir 0, ha de retornar 0");
        int el = 0;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAfegir100() {
        System.out.println("afegir 100, ha de retornar 100");
        int el = 100;
        Pila instance = new Pila();
        for (int i = 0 ; i < el; i++){
            instance.afegir(i);
        }
        int expResult = 100;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAfegirMenys1() {
        System.out.println("afegir -1, ha de retornar 0");
        int el = -1;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAfegir1() {
        System.out.println("afegir 1, ha de retornar 1");
        int el = 1;
        Pila instance = new Pila();
        int expResult = 1;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAfegir101() {
        System.out.println("afegir 101, ha de retornar 0");
        int el = 101;
        Pila instance = new Pila();
        for (int i = 0 ; i < el; i++){
            instance.afegir(i);
        }
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
    }

    /**
     * Test of treure method, of class Pila.
     */
    @Test
    public void testTreure() {
        System.out.println("treure 1 amb una pila a 0, ha de retornar -1");
        Pila instance = new Pila();
        int expResult = -1;
        int result = instance.treure();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTreure10() {
        System.out.println("treure 1 amb una pila de 10, ha de retornar 9");
        Pila instance = new Pila();
        for (int i = 1 ; i < 10; i++){
            instance.afegir(i);
        }
        int expResult = 9;
        int result = instance.treure();
        assertEquals(expResult, result);
    }
    
}
