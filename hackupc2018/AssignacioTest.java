package hackupc2018;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssignacioTest {
    
    public AssignacioTest() {
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

    @Test
    public void testAfegir() {
        System.out.println("Afegir");
        miPair<Monitor, Colla> assig = new miPair(new Monitor("Oriol"), new Colla("grans"));
        Assignacio instance = new Assignacio();
        instance.Afegir(assig);
        Boolean expResult = false;
        Boolean result = instance.getDisribucio().isEmpty();
        assertEquals(expResult, result);
    }

    @Test
    public void testBorrar() {
        System.out.println("Borrar");
        Monitor m = new Monitor("Oriol");
        Assignacio instance = new Assignacio();
        miPair<Monitor, Colla> assig = new miPair(new Monitor("Oriol"), new Colla("grans"));
        instance.Afegir(assig);
        instance.Borrar(m);
        Boolean expResult = true;
        Boolean result = instance.getDisribucio().isEmpty();
        assertEquals(expResult, result);
    }

    @Test
    public void testEsFallo() {
        System.out.println("esFallo");
        Assignacio instance = new Assignacio();
        boolean expResult = false;
        boolean result = instance.esFallo();
        assertEquals(expResult, result);
    }

    @Test
    public void testFallo() {
        System.out.println("fallo");
        Assignacio instance = new Assignacio();
        instance.fallo();
        boolean expResult = true;
        boolean result = instance.esFallo();
        assertEquals(expResult, result);
    }
    
}
