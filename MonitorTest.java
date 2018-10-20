package hackupc2018;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MonitorTest {
    
    public MonitorTest() {
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
    public void testAssignar_boolean() {
        System.out.println("assignar");
        boolean b = true;
        Monitor moni = new Monitor("Aniol", 21, false);
        moni.assignar(b);
        boolean b2 = moni.assignat();
        assertEquals(b, b2);
    }

    /**
     * Test of setNom method, of class Monitor.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String s = "Aniol";
        Monitor moni = new Monitor("Oriol", 21, false);
        moni.setNom(s);
        String s2 = moni.getNom();
        assertEquals(s, s2);
    }

    /**
     * Test of assignat method, of class Monitor.
     */
    @Test
    public void testAssignat() {
        System.out.println("assignat");
        Monitor moni = new Monitor("Aniol", 21, false);
        boolean expResult = false;
        boolean result = moni.assignat();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNom method, of class Monitor.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Monitor moni = new Monitor("Aniol", 21, false);
        String expResult = "Aniol";
        String result = moni.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEdat method, of class Monitor.
     */
    @Test
    public void testSetEdat() {
        System.out.println("setEdat");
        Integer edat = 84;
        Monitor moni = new Monitor("Aniol", 21, false);
        moni.setEdat(edat);
        Integer edat2 = moni.getEdat();
        assertEquals(edat, edat2);
    }

    /**
     * Test of getEdat method, of class Monitor.
     */
    @Test
    public void testGetEdat() {
        System.out.println("getEdat");
        Monitor moni = new Monitor("Aniol", 21, false);
        Integer expResult = 21;
        Integer result = moni.getEdat();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitulat method, of class Monitor.
     */
    @Test
    public void testSetTitulat() {
        System.out.println("setTitulat");
        Boolean titulat = true;
        Monitor moni = new Monitor("Aniol", 21, false);
        moni.setTitulat(titulat);
        Boolean titulat2 = moni.getTitulat();
        assertEquals(titulat, titulat2);
    }

    /**
     * Test of getTitulat method, of class Monitor.
     */
    @Test
    public void testGetTitulat() {
        System.out.println("getTitulat");
        Monitor moni = new Monitor("Aniol", 21, true);
        Boolean expResult = true;
        Boolean result = moni.getTitulat();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDomini method, of class Monitor.
     */
    @Test
    public void testGetDomini() { //FALTA ACABAR-LA
        System.out.println("getDomini");
        Monitor moni = new Monitor("Aniol", 21, false);
        String s1 = "Colla 1";
        String s2 = "Colla 2";
        HashMap<String, Colla>
        moni.crearDomini()
        ArrayList expResult = null;
        ArrayList result = instance.getDomini();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonisNo method, of class Monitor.
     */
    @Test
    public void testSetMonisNo() {
        System.out.println("setMonisNo");
        String s1 = "Jordi";
        String s2 = "Oriol";
        ArrayList monisNo = new ArrayList<>(2);
        monisNo.set(0, s1);
        monisNo.set(1, s2);
        Monitor moni = new Monitor("Aniol", 21, false);
        moni.setMonisNo(monisNo);
        ArrayList monisNO2 = moni.getMonisNo();
        assertEquals(monisNo, monisNO2);
    }

    /**
     * Test of getMonisNo method, of class Monitor.
     */
    @Test
    public void testGetMonisNo() {
        System.out.println("getMonisNo");
        Monitor moni = new Monitor("Aniol", 21, false);
        ArrayList monisNo = new ArrayList<>(2);
        monisNo.set(0, "Jordi");
        monisNo.set(1, "Oriol");
        moni.setMonisNo(monisNo);
        ArrayList expResult = monisNo;
        ArrayList result = moni.getMonisNo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCollesNo method, of class Monitor.
     */
    @Test
    public void testSetCollesNo() {
        System.out.println("setCollesNo");
        ArrayList collesNo = new ArrayList<>(2);
        collesNo.set(0, "nens petits");
        collesNo.set(1, "nens grans");
        Monitor moni = new Monitor("Aniol", 21, false);
        moni.setCollesNo(collesNo);
        ArrayList collesNo2 = moni.getCollesNo();
        assertEquals(collesNo, collesNo2);        
    }

    /**
     * Test of getCollesNo method, of class Monitor.
     */
    @Test
    public void testGetCollesNo() {
        System.out.println("getCollesNo");
        Monitor moni = new Monitor("Aniol", 21, false);
        ArrayList collesNo = new ArrayList<>(2);
        collesNo.set(0, "nens petits");
        collesNo.set(1, "nens grans");
        moni.setCollesNo(collesNo);
        ArrayList expResult = collesNo;
        ArrayList result = moni.getCollesNo();
        assertEquals(expResult, result);
    }

    /**
     * Test of crearDomini method, of class Monitor.
     */
    @Test
    public void testCrearDomini() { //Falta
        System.out.println("crearDomini");
        HashMap<String, Colla> colles = null;
        Monitor instance = null;
        instance.crearDomini(colles);

    }

    /**
     * Test of Assignar method, of class Monitor.
     */
    @Test
    public void testAssignar_Colla() {
        System.out.println("Assignar");
        Colla c = new Colla("nens petits", true);
        Monitor moni = new Monitor("Aniol", 21, false);
        miPair<Monitor, Colla> expResult = new miPair(moni, c);
        miPair<Monitor, Colla> result = moni.Assignar(c);
        assertEquals(expResult, result);

    }
    
}
