/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackupc2018;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class ControladorDominiTest {
    
    public ControladorDominiTest() {
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
     * Test of crearMonitor method, of class ControladorDomini.
     */
    @Test
    public void testCrearMonitor() {
        System.out.println("crearMonitor");
        ControladorDomini instance = new ControladorDomini();
        Boolean expResult = true;
        Boolean result = instance.crearMonitor("Aniol", 21, false);
        
        assertEquals(expResult, result);

    }

    /**
     * Test of eliminarMonitor method, of class ControladorDomini.
     */
    @Test
    public void testEliminarMonitor() {
        System.out.println("eliminarMonitor");
        String nomMonitor = "Aniol Gamiz";
        ControladorDomini instance = new ControladorDomini();
        instance.eliminarMonitor(nomMonitor);
        Boolean resultatEsperat = false;
        Boolean resultat = instance.existeixMonitor(nomMonitor);
        assertEquals(resultatEsperat, resultat);
    }

    /**
     * Test of assignarMonisNo method, of class ControladorDomini.
     */
    @Test
    public void testAssignarMonisNo() {
        System.out.println("assignarMonisNo");
        String s1 = "Aniol";
        int edat = 21;
        Boolean titol = false;
        Monitor moniP = new Monitor(s1, edat, titol);
        ArrayList monisNo = new ArrayList<> (2);
        monisNo.add("Jordi");
        monisNo.add("Oriol");
        ControladorDomini instance = new ControladorDomini();
        instance.crearMonitor(s1, edat, titol);
        instance.assignarMonisNo(moniP, monisNo);
        ArrayList result = instance.getMonitor(s1).getMonisNo();
        
        assertEquals(monisNo, result);
    }

    /**
     * Test of assignarCollesNo method, of class ControladorDomini.
     */
    @Test
    public void testAssignarCollesNo() {
        System.out.println("assignarCollesNo");
        Monitor moniP = new Monitor("Aniol", 21, false);
        ArrayList collesNo = new ArrayList<> (2);
        collesNo.add("Nens petits");
        collesNo.add("Joves grans");
        ControladorDomini instance = new ControladorDomini();
        instance.crearMonitor("Aniol", 21, false);
        instance.assignarCollesNo(moniP, collesNo);
        ArrayList result = instance.getMonitor("Aniol").getCollesNo();
        
        assertEquals(collesNo, result);
    }

    /**
     * Test of crearColla method, of class ControladorDomini.
     */
    @Test
    public void testCrearColla() {
        System.out.println("crearColla");
        ControladorDomini instance = new ControladorDomini();
        Boolean expResult = instance.crearColla("Nens petits", true);
        Boolean result = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarColla method, of class ControladorDomini.
     */
    @Test
    public void testEliminarColla() {
        System.out.println("eliminarColla");
        String nomColla = "Nens petits";
        ControladorDomini instance = new ControladorDomini();
        instance.eliminarColla(nomColla);
        Boolean resultatEsperat = false;
        Boolean resultat = instance.existeixColla(nomColla);
        assertEquals(resultatEsperat, resultat);
    }

    /**
     * Test of setJaTeTitulat method, of class ControladorDomini.
     */
    @Test
    public void testSetJaTeTitulat() {
        System.out.println("setJaTeTitulat");
        Colla c = new Colla("nens petits", false);
        ControladorDomini instance = new ControladorDomini();
        instance.crearColla("nens petits", false);
        instance.setJaTeTitulat(c);
        Boolean esperat = true;
        Boolean solucio = instance.getColla("nens petits").getJaTeTitulat();
        assertEquals(esperat, solucio);
    }

    /**
     * Test of setJaNoTeTitulat method, of class ControladorDomini.
     */
    @Test
    public void testSetJaNoTeTitulat() {
        System.out.println("setJaNoTeTitulat");
        Colla c = new Colla("nens petits", true);
        ControladorDomini instance = new ControladorDomini();
        instance.crearColla("nens petits", true);
        instance.setJaNoTeTitulat(c);
        Boolean esperat = false;
        Boolean solucio = instance.getColla("nens petits").getJaTeTitulat();
        assertEquals(esperat, solucio);
    }

    /**
     * Test of getAllMonitors method, of class ControladorDomini.
     */
    @Test
    public void testGetAllMonitors() {
        System.out.println("getAllMonitors");
        ControladorDomini instance = new ControladorDomini();
        String s1 = "Aniol";
        String s2 = "Jordi";
        String s3 = "Oriol";
        int edat = 21;
        Boolean titol = false;
        Boolean b = instance.crearMonitor(s1, edat, titol);
        Boolean b2 = instance.crearMonitor(s2, edat, titol);
        Boolean b3 = instance.crearMonitor(s3, edat, titol);
        HashMap expResult = new HashMap();
        Monitor moni = new Monitor (s1, edat, titol);
        expResult.put(s1, moni);
        Monitor moni2 = new Monitor (s2, edat, titol);
        expResult.put(s2, moni2);
        Monitor moni3 = new Monitor (s3, edat, titol);
        expResult.put(s3, moni3);
        HashMap result = instance.getAllMonitors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllColles method, of class ControladorDomini.
     */
    @Test
    public void testGetAllColles() {
        System.out.println("getAllColles");
        ControladorDomini instance = new ControladorDomini();
        Boolean b = instance.crearColla("nens petits", true);
        Boolean b2 = instance.crearColla("adolescents", false);
        Boolean b3 = instance.crearColla("adults", false);
        HashMap expResult = new HashMap();
        Colla col = new Colla ("nens petits", true);
        expResult.put("nens petits", col);
        Colla col2 = new Colla ("adolescents", false);
        expResult.put("nens petits", col);
        Colla col3 = new Colla ("adults", false);
        expResult.put("nens petits", col);
        HashMap result = instance.getAllColles();
        assertEquals(expResult, result);
    }

    /**
     * Test of Assignar method, of class ControladorDomini.
     */
    @Test
    public void testAssignar() {
        System.out.println("Assignar");
        Monitor moni = new Monitor("Aniol", 21, false);
        Colla c = new Colla("nens petits", false);
        ControladorDomini instance = new ControladorDomini();
        miPair<Monitor, Colla> expResult = new miPair(moni, c);
        miPair<Monitor, Colla> result = instance.Assignar(moni, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of backtracking_cronologic method, of class ControladorDomini.
     */
    @Test
    public void testBacktracking_cronologic() {
        System.out.println("backtracking_cronologic");
        Monitor moni1 = new Monitor("Aniol", 21, false);
        ArrayList<String> monisno1 = new ArrayList<>(3);
        monisno1.add("Jordi");        
        moni1.setMonisNo(monisno1);
        Monitor moni2 = new Monitor("Jordi", 21, false);
        ArrayList<String> monisno2 = new ArrayList<>(3);
        monisno1.add("Oriol");        
        moni1.setMonisNo(monisno2);
        Monitor moni3 = new Monitor("Oriol", 21, false);
        ArrayList<String> monisno3 = new ArrayList<>(3);
        monisno1.add("Jordi");        
        moni1.setMonisNo(monisno3);
        ArrayList<Monitor> monitors_restants = new ArrayList<>(3);
        monitors_restants.add(moni1);
        monitors_restants.add(moni2);
        monitors_restants.add(moni3);
        
        ControladorDomini instance = new ControladorDomini();
        Boolean b = instance.crearMonitor("Aniol", 21, false);
        Boolean b1 = instance.crearMonitor("Jordi", 21, false);
        Boolean b2 = instance.crearMonitor("Oriol", 21, false);
        Boolean b3 = instance.crearColla("nens petits", false);
        Boolean b4 = instance.crearColla("adolescents", false);
        Boolean b5 = instance.crearColla("adults", false);
        Assignacio solucio = new Assignacio();
        
        
        Assignacio expResult = new Assignacio();
        Colla c1 = new Colla("nens petits", false);
        Colla c2 = new Colla("adolescents", false);
        Colla c3 = new Colla("adults", false);        
        miPair mipair1 = new miPair(moni1, c1);
        expResult.Afegir(mipair1);
        miPair mipair2 = new miPair(moni2, c2);
        expResult.Afegir(mipair2);
        miPair mipair3 = new miPair(moni3, c3);
        expResult.Afegir(mipair3);
        Assignacio result = instance.backtracking_cronologic(monitors_restants, solucio);
        assertEquals(expResult, result);
    }
    
}
