/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackupc2018;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oriolvidal
 */
public class CollaTest {
    
    public CollaTest() {
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
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "Petits";
        Colla instance = new Colla("grans");
        instance.setNom(nom);
        String expResult = "Petits";
        assertEquals(expResult, instance.getNom());
    }

    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Colla instance = new Colla("grans");
        String expResult = "grans";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNecessitaTitulat() {
        System.out.println("setNecessitaTitulat");
        Boolean necessitaTitulat = false;
        Colla instance = new Colla("grans");
        instance.setNecessitaTitulat(necessitaTitulat);
        Boolean expResult = false;
        assertEquals(expResult, instance.getNecessitaTitulat());
    }

    @Test
    public void testGetNecessitaTitulat() {
        System.out.println("getNecessitaTitulat");
        Colla instance = new Colla("grans", false);
        Boolean expResult = false;
        Boolean result = instance.getNecessitaTitulat();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetJaTeTitulat() {
        System.out.println("setJaTeTitulat");
        Boolean teTitulat = false;
        Colla instance = new Colla("grans", true);
        instance.setJaTeTitulat(teTitulat);
    }

    @Test
    public void testGetJaTeTitulat() {
        System.out.println("getJaTeTitulat");
        Colla instance = null;
        Boolean expResult = null;
        Boolean result = instance.getJaTeTitulat();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetJaNoTeTitulat() {
        System.out.println("getJaNoTeTitulat");
        Colla instance = null;
        Boolean expResult = null;
        Boolean result = instance.getJaNoTeTitulat();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
